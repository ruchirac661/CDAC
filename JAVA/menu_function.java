package employee;
import java.util.*;
import java.util.Scanner;


public class menu_function {
		private static List<employe_1> list=new ArrayList<employe_1>();
		
		Scanner sc = new Scanner(System.in);
		
		public void createEmp(String type) {
			System.out.println("Enter Name of Employee: ");
			String Ename = sc.next();
			System.out.println("Enter aadhar no of Employee: ");
			String a_no = sc.next();
			if(a_no.length()!=12) {
				System.out.println("Invalid aadhar no");
			}
			System.out.println("Enter Phone Number of Employee: ");
			String number = sc.next();
			if(number.length()!=10 ) {
				System.out.println("Invalid Number");
			}
			System.out.println("Enter Salary of Employee: ");
			double sal = sc.nextInt();			
			if(type.equals("F")) {
				employe_1 g= new fulltime_employee("F",Ename, a_no, number, sal);
				list.add(g);
			}
			else {
				employe_1 g= new parttime_employee("P",Ename, a_no, number, sal);
				list.add(g);
			}
		}

		
		public void deleteById() {
			System.out.println("Enter Id to be remove: ");
			String id = sc.next();
			for(employe_1 e:list) {
				if(e.getId().equals(id)) {
					list.remove(e);
				}
			}
			System.out.println("Employee Removed");
		}

		
		public void searchBya_no() {
			System.out.println("Enter aadhar no of Employee: ");
			String a_no = sc.next();
			for(employe_1 e:list) {
				if(e.getAadhar().equals(a_no)) {
					e.display();
				}
			}
			
		}
		
		public void Printall() {
			for(employe_1 s:list) {
				s.display();
			}
		}

	}

		
	