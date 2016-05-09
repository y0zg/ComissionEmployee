import java.util.Scanner;

/**
 * Created by webstddesign on 07.05.2016.
 */
public class ComissionEmployeeTest {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);

		ComissionEmployee employee = new ComissionEmployee("John", "King", "Num10o99", 400, 0.4);
		ComissionEmployee employee2 = new ComissionEmployee("John2", "King2", "Num22o99", 300, 0.1);

		System.out.printf("%n%n%s:%n%s",
				"Updated employee information obtained by toString", employee);
		System.out.printf("%n%n%s:%n%s",
				"Updated employee2 information obtained by toString", employee2);


		BaseComissionEmployee baseEmployee = new BaseComissionEmployee
				("Andrew", "Gorton", "Num16k93", 200, 0.1, 5000);
		System.out.printf("%n%n%s:%n%s",
				"Updated employee2 information obtained by toString", baseEmployee);

//with comissionEmployee2 variable at RUNTIME  it shows BaseComissionEmployee object
		ComissionEmployee comissionEmployee2 = baseEmployee;
		System.out.printf("%n%n%s:%n%s",
				"Updated employee2 information obtained by toString", comissionEmployee2);


	}
}
