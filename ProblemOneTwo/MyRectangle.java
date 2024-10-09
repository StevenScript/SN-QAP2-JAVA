package ProblemOneTwo;
// MyRectangle.java
// This class represents a rectangle defined by its top-left and bottom-right corners using MyPoint instances.

public class MyRectangle {
    // Instance variables for the top-left and bottom-right corners
    private MyPoint topLeft;       // Top-left corner of the rectangle
    private MyPoint bottomRight;   // Bottom-right corner of the rectangle

    // Default constructor initializing rectangle to default points
    public MyRectangle() {
        // Initialize topLeft to (0,0) and bottomRight to (1,1)
        this.topLeft = new MyPoint(0, 0);
        this.bottomRight = new MyPoint(1, 1);
    }

    // Constructor with two MyPoint objects
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Constructor with four integers representing the coordinates
    public MyRectangle(int x1, int y1, int x2, int y2) {
        // Create new MyPoint objects for topLeft and bottomRight
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Getter method for top-left point
    public MyPoint getTopLeft() {
        return topLeft;
    }

    // Setter method for top-left point
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    // Getter method for bottom-right point
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    // Setter method for bottom-right point
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Getter and setter methods for individual coordinates of top-left point
    public int getTopLeftX() {
        return topLeft.getX();
    }

    public void setTopLeftX(int x) {
        topLeft.setX(x);
    }

    public int getTopLeftY() {
        return topLeft.getY();
    }

    public void setTopLeftY(int y) {
        topLeft.setY(y);
    }

    // Getter and setter methods for individual coordinates of bottom-right point
    public int getBottomRightX() {
        return bottomRight.getX();
    }

    public void setBottomRightX(int x) {
        bottomRight.setX(x);
    }

    public int getBottomRightY() {
        return bottomRight.getY();
    }

    public void setBottomRightY(int y) {
        bottomRight.setY(y);
    }

    // Method to get the width of the rectangle
    public int getWidth() {
        // Width is the absolute difference between the x-coordinates
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Method to get the height of the rectangle
    public int getHeight() {
        // Height is the absolute difference between the y-coordinates
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    // Method to calculate the area of the rectangle
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Method to calculate the perimeter of the rectangle
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // Override toString method to provide string representation of the rectangle
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
