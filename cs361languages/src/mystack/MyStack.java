/**
 * 
 */
package mystack;

/**
 * @author Donovan Lane
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * Constructor for the MyStack class
	 */
	public MyStack() {
		// Initializes an empty stack
	}

	/**
	 * Removes and returns the top element from the stack
	 * 
	 * @return the top element of the stack, or null if the stack is empty
	 */
	public T pop() {
		// TODO To complete
		if (theStack == null) {
			// Stack is empty
			return null;
		}
		// Get the value of the current top node
		T topVal = theStack.val;
		// Move the stack pointer to the next node (removing the top node)
		theStack = theStack.next;
		return topVal;
	}

	/**
	 * Adds a new element to the top of the stack
	 * 
	 * @param v the element to add to the stack
	 */
	public void push(T v) {
		// TODO To complete
		// Create a new node and make it the new top of the stack
		theStack = new MyNode<>(v, theStack);
	}

	
	/**
	 * Main method to test the stack with different types
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> intStack = new MyStack<>();
		
		// Push 1 and 2
		intStack.push(1);
		intStack.push(2);

		// Pop
		System.out.println("Popped from intStack: " + intStack.pop());  // Should print 2
		
		// Push 5
		intStack.push(5);

		// Pop again
		System.out.println("Popped from intStack: " + intStack.pop());  // Should print 5
		
		
		// TODO To complete

		// TODO To complete
		// Create a stack of Person
		MyStack<Person> personStack = new MyStack<>();

		// Push a person p1 with your name
		Person p1 = new Person("Donovan", "Lane");

		// Push a person p2 with my name
		Person p2 = new Person("Christelle", "Schraff");

		personStack.push(p1);
		personStack.push(p2);

		// Pop from personStack and display the name
		Person poppedPerson1 = personStack.pop();
		System.out.println("Popped from personStack: " + poppedPerson1.getFname() + " " + poppedPerson1.getLname());  // Should print "Christelle Schraff"

		Person poppedPerson2 = personStack.pop();
		System.out.println("Popped from personStack: " + poppedPerson2.getFname() + " " + poppedPerson2.getLname());  // Should print "Donovan Lane"
	}

}
