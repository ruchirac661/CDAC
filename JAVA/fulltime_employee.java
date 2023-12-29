package employee;
public class fulltime_employee extends employe_1{

	private double sal;
	
	public fulltime_employee(String type, String name, String number, String aadhar, double sal) {
		super( type, name,  number,  aadhar);
		this.sal= sal;
	}

	
	public double getSal() {
		return sal;
	}

	
	public void setMonthlyWage(double sal) {
		this.sal = sal;
	}

	public void display()
	{
		super.display();
		System.out.println("Salary : "+sal);
		System.out.println();
	}
}
