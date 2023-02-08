/**
 * 
 */

/**
 * @author anazj
 *
 */
public class Hemployee extends Employee
{
	public Hemployee(String name, int hours, int rate) {
		super(name, hours, rate);
		// TODO Auto-generated constructor stub
	}

	public double getPay() {
		if (getHours() <= 40)
		{
			return getHours() * getRate();
		}

		else
		{
			return 40*getRate() + (getRate() * 1.5)*(getHours()-40);
		}

	}
}
