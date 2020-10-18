package ls1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

  double liczba1 = 10;
	double liczba2 = 5;
	@Test
	public void testDodawanie()
	{
		Dodawanie d = new Dodawanie();
		Assert.assertEquals(15, d.wynik (liczba1, liczba2), 0);		
		Mnozenie m = new Mnozenie();
		Assert.assertEquals(50, m.wynik(liczba1, liczba2), 0);
		Odejmowanie o = new Odejmowanie();
		Assert.assertEquals(5,  o.wynik(liczba1, liczba2), 0);	
		Dzielenie dz = new Dzielenie();
		Assert.assertEquals(2, dz.wynik(liczba1, liczba2), 0);
	}
}
