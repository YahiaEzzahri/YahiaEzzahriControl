package org.example;

import java.util.Scanner;

public class MonnaieConverter implements Convertisseur {
    public void convert(Scanner scanner) {
        System.out.print("Entrez le montant : ");
        double valeur = scanner.nextDouble();
        System.out.print("Convertir en (1: USD → EUR, 2: EUR → USD) : ");
        int direction = scanner.nextInt();

        double taux = 0.93;
        if (direction == 1) {
            double eur = valeur * taux;
            System.out.println(valeur + " USD = " + eur + " EUR");
        } else if (direction == 2) {
            double usd = valeur / taux;
            System.out.println(valeur + " EUR = " + usd + " USD");
        } else {
            System.out.println("Choix invalide.");
        }
    }
}
