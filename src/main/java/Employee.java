/**
 * 
 */

/**
 * @author anazj
 *
 */
public class Employee
{
	private String name;
	private int hours;
	private int rate;

	public Employee(String name, int hours, int rate) {
		this.name = name;
		this.hours = hours;
		this.rate = rate;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * @return the rate
	 */
	public int getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(int rate) {
		this.rate = rate;
	}

	public double getPay() {
		return 0;
	}

	@Override
	public String toString() {
		return "Employee: " + name + " hours: " + hours + " rate: " + rate;
	}

}
