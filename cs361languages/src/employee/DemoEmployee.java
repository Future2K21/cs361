/**
 * 
 */
package employee;

/**
 * @author Donovan Lane
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;  // Upcasting PartTimeEmployee to Employee
		System.out.println("emp3");
		emp3.whoAmI();  // Calls the whoAmI method

		// TODO To complete
		// emp3.whoAmI() prints PART TIME EMPLOYEE because the method is overridden in PartTimeEmployee.
		// Even though emp3 is of type Employee, due to polymorphism, the method in the actual object type (PartTimeEmployee) is called.
		// emp3.getHourlyRate(); returns a syntax error because the method getHourlyRate() belongs to PartTimeEmployee,
		// and emp3 is now of type Employee, which doesn't have that method.

		// TODO To complete
		// Add the condition that tests if emp3 is an instance of PartTimeEmployee at this time
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part-time employee"); // printed
		} else {
			System.out.println("emp3 not instance of part-time employee");
		}

		// Downcasting 1
		// TODO Uncomment and run the code
		PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
		// TODO To complete
		// This instruction compiles, but it returns a ClassCastException at runtime
		// because emp1 is not an instance of PartTimeEmployee, but it's being downcast to it.

		// Downcasting 2
		// Requires the use of instanceof to avoid a runtime cast exception
		// TODO Look at the solution below
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part-time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3;  // cast required
			System.out.println(pEmp4.getHourlyRate());  // Access method specific to PartTimeEmployee
		} else {
			System.out.println("emp3 not instance of part-time employee");
		}
	}
}
