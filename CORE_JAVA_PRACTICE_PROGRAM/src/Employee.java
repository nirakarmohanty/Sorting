import java.util.HashMap;
import java.util.Map;

/**
 * This is a class where intend to implement equals and hashcode method to
 * generate key class for Map
 * 
 * @author NIRAKAR
 * 
 */
public class Employee {

	private int empId;
	private String empName;

	Employee(int id, String empName) {
		this.empId = id;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public boolean equals(Object o) {
		Employee e = (Employee) o;
		if (this.empId == e.getEmpId() && this.empName == e.getEmpName())
			return true;
		else
			return false;

	}
	public static void main(String args[]){
		
		Employee e1= new Employee(1,"Nirakar1");
		Employee e2= new Employee(2,"Nirakar1");
		Employee e3= new Employee(3,"Nirakar3");
		Map<Employee,String> map=new HashMap();
		map.put(e1, "Nirakar1");
		map.put(e2, "Nirakar1");
	}
}
