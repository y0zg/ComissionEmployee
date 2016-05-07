import java.util.Scanner;

/**
 * Created by webstddesign on 07.05.2016.
 */
public class ComissionEmployeeTest {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		TesttoStringClass tstr = new TesttoStringClass(11, "Value");
		ComissionEmployee employee = new ComissionEmployee("John", "King", "Num10o99", 400, 0.4);
		ComissionEmployee employee2 = new ComissionEmployee("John2", "King2", "Num22o99", 300, 0.1);
		System.out.printf("%n%s %s%n", "First name is",
				employee.getFirstName());
		System.out.printf("%s %s%n", "Last name is",
				employee.getLastName());
		System.out.printf("%s %s%n", "Social security number is",
				employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is",
				employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is",
				employee.getComissionRate());
		System.out.printf("%s %.2f%n", "Earnings rate is",
				employee.earnings());

		employee.setGrossSales(5000);
		employee.setComissionRate(.1);

		System.out.printf("%n%s:%n%s",
				"employee.earnings()", employee.earnings());
		System.out.printf("%n%s:%n%s",
				"Updated employee information obtained by toString", employee);
		System.out.printf("%n%s:%n%s",
				"Updated employee2 information obtained by toString", employee2);
		System.out.printf(String.valueOf("\n" + tstr));
		String hash = Integer.toHexString(tstr.hashCode());
		System.out.printf(String.valueOf("\nhashHex:" + hash));
		System.out.println("\ntstr hashcode: " + String.valueOf(tstr.hashCode()
				+ " getClass: " + tstr.getClass()));
	}
}
