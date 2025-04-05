package org.example;

import java.util.Scanner;

public class DistanceConverter implements Convertisseur {
    public void convert(Scanner scanner) {
        System.out.print("Entrez la distance : ");
        double valeur = scanner.nextDouble();
        System.out.print("Convertir en (1: miles → km, 2: km → miles) : ");
        int direction = scanner.nextInt();

        if (direction == 1) {
            double km = valeur * 1.60934;
            System.out.println(valeur + " miles = " + km + " km");
        } else if (direction == 2) {
            double miles = valeur / 1.60934;
            System.out.println(valeur + " km = " + miles + " miles");
        } else {
            System.out.println("Yahia ezzahri.");
        }
    }
}
