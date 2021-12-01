package ca.durhamcollege;

public class Triangle extends Shape
{
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

    // properties

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
        else
        {
            super.setVertices(vertices);
        }
    }



}
