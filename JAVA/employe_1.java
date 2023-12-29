package employee;
/**
 * 
 */
public class employe_1{

	private String id;
	private String name;
	private String aadhar;
	private String number;
	

	private static int count=1;
	
	
	/**
	 * 
	 */
	public employe_1() {
		this.name="abc";
		this.aadhar="123456789987";
		this.number="1234567890";
	}
	
	public employe_1(String type, String name, String number, String aadhar) {
		this.id=setId(type);
		this.name=name;
		this.aadhar=aadhar;
		this.number=number;
	}
	
	public String setId(String type) 
	{
		if(type.equals("F")){
			return(type+ Integer.toString(count++));
		}
		else
		{
			return(type+ Integer.toString(count++));	
		}
	}

	public String getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}


	
	public void display()
	{
		System.out.println();
		System.out.println("Id.:"+id
						+"\n Name :"+name
						+"\n Aadhar :"+aadhar
						+"\n Number :"+number);
	}
}
