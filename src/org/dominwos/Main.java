package org.dominwos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);
        int a;
        int b;
        int result;

        System.out.print("Podaj a: ");
        a = scr.nextInt();
        System.out.print("Podaj b: ");
        b = scr.nextInt();

        System.out.println("Co chcesz zrobić: \n1. Sumua \n2. Mnozenie \n3. Różnica");
        int decyzja = scr.nextInt();

        Calculator c = new Calculator();

        switch (decyzja) {
            case 1 : {
                result = c.add(a, b);
                System.out.println("Suma wynosi: " + result);
                break;
            }
            case 2 : {
                result = c.multiply(a, b);
                System.out.println("Mnożenie wynosi: " + result);
                break;
            }
            case 3 : {
                result = c.subtract(a, b);
                System.out.println("Różnica wynosi: " + result);
                break;
            }
            default : {
                System.out.println("wybrales inny znak");
            }
        }

    }


    //TODO
//1. Stworzyć Branch [TwojeImie][losowa liczba od 30 do 100]
//1. Utworzyć poprawny plik .gitignore
//2. Zmerdżować istniejace gałezie rozwiazujac konflikty
//3. Zamienic wszystkie operacja na double
//4. Dopisac resztę potrzebnych operacji (pierwiastek)
//5. Dopisać interfejs użytkownika
//6. Zrobić git pull i rozwiązać powstałe konflikty
//7. Zrobić git push swojego brancha na swoje repozytorium
//8. Zrobić pull request.


}
