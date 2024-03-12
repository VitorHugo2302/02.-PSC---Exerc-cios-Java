//Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c =a2+b2 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = entrada.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("O valor da hipotenusa é " + c);

        entrada.close();
    }
}
