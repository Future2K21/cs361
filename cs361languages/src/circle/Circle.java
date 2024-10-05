/**
 * 
 */
package circle;

import java.util.Objects;

public class Circle extends GraphicObject implements Cloneable {

    // No use of encapsulation
    public double centerX, centerY;
    public double radius;
    public int windowNumber;

	/**
	 * 
	 */
    public Circle() {
    }

	// overloaded method in Circle
	// overridden method from GraphicObject
    @Override
    void draw() {
        System.out.println("Drawing a Circle...");
    }

	// overloaded method in Circle
	// Not overridden as it does follow the signature in GraphicObject
    public void draw(int color) {
        System.out.println("Drawing a Circle in color " + color + "...");
    }

    public double circumference() {
        return 2.0 * 3.141529 * radius;
    }

    public double area() {
        return 3.141529 * radius * radius;
    }

    public boolean overlaps(Circle other) {
        return ((centerX - other.centerX) * (centerX - other.centerX)
                + (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
                * (radius + other.radius));
    }

    @Override
    void moveTo(int newX, int newY) {
        this.centerX = newX;
        this.centerY = newY;
    }

	// TODO To complete
	/**
	 * @return the Circle with this EXACT format Circle: centerX = ... centerY = ... radius = ...
	 */
    @Override
    public String toString() {
        return "Circle: centerX = " + centerX + ", centerY = " + centerY + ", radius = " + radius;
    }

	// TODO To complete
	// TODO Be sure that you understand the difference between equals and ==
	/**
	 * @return true if this and obj have the same values for
	 * centerX, centerY and radius
	 */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle circle = (Circle) obj;
        return Double.compare(circle.centerX, centerX) == 0
                && Double.compare(circle.centerY, centerY) == 0
                && Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        // Generate a hash code using centerX, centerY, and radius
        return Objects.hash(centerX, centerY, radius);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Call to superclass' clone method
    }
}
