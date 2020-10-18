package ls1;


abstract class Dzialanie
{
	public double wynik;
	public double wynik(double jeden, double dwa)
	{
		return 0;
	}
}

class Dodawanie extends Dzialanie
{
	public double wynik(double jeden, double dwa)
	{
		wynik = jeden + dwa;
		return wynik;
	}
}

class Odejmowanie extends Dzialanie
{
	public double wynik(double jeden, double dwa)
	{
		wynik = jeden - dwa;
		return wynik;
	}
}

class Mnozenie extends Dzialanie
{
	public double wynik(double jeden, double dwa)
	{
		wynik = jeden*dwa;
		return wynik;
	}
}

class Dzielenie extends Dzialanie
{
	public double wynik(double jeden, double dwa)
	{
		wynik = jeden/dwa;
		return wynik;
	}
}
