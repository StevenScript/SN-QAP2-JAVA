package ProblemOneTwo;
// MyPoint.java
// This class represents a point in 2D space with x and y coordinates.

public class MyPoint {
    // Instance variables for x and y coordinates
    private int x;
    private int y;

    // Default constructor initializing point to (0,0)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor with specific x and y values
    // Allows setting the x and y coordinates when creating a new MyPoint object
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // GETTER method for x coordinate
    // Getters retrieve the value of a private attribute
    public int getX() {
        return x;
    }

    // SETTER method for x coordinate
    // setters set or update the value of a private attribute
    public void setX(int x) {
        this.x = x;
    }

    // GETTER method for y coordinate
    public int getY() {
        return y;
    }

    // SETTER method for y coordinate
    public void setY(int y) {
        this.y = y;
    }

    // Method to set both x and y coordinates
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get an array containing x and y
    public int[] getXY() {
        int[] xy = new int[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }

    // Override toString method to provide string representation of point
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Method to calculate distance from this point to another point specified by x and y coordinates
    public double distance(int x, int y) {
        int xDiff = this.x - x; // Difference in x coordinates
        int yDiff = this.y - y; // Difference in y coordinates
        // Calculate distance
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Method to calculate distance from this point to another MyPoint object
    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }

    // Method to calculate distance from this point to origin (0,0)
    public double distance() {        
        return distance(0, 0);
    }
}
