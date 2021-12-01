package ca.durhamcollege;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Shape implements Drawable, Updatable, HasArea
{
    // private instance variables (composition)
    private ArrayList<Vector2D> vertices;
    private ArrayList<Line> edges;

    // public properties
    public void setVertices(Vector2D[] vertices)
    {
        build(vertices);
    }

    public void setVertex(Vector2D vertex)
    {
        Vector2D[] vertices = {vertex};
        build(vertices);
    }

    // private / protected properties
    protected ArrayList<Vector2D> getVertices()
    {
        return vertices;
    }

    protected ArrayList<Line> getEdges()
    {
        return edges;
    }

    // constructors

    // Empty Constructor
    Shape()
    {
        initialize();
        vertices.add(Vector2D.zero());
        edges.add(new Line());
    }

    // Parameterized Constructor
    Shape(Vector2D[] vertices)
    {
        initialize();
        setVertices(vertices);
    }

    // private methods

    /**
     * Initializes two empty ArrayLists to be used for the Shape Class
     */
    private void initialize()
    {
        vertices = new ArrayList<Vector2D>();
        edges = new ArrayList<Line>();
    }


    private void build(Vector2D[] vertices)
    {
        this.vertices.clear();
        this.edges.clear();

        // add all vertices to the shape
        for (int i = 0; i < vertices.length; i++)
        {
            this.vertices.add(vertices[i]);
        }

        // build edges
        for (int i = 0; i < this.vertices.size(); i++)
        {
            if(i < this.vertices.size() - 1)
            {
                this.edges.add(new Line(this.vertices.get(i), this.vertices.get(i+1)));
            }
            else
            {
                this.edges.add(new Line(this.vertices.get(i), this.vertices.get(0)));
            }
        }
    }

    // public methods

    @Override
    public String toString()
    {
        String outputString = "";
        outputString += "--------------------------------\n";
        outputString += "Vertices: \n";
        outputString += "--------------------------------\n";
        for ( var vertex: vertices )
        {
            outputString += vertex.toString() + "\n";
        }
        outputString += "--------------------------------\n";
        outputString += "Edges: \n";
        outputString += "--------------------------------\n";
        for ( var edge: edges )
        {
            outputString += edge.toString() + "\n";
        }

        return outputString;
    }

}
