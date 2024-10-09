package ProblemOneTwo;
// TestMyRectangle.java
// This is to test the functionality of the MyRectangle class.

// **KEY TAKEAWAYS**
// - Constructors provide multiple ways to create objects.
// - Getter and setter methods encapsulate access to private fields.
// - Modifying objects referenced within other objects can have side effects.
// - Testing all methods ensures the class behaves as expected in different scenarios.

public class TestMyRectangle {
    public static void main(String[] args) {
        // **Test 1: Using Default Constructor**
        // Create a MyRectangle object using the default constructor.
        // This initializes the rectangle with default points: topLeft at (0,0) and bottomRight at (1,1).
        // Expected output: MyRectangle[topLeft=(0,0), bottomRight=(1,1)]
        MyRectangle rect1 = new MyRectangle();
        System.out.println("Rectangle 1: " + rect1);        

        // Test getWidth, getHeight, getArea, getPerimeter
        System.out.println("Width: " + rect1.getWidth());         // Expected: 1
        System.out.println("Height: " + rect1.getHeight());       // Expected: 1
        System.out.println("Area: " + rect1.getArea());           // Expected: 1
        System.out.println("Perimeter: " + rect1.getPerimeter()); // Expected: 4

        // - The default rectangle is a 1x1 square at the origin.
        // - Width and height are both 1 unit.
        // - Area is calculated as width * height.
        // - Perimeter is calculated as 2 * (width + height).


        // **Test 2: Using Constructor with MyPoint Objects**
        // Create two MyPoint objects representing the top-left and bottom-right corners.
        // Expected output: MyRectangle[topLeft=(1,5), bottomRight=(4,1)]
        MyPoint p1 = new MyPoint(1, 5);
        MyPoint p2 = new MyPoint(4, 1);
        MyRectangle rect2 = new MyRectangle(p1, p2);
        System.out.println("\nRectangle 2: " + rect2);        

        // Test calculations
        System.out.println("Width: " + rect2.getWidth());         // Expected: 3
        System.out.println("Height: " + rect2.getHeight());       // Expected: 4
        System.out.println("Area: " + rect2.getArea());           // Expected: 12
        System.out.println("Perimeter: " + rect2.getPerimeter()); // Expected: 14

        // - The rectangle spans from (1,5) to (4,1).
        // - Width is calculated using x-coordinates; height using y-coordinates.
        // - The methods handle positive dimensions even if points are not in the expected positions.


        // **Test 3: Using Constructor with Coordinate Values**
        // Create MyRectangle object using coordinates
        MyRectangle rect3 = new MyRectangle(2, 7, 6, 3);
        System.out.println("\nRectangle 3: " + rect3);
        // Expected output: MyRectangle[topLeft=(2,7), bottomRight=(6,3)]

        // Test calculations
        System.out.println("Width: " + rect3.getWidth());         // Expected: 4
        System.out.println("Height: " + rect3.getHeight());       // Expected: 4
        System.out.println("Area: " + rect3.getArea());           // Expected: 16
        System.out.println("Perimeter: " + rect3.getPerimeter()); // Expected: 16

        // - Using coordinate values directly is convenient when point objects are not needed elsewhere.
        // - Ensures flexibility in object creation.


        // **Test 4: Modifying Rectangle Using Setter Methods**
        // Modify rectangle using setters
        rect3.setTopLeft(new MyPoint(0, 10));
        rect3.setBottomRight(new MyPoint(5, 0));
        System.out.println("\nAfter modification:");
        System.out.println("Rectangle 3: " + rect3);
        // Expected output: MyRectangle[topLeft=(0,10), bottomRight=(5,0)]

        // Re-test calculations
        System.out.println("Width: " + rect3.getWidth());         // Expected: 5
        System.out.println("Height: " + rect3.getHeight());       // Expected: 10
        System.out.println("Area: " + rect3.getArea());           // Expected: 50
        System.out.println("Perimeter: " + rect3.getPerimeter()); // Expected: 30

        // - Setter methods allow updating the rectangle's points after creation.
        // - Useful for dynamic scenarios where the rectangle needs to change position or size.
        // - The calculations reflect the updated dimensions.


         // **Test 5: Using Getter Methods for Individual Points**
        // Retrieve and display the top-left point using the getter method.
        MyPoint currentTopLeft = rect3.getTopLeft();
        System.out.println("\nCurrent Top-Left Point: " + currentTopLeft);
        // Expected output: (0,10)

        // Retrieve and display the bottom-right point using the getter method.
        MyPoint currentBottomRight = rect3.getBottomRight();
        System.out.println("Current Bottom-Right Point: " + currentBottomRight);
        // Expected output: (5,0)

        // **Explanation:**
        // - Getter methods provide access to the rectangle's points.
        // - Points can be used for further calculations or manipulations outside the rectangle class.

         // **Test 6: Modifying Points Directly and Observing Changes**
        // Modify the x-coordinate of the top-left point directly.
        currentTopLeft.setX(2);
        // Modify the y-coordinate of the bottom-right point directly.
        currentBottomRight.setY(1);

        // Print the rectangle's details after modifying points.
        // Expected output: MyRectangle[topLeft=(2,10), bottomRight=(5,1)]
        System.out.println("\nAfter modifying points directly:");
        System.out.println("Rectangle 3: " + rect3);
       

        // Re-calculate and display the width and height.
        System.out.println("Width: " + rect3.getWidth());   // Expected: 3
        System.out.println("Height: " + rect3.getHeight()); // Expected: 9

        // **Explanation:**
        // - Since points are objects, modifying them affects the rectangle.
        // - Highlights the importance of understanding object references.
    }
}
        

        