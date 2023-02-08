import java.util.ArrayList;

/**
 * 
 */

/**
 * @author anazj
 *
 */
public class Payroll
{
	ArrayList<Employee> employees;
	
	public Payroll()
	{
		employees=new ArrayList<Employee>();
	}
	
	public void add(Employee j) {
		employees.add(j);

	}

	public double[] pay() {
		double[] paid = new double[employees.size()];
		for (int i = 0; i <= employees.size() - 1; i++)
		{
			paid[i] = employees.get(i).getPay();
		}
		return paid;
	}
}
