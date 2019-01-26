package org.dominwos;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();
        Test main = new Test();

        System.out.println("Wybierz operacje: 1.+ 2./ 3.* 4.- 5.pow 6. sqrt ");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Wykonujesz dodawanie");
                System.out.println(obj.add(main.daneZKlawiatury(), main.daneZKlawiatury()));
                break;
            case 2:
                System.out.println("Wykonujesz dzielenie");
                System.out.println(obj.divide(main.daneZKlawiatury(), main.daneZKlawiatury()));
                break;
            case 3:
                System.out.println("Wykonujesz mnozenie");
                System.out.println(obj.multiply(main.daneZKlawiatury(), main.daneZKlawiatury()));
                break;
            case 4:
                System.out.println("Wykonujesz odejmowanie");
                System.out.println(obj.subtract(main.daneZKlawiatury(), main.daneZKlawiatury()));
                break;
            case 5:
                System.out.println("Wykonujesz potege");
                System.out.println(obj.power(main.daneZKlawiatury(), main.daneZKlawiatury()));
                break;
            case 6:
                System.out.println("Wykonujesz pierwiastek");
                System.out.println(obj.sqrt(main.daneZKlawiatury()));
                break;
                default:
                    System.out.println(" Nie ma takiej opcji ");
        }

    }
        public double daneZKlawiatury () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj  liczbę");
            double a = sc.nextDouble();
            return a;

        }

}
