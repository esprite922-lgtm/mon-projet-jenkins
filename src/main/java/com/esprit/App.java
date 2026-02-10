package com.esprit;

public class App {
    
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("   Bienvenue dans mon projet !   ");
        System.out.println("   Jenkins CI/CD fonctionne !    ");
        System.out.println("=================================");
        
        Calculatrice calc = new Calculatrice();
        System.out.println("2 + 3 = " + calc.additionner(2, 3));
        System.out.println("10 - 4 = " + calc.soustraire(10, 4));
        System.out.println("5 x 6 = " + calc.multiplier(5, 6));
    }
}
