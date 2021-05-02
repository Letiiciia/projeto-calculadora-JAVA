package com.company;

import java.util.Scanner;

public class CalculaMedia {
    public void media(){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a nota 1: ");
        double nota1 = input.nextDouble();

        System.out.println("Informe a nota 2: ");
        double nota2 = input.nextDouble();

        System.out.println("Informe a nota 3: ");
        double nota3 = input.nextDouble();

        System.out.println("Informe o numero de faltas: ");
        double faltas = input.nextDouble();

        Double mediaNota = (nota1 + nota2 + nota3) / 3.0;
        double minimoFaltas = 68 * 0.25;

        if(mediaNota < 7.0){
            if(faltas > minimoFaltas){
                System.out.printf("Reprovado por nota e por faltas. Sua nota é %.1f", mediaNota);
            }else{
                System.out.printf("Reprovado por nota. Sua nota é %.1f", mediaNota);
            }
        }else if(faltas > minimoFaltas){
            System.out.printf("Reprovado por faltas, suas faltas ultrapassaram o minimo aceitavel");
        }else{
            System.out.printf("Aprovado, sua média é %.1f", mediaNota);
        }
    }
}
