package ls1;


abstract class Dzialanie {
  public double wynik; 
  
  public abstract double wynik(final double jeden, final double dwa);

}

class Dodawanie extends Dzialanie {
  @Override
  public double wynik(double jeden, double dwa) {
    wynik = jeden + dwa;
    return wynik;
  }
}

class Odejmowanie extends Dzialanie {
  @Override
  public double wynik(double jeden, double dwa) {
    wynik = jeden - dwa;
    return wynik; 
  }
}

class Mnozenie extends Dzialanie {
	@Override
  public double wynik(double jeden, double dwa) {
    wynik = jeden * dwa;
    return wynik;
  }
}

class Dzielenie extends Dzialanie {
	@Override
  public double wynik(double jeden, double dwa) {
    wynik = jeden / dwa;
    return wynik;
    }
}
