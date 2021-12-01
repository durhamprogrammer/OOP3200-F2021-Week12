package ca.durhamcollege;

public class Circle extends Shape
{
    // private instance members
    private Vector2D center;
    private float radius;

    // public properties
    public Vector2D getCenter()
    {
        return center;
    }

    public void setCenter(Vector2D center)
    {
        super.setVertex(center);
        this.center = center;
    }

    public float getRadius()
    {
        return radius;
    }

    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    public void set(Vector2D center, float radius)
    {
        setCenter(center);
        setRadius(radius);
    }

    public float getCircumference()
    {
        return (float) (Math.PI * radius * 2);
    }

    @Override
    public float getArea()
    {
        return (float) Math.pow (Math.PI * radius, 2);
    }

    // constructor
    public Circle(Vector2D center, float radius)
    {
        super();
        set(center, radius);
    }

    // private methods

    // public methods
    @Override
    public String toString()
    {
        String outputString = "";
        outputString += "--------------------------------\n";
        outputString += "Circle \n";
        outputString += "--------------------------------\n";
        outputString += "Center         : " + getCenter() + "\n";
        outputString += "Radius         : " + getRadius() + "\n";
        outputString += "Area           : " + getArea() + "\n";
        outputString += "Circumference  : " + getCircumference() + "\n";
        outputString += "--------------------------------\n";

        return outputString;
    }

    @Override
    public void Draw()
    {
        System.out.println("Now Drawing Circle!");
    }

    @Override
    public void Update()
    {

    }
}
