package employee;
public class parttime_employee extends employe_1{

	private double hrssal;
	public parttime_employee(String type, String name, String number, String aadhar, double sal) 
	{
		super( type, name, number, aadhar);  //super for making parent
		this.hrssal=sal;
	}
	
	public double getHourlySal() {
		return hrssal;
	}
	
	public void setHrsSal(double hrssal) {
		this.hrssal = hrssal;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Salary : "+hrssal);	
		System.out.println();
	}

}
