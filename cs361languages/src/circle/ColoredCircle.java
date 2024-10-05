/**
 * 
 */
package circle;

/**
 * @author Donovan Lane
 *
 */
public class ColoredCircle extends Circle {

	public int color;
	
	/**
	 * 
	 */
	public ColoredCircle() {
	}

	@Override
	void moveTo(int newX, int newY) {
		this.centerX = newX;
		this.centerY = newY;
	}
	
	// overridden method from Circle
	@Override
	void draw() {
		System.out.println("Drawing a ColoredCircle...");
	}
}
