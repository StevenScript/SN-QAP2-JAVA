// TestMyLine.java
// This is a test driver to test all public methods of the MyLine class.

public class TestMyLine {
    public static void main(String[] args) {
        // Create two MyPoint objects representing points (0,0) and (3,4)
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);

        // Create a MyLine object using the two MyPoint objects
        MyLine line1 = new MyLine(p1, p2);

        // Test toString method of MyLine class
        System.out.println(line1); // Expected output: MyLine[begin=(0,0),end=(3,4)]

        // Test getBegin and getEnd methods
        System.out.println("Begin point: " + line1.getBegin()); // Expected output: (0,0)
        System.out.println("End point:   " + line1.getEnd());   // Expected output: (3,4)

        // Test getLength method
        System.out.println("Length: " + line1.getLength()); // Expected output: 5.0

        // Test getGradient method (the gradient is in radians)
        System.out.println("Gradient (in radians): " + line1.getGradient()); // Approximate output: 0.9273

        // Convert gradient from radians to degrees for better understanding
        System.out.println("Gradient (in degrees): " + Math.toDegrees(line1.getGradient())); // Approx: 53.13 degrees

        // Test setter methods for begin and end points
        line1.setBegin(new MyPoint(1, 1));
        line1.setEnd(new MyPoint(4, 5));
        System.out.println("\nAfter setting new begin and end points:");
        System.out.println(line1); // Expected output: MyLine[begin=(1,1),end=(4,5)]

        // Test individual coordinate setters for begin point
        line1.setBeginX(2);
        line1.setBeginY(2);

        // Test individual coordinate setters for end point
        line1.setEndX(5);
        line1.setEndY(6);
        System.out.println("\nAfter setting new coordinates:");
        System.out.println("Begin point: " + line1.getBegin()); // Expected output: (2,2)
        System.out.println("End point:   " + line1.getEnd());   // Expected output: (5,6)

        // Test getBeginXY and getEndXY methods
        int[] beginXY = line1.getBeginXY();
        int[] endXY = line1.getEndXY();
        System.out.println("\nBegin XY: (" + beginXY[0] + "," + beginXY[1] + ")"); // Expected output: (2,2)
        System.out.println("End XY:   (" + endXY[0] + "," + endXY[1] + ")");       // Expected output: (5,6)

        // Test setBeginXY and setEndXY methods
        line1.setBeginXY(0, 0);
        line1.setEndXY(3, 4);
        System.out.println("\nAfter setting begin and end XY:");
        System.out.println(line1); // Expected output: MyLine[begin=(0,0),end=(3,4)]

        // Test getLength and getGradient methods again
        System.out.println("Length: " + line1.getLength()); // Expected output: 5.0
        System.out.println("Gradient (in degrees): " + Math.toDegrees(line1.getGradient())); // Approx: 53.13 degrees
    }
}
