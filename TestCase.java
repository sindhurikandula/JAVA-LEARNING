import java.util.List;

import org.junit.jupiter.api.Test;

import one2many.*;

public class TestCase {

DepartmentDAO deptDAO=new DepartmentDAOImpl();

@Test
public void loadAllDepartmentsTest()
{
    List<Department> deptlist=deptDAO.findAllDepartments();
    for(Department d:deptlist)
    {
    	System.out.println(d.getDeptNumber()+" "+d.getDeptName()+" "+d.getDeptLocation());
    	System.out.println("-------------------");
    	
    	List<Employee> emplist=d.getEmployeeList();
    	for(Employee e:emplist)
    	{
    		System.out.println("EMP number : "+e.getEmployeeNumber());
    		if(e.getEmployeeNumber()==7844)
    		{	
    		List<Customer> custlist=e.getCustomerList();
    		for (Customer  c :custlist) {
    			
    			
				System.out.println("Customer ID:"+c.getCustomerid());
				System.out.println("Customer Name:"+c.getCustomerName());
				System.out.println("Customer Address:"+c.getAddress());
    		}	
			}
    		
			
    	}	
    }    
  }
}

	
	