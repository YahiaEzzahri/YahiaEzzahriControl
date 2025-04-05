package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println("\n=== Convertisseur d'unités ===");
            System.out.println("1. Température (°C ⇆ °F)");
            System.out.println("2. Distance (km ⇆ miles)");
            System.out.println("3. Monnaie (EUR ⇆ USD)");
            System.out.println("4. Masse (kg ⇆ lb)");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1 -> new TemperatureConverter().convert(scanner);
                case 2 -> new DistanceConverter().convert(scanner);
                case 3 -> new MonnaieConverter().convert(scanner);
                case 4 -> new MasseConverter().convert(scanner);
                case 5 -> {
                    continuer = false;
                    System.out.println("Au revoir !");
                }
                default -> System.out.println("Option invalide !");
            }
        }

        scanner.close();
    }
}
