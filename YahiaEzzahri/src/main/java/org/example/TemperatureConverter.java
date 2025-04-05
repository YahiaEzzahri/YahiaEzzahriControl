package org.example;

import java.util.Scanner;

public class TemperatureConverter implements Convertisseur {
    public void convert(Scanner scanner) {
        System.out.print("Entrez la température : ");
        double valeur = scanner.nextDouble();
        System.out.print("Convertir en (1: °F → °C, 2: °C → °F) : ");
        int direction = scanner.nextInt();

        if (direction == 1) {
            double celsius = (valeur - 32) * 5 / 9;
            System.out.println(valeur + " °F = " + celsius + " °C");
        } else if (direction == 2) {
            double fahrenheit = (valeur * 9 / 5) + 32;
            System.out.println(valeur + " °C = " + fahrenheit + " °F");
        } else {
            System.out.println("Choix invalide.");
        }
    }
}
