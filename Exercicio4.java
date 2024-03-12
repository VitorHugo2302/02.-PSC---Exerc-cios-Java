//Crie um programa para calcular a regra de três.

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Double a, b, x, resultado;
        
        System.out.print("Digite o primeiro valor: ");
        a = entrada.nextDouble();

        System.out.print("Digite o segundo valor: ");
        b = entrada.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        x = entrada.nextDouble();

        resultado = (x * b) / a;

        System.out.println("O valor correspondente a " + x + " na regra de três é " + resultado);

        entrada.close();
    }
}
