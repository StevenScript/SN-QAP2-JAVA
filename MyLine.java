// MyLine.java
// This class represents a line defined by two points in 2D space.

public class MyLine {
    // Instance variables for the beginning and ending points of the line
    private MyPoint begin; // Begin point of the line
    private MyPoint end;   // End point of the line

    // Constructor that takes two MyPoint objects
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Constructor that takes four integers representing the coordinates
    public MyLine(int x1, int y1, int x2, int y2) {
        //  Initializes a MyLine object using two MyPoint objects.
        // Create new MyPoint objects for begin and end
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Getter method for begin point
    public MyPoint getBegin() {
        return begin;
    }

    // Setter method for begin point
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    // Getter method for end point
    public MyPoint getEnd() {
        return end;
    }

    // Setter method for end point
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Getter and setter methods for individual coordinates of begin point
    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    // Getter and setter methods for individual coordinates of end point
    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    // Methods to get and set both x and y coordinates together
    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Method to get the length of the line
    public double getLength() {
        // Use the distance method from MyPoint class
        return begin.distance(end);
    }

    // Method to get the gradient (slope) of the line in radians
    public double getGradient() {
        int xDiff = end.getX() - begin.getX(); // Difference in x coordinates
        int yDiff = end.getY() - begin.getY(); // Difference in y coordinates
        // Use Math.atan2 to compute the angle in radians between the x-axis and the line
        return Math.atan2(yDiff, xDiff);
    }

    // Override toString method to provide string representation of the line
    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ",end=" + end + "]";
    }
}
