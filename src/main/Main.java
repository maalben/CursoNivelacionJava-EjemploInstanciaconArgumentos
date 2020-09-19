package main;

import java.util.Scanner;
import clases.Nomina;

public class Main {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese las horas trabajadas");
        double cantidadHoras = scanner.nextDouble();
        System.out.println("Ingrese el valor de la hora");
        double valorHora = scanner.nextDouble();

        Nomina nomina = new Nomina(cantidadHoras, valorHora); //Argumentos

        System.out.println("El salario a pagar es " + nomina.calcularSalario());

    }

}
