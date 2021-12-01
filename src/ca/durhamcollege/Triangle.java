package ca.durhamcollege;

public class Triangle extends Shape
{
    // private instance members

    // public properties
    public float getPerimeter()
    {
        var A = getEdges().get(0).getLength();
        var B = getEdges().get(1).getLength();
        var C = getEdges().get(2).getLength();

        return A + B + C;
    }

    @Override
    /**
     * Gets vertices from the vertices ArrayList and passes them to the getArea(p1, p2, p3) method.
     */
    public float getArea()
    {
        var A = getVertices().get(0);
        var B = getVertices().get(1);
        var C = getVertices().get(2);

        return getArea(A, B, C);
    }

    /**
     * Uses Heron's formula to calculate area. If zero is returned than points given are collinear
     */
    private float getArea(Vector2D p1, Vector2D p2, Vector2D  p3)
    {
        var A = new Line(p1, p2).getLength();
        var B = new Line(p2, p3).getLength();
        var C = new Line(p3, p1).getLength();

        var p = (A + B + C) / 2;

        return (float)(Math.sqrt(p * (p - A) * (p - B) * (p - C)));
    }

    // constructor(s)

    /**
     * Constructs a Triangle with three points (p1, p2, and p3)
     * @param p1 the first point
     * @param p2 the second point
     * @param p3 the third point
     */
    public Triangle(Vector2D p1, Vector2D p2, Vector2D p3) throws Exception {
        super();
        setVertices(p1, p2, p3);
    }

    /**
     * Constructs a Triangle from a Vector2D Array of points.
     * The Vector2D array must have a minimum size of 3 for this constructor to be used.
     *
     * @param vertices Vector2D Array to be passed to the constructor
     * @throws Exception throws an Exception if the size of the vertices array is less than 3
     */
    public Triangle(Vector2D[] vertices) throws Exception
    {
        super();
        if(vertices.length >= 3)
        {
            setVertices(vertices[0], vertices[1], vertices[2]);
        }
        else
        {
            throw new Exception("ERROR: Triangle constructed with less than 3 vertices");
        }
    }

    // private methods

    // public methods

    /**
     * Sets the values of the Vertices of the Triangle.
     * If values for these points already exist, they are overridden.
     *
     * @param p1 the first point
     * @param p2 the second point
     * @param p3 the third point
     */
    public void setVertices(Vector2D p1, Vector2D p2, Vector2D p3) throws Exception {
        Vector2D[] vertices = {p1, p2, p3};

        // check if any of the Vector2Ds are the same
        if ((p1.equals(p2)) || (p1.equals(p3)) || (p2.equals(p3)))
        {
            throw new Exception("ERROR: Triangle constructed with at least one vertex that is the same as another one.");
        }
        else if(getArea(p1, p2, p3) == 0)
        {
            throw new Exception("ERROR: Points provided for Triangle cannot be collinear");
        }
        else
        {
            super.setVertices(vertices);
        }
    }


    @Override
    public String toString()
    {
        String outputString = "";
        outputString += "--------------------------------\n";
        outputString += "Triangle \n";
        outputString += super.toString();
        outputString += "--------------------------------\n";
        outputString += "Perimeter      : " + getPerimeter() + "\n";
        outputString += "Area           : " + getArea() + "\n";
        outputString += "--------------------------------\n";

        return outputString;
    }

    @Override
    public void Draw()
    {
        System.out.println("Now Drawing Triangle!");
    }

    @Override
    public void Update()
    {

    }


}
