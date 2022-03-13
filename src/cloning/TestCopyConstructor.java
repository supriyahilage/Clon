package cloning;

public class TestCopyConstructor {

	public static void main  (String[]args) {
		
		Address add= new Address("Pune", "IND",123);
		
		Employee emp1=new Employee(10,"Ram",add);
		System.out.println("Emp1:"+emp1);
	
        Employee emp2=new Employee(emp1);
        System.out.println("Emp2:"+emp2);
        emp1.address.City="Mumbai";
        System.out.println("Emp1 changed:"+emp1);
        System.out.println("Emp2 changed:"+emp2);
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
		}
	}

