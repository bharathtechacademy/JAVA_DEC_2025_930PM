package access.mod1;

public class AccessModClass1 {
	
	//data
	public String name ="Bharath";
	
	//method
	public  int empId() {
		return 101;
	}

	public static void main(String[] args) {
		AccessModClass1 obj = new AccessModClass1();
		System.out.println("Employee Name: " + obj.name);
		System.out.println("Employee ID: " + obj.empId());
	}

}
