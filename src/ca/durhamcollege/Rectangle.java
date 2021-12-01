package ca.durhamcollege;

public class Rectangle  extends Shape
{
    // private instance members (fields)
    private Vector2D start;
    private float width;
    private float height;

    // public properties
    public Vector2D getStart()
    {
        return start;
    }

    public void setStart(Vector2D start)
    {
        this.start = start;
        set(start, this.width, this.height);
    }

    public float getWidth()
    {
        return width;
    }

    public void setWidth(float width)
    {
        this.width = width;
        set(start, this.width, this.height);
    }

    public float getHeight()
    {
        return height;
    }

    public void setHeight(float height)
    {
        this.height = height;
        set(start, this.width, this.height);
    }

    public float getPerimeter()
    {
        return (width + height) * 2.0f;
    }

    @Override
    public float getArea()
    {
        return (width * height);
    }

    public boolean isSquare()
    {
        return (width == height);
    }

    // constructor(s)
    public Rectangle(Vector2D start, float width, float height)
    {
        super();
        this.start = start;
        this.width = width;
        this.height = height;
        set(start, width, height);
    }

    // private methods

    // public methods
    public void set(Vector2D start, float width, float height)
    {
        Vector2D[] vertices = {
                start,
                new Vector2D(start.getX() + width, start.getY()),
                new Vector2D(start.getX() + width, start.getY() + height),
                new Vector2D(start.getX(),start.getY() + height),
        };
        super.setVertices(vertices);
    }

    @Override
    public String toString()
    {
        String outputString = "";
        outputString += "--------------------------------\n";
        outputString += "Rectangle \n";
        outputString += super.toString();
        outputString += "--------------------------------\n";
        outputString += "Perimeter      : " + getPerimeter() + "\n";
        outputString += "Area           : " + getArea() + "\n";
        outputString += "Square?        : " + isSquare() + "\n";
        outputString += "--------------------------------\n";

        return outputString;
    }


    @Override
    public void Draw()
    {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public void Update()
    {

    }
}
