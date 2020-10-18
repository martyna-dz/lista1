package ls1;

import java.util.Scanner;

public class Kalkulator {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String liczba1 = scanner.nextLine();
    double liczba1_double;	
    try {
    	nananananananananan
      liczba1_double = Double.parseDouble(liczba1);
    }
    catch (NumberFormatException ex) {
      System.out.println("Nieprawidlowe dane");
      return;
    }
    Scanner scanner2 = new Scanner(System.in);
    String liczba2 = scanner.nextLine();
    double liczba2_double;
    try {
      liczba2_double = Double.parseDouble(liczba2);
    }
    catch (NumberFormatException exc) {
      System.out.println("Nieprawidlowe dane");
      return;
    }
    String znak = scanner.nextLine();
    switch (znak) {
      case "+": {
        Dodawanie d = new Dodawanie();
        System.out.println("Wynik: " + d.wynik(liczba1_double, liczba2_double));
        break;
      }
      case "-": {
        Odejmowanie o = new Odejmowanie();
        System.out.println("Wynik: " + o.wynik(liczba1_double, liczba2_double));
        break;
      }
      case "*": {
        Mnozenie m = new Mnozenie();
        System.out.println("Wynik: " + m.wynik(liczba1_double, liczba2_double));
        break;
      }
      case "/": {
        Dzielenie dz = new Dzielenie();
        System.out.println("Wynik: " + dz.wynik(liczba1_double, liczba2_double));
        break;
      }
      default: {
        System.out.println("Niepoprawny symbol");
        break;
    }
    }
    
  }
}

