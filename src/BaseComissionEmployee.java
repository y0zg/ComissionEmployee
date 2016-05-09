/**
 * Created by webstddesign on 07.05.2016.
 */
public class BaseComissionEmployee extends ComissionEmployee {
 private double baseSalary;
	//six argument constructor
	public BaseComissionEmployee
			(String firstName, String lastName,
			 String socialSecurityNumber, double grossSales,
			 double comissionRate,double baseSalary )

	{
		//explicit call to superclass ComissionEmployee constructor
		super(firstName,lastName,socialSecurityNumber,grossSales,comissionRate);
		if (baseSalary < 0.0){
			throw new IllegalArgumentException("baseSalary must be >0");
		}
		this.baseSalary=baseSalary;
	}
	public double getBaseSalary(){
		return baseSalary;
	}

	@Override
	public double earnings(){
		//for private variables in superclass this is not allowed
		// if comissionRate and grossSales are private in superclass
		return getBaseSalary()+comissionRate*grossSales;
	}
}
