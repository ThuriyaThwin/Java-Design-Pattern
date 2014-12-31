package dzp.ch5;

import org.junit.Test;

import com.jdc.dzp.ch5.Employees;

public class PrototypeTest {

	@Test
	public void test() throws CloneNotSupportedException {
		Employees emps1 = new Employees();
		emps1.loadData();
		
		Employees emps2 = (Employees) emps1.clone();
		emps2.getEmployees().remove(0);
		
		System.out.println("emps1 :: " + emps1.getEmployees());
		System.out.println("emps2 :: " + emps2.getEmployees());
	}

}
