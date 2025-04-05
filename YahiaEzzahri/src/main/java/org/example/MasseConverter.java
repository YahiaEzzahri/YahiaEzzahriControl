package org.example;

import java.util.Scanner;

public class MasseConverter implements Convertisseur {
    public void convert(Scanner scanner) {
        System.out.print("Entrez la masse : ");
        double valeur = scanner.nextDouble();
        System.out.print("Convertir en (1: lb → kg, 2: kg → lb) : ");
        int direction = scanner.nextInt();

        if (direction == 1) {
            double kg = valeur * 0.453592;
            System.out.println(valeur + " lb = " + kg + " kg");
        } else if (direction == 2) {
            double lb = valeur / 0.453592;
            System.out.println(valeur + " kg = " + lb + " lb");
        } else {
            System.out.println("Choix invalide.");
        }
    }
}
