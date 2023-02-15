
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;



class Testing1
{
	Employee R;
	Employee J;
	Employee M;
	Employee Y;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		//polymorphism
		R = new Cemployee("Roger", 50, 3);
		R.setName("Bob");
		J = new Semployee("Jimmy", 40,3);
		M = new Hemployee("Mike", 40, 3);
		Y = new Hemployee("Yasmine", 50, 3);
	}

	@Test
	void test() 
	{
		assertEquals("Employee: Roger hours: 50 rate: 3",R.toString());
		//fail("Not yet implemented");
	}
	
	@Test
	void TestPay()
	{
		Payroll p1= new Payroll();
		p1.add(R);
		p1.add(J);
		p1.add(M);
		p1.add(Y);
		Double[] pays = {150.0, 120.0, 120.0, 165.0};
		
		
		assertEquals(Arrays.toString(pays), Arrays.toString(p1.pay()));
	}

}
