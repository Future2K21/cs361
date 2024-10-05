/**
 * 
 */
package reflection;

/**
 * @author Donovan Lane
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o,
// and the list of methods of the class

// Complete the code

import circle.ColoredCircle;
import java.lang.reflect.Method;


public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passed is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passed is null");

		System.out.print("Inheritance chain: ");
		Class<?> currentClass = o.getClass();

		// Traversing the inheritance chain
		while (currentClass != null) {
			System.out.print(currentClass.getName());
			currentClass = currentClass.getSuperclass();
			if (currentClass != null) {
				System.out.print(" inherits from ");
			}
		}
		System.out.println();
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passed is null");

		Method[] methods = o.getClass().getMethods();

		// List of methods
		System.out.println("List of methods:");
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println(); // Add a line for separation
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();

		// Demonstration of the methods on an object of type String
		String str = "Hello Reflection";
		System.out.println("### Reflection on a String object ###");
		r.correspondingClass(str);           // Print the class of String object
		r.inheritanceChain(str);             // Print the inheritance chain for String
		r.listMethods(str);                  // Print the list of methods for String object

		// Demonstration of the methods on an object of type ColoredCircle
		ColoredCircle cc = new ColoredCircle();
		System.out.println("### Reflection on a ColoredCircle object ###");
		r.correspondingClass(cc);            // Print the class of ColoredCircle object
		r.inheritanceChain(cc);              // Print the inheritance chain for ColoredCircle
		r.listMethods(cc);                   // Print the list of methods for ColoredCircle object
	}

}
