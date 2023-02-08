
public class Cemployee extends Employee
{
	public Cemployee(String name, int hours, int rate) {
		super(name, hours, rate);
		// TODO Auto-generated constructor stub
	}

	public double getPay() {
		return getHours() * getRate();

	}
}
