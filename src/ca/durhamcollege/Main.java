package ca.durhamcollege;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Shape> shapes =  new ArrayList<Shape>(); // empty collection


        try
        {
            shapes.add(new Circle(new Vector2D(10, 20), 20));
            shapes.add(new Triangle(new Vector2D(30, 40), new Vector2D(50, 60), new Vector2D(70, 85)));
            shapes.add(new Rectangle(new Vector2D(90, 100), 40.0f, 40.0f));

            // print shapes
            for (var shape: shapes)
            {
                System.out.println(shape);
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}
