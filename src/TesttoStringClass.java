/**
 * Created by webstddesign on 07.05.2016.
 */
public class TesttoStringClass {
	private int age;
	private String street;

	public TesttoStringClass(int age, String street){
		this.age=age;
		this.street=street;
	}

	public int getAge(){
		return age;
	}

	public String toString(){
		return "\nTesttoStringClass toString["+getAge()+"]";
	}

}
