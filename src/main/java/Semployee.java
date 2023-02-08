/**
 * 
 */

/**
 * @author anazj
 *
 */
public class Semployee extends Employee // Salary employee
{
	public Semployee(String name, int hours, int rate) {
		super(name, hours, rate);
		// TODO Auto-generated constructor stub
	}

	public double getPay() {
		return 40 * getRate();

	}

}
