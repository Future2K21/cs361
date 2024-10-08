/**
 * 
 */
package circle;

/**
 * @author Donovan Lane
 *
 */

// abstract class

abstract class GraphicObject {

	private int pixelX, pixelY;

	abstract void moveTo(int newX, int newY);

	abstract void draw();

}
