public class InnerOuterEval {

    // Function to simulate side effects during recursion
    public static int printAndReturn(int n, String name) {
        System.out.println("Evaluating " + name + ": " + n);
        return n;
    }

    // A recursive function to illustrate evaluation order
    public static int recursiveFunction(int x, int y) {
        System.out.println("Entering recursiveFunction with x = " + x + " and y = " + y);
        if (x <= 0) {
            return y;
        }
        // Recursive call with side effects in the arguments
        return recursiveFunction(printAndReturn(x - 1, "x-1"), printAndReturn(y + 1, "y+1"));
    }

    public static void main(String[] args) {
        int result = recursiveFunction(3, 0);  // Start the recursion with x = 3 and y = 0
        System.out.println("Final result: " + result);
    }
}

// This output confirms that Java uses innermost evaluation (applicative-order). 
// The arguments are evaluated before the recursive function itself is called. 
// You can clearly see that x-1 and y+1 are printed (evaluated) before each new call to recursiveFunction.
