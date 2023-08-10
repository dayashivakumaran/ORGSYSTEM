package week4day3assignment;

public class Employee {
	 void getEmployeeInfo(int id) {
			System.out.println("ID: "+id);
		}
		public void getEmployeeInfo(int id, String name) {
			System.out.println("Id: "+id +" Name: " +name);
		}
		public void getEmployeeInfo(int id, String name, String email) {
			System.out.println("Id: "+id +" Name: "+name +" Email: " +email);
		}
		public void getEmployeeInfo(int id, String name, String email, long phonenumber) {
			System.out.println("Id: "+id +" Name: "+name +" Email: "+email +" Phone Number: "+phonenumber);
		}
		public static void main(String[] args) {
			Employee details=new Employee();
			details.getEmployeeInfo(2);
			details.getEmployeeInfo(2, "daya");
			details.getEmployeeInfo(2, "naveen", "naveen0712@gmail.com");
			details.getEmployeeInfo(0, "nizam", "nizam0812@gmail.com", 5623462);
		}

}
