import java.util.Scanner;

/**
 * Created by webstddesign on 07.05.2016.
 */
public class ComissionEmployeeTest {
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		ComissionEmployee employee=new ComissionEmployee("a","a","a",400,0.4);
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

		System.out.printf("%n%s:%n%n%s%n",
				"Updated employee information obtained by toString", employee.earnings());

	}
}
