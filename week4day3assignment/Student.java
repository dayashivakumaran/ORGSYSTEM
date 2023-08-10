package week4day3assignment;

	import org.department.Department;

	public class Student extends Department{
		public void studentName() {
			System.out.println("Daya");

		}
		public void studentID() {
			System.out.println("310619114304");
		}
		public void studentDept() {
			System.out.println("MECH");
		}
		public static void main(String[] args) {
			Student details=new Student();
			details.collegeName();
			details.collegeCode();
			details.collegeRank();
			details.deptName();
			details.studentName();
			details.studentDept();
			details.studentID();
		}

}
