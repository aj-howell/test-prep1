import java.util.ArrayList;

/**
 * 
 */

/**
 * @author anazj
 *
 */
public class Employee
{
	public  String name; public int hours; public int rate;

	public Employee(String name, int hours, int rate) {this.name = name; this.hours = hours; this.rate = rate;}

	/**
	 * @return the name
	 */
	public String getName() {return name;}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {this.name = name;}

	/**
	 * @return the hours
	 */
	public int getHours() {return hours;}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {this.hours = hours;}

	/**
	 * @return the rate
	 */
	public int getRate() {return rate;}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(int rate) {this.rate = rate;}

	public double getPay() {return 0;}

	@Override
	public String toString() {return "Employee: " + name + " hours: " + hours + " rate: " + rate;}

}

class Hemployee extends Employee
{
	public Hemployee(String name, int hours, int rate){super(name, hours, rate);}
		// TODO Auto-generated constructor stub

	
	public void setName(String n) {this.name="Dr.Bailey";}
	
	public String getName(){return "Not an Hourly Employee";}

	public double getPay() {
		if (getHours() <= 40){return getHours() * getRate();}

		else{return 40*getRate() + (getRate() * 1.5)*(getHours()-40);}

	}
}

class Cemployee extends Employee
{
	public Cemployee(String name, int hours, int rate) {super(name, hours, rate);}
		// TODO Auto-generated constructor stub
	public void setName(String n) {this.name="Bad Boy Bradshaw";}
	
	public String getName(){return "Not a Contractor employee";}

	public double getPay() {return getHours() * getRate();}
}
class Semployee extends Employee // Salary employee
{
	public Semployee(String name, int hours, int rate) {super(name, hours, rate);}
		// TODO Auto-generated constructor stub}	
	public void setName(String s) {this.name="Peter";}
	public String getName(){return "Not an Salary Employee";}
	public double getPay() {return 40 * getRate();}
}
class Payroll
{
	ArrayList<Employee> employees;	
	public Payroll(){employees=new ArrayList<Employee>();}	
	public void add(Employee j) {employees.add(j);}
	public double[] pay() {
		double[] paid = new double[employees.size()];
		for (int i = 0; i <= employees.size() - 1; i++){paid[i] = employees.get(i).getPay();}
		return paid;
	}
}

