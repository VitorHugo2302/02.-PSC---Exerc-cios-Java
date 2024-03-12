//Escreva um programa que seja capaz de realizar a soma de duas frações, não é necessário simplificar. As entradas serão o numerador e, o denominador da primeira fração, seguidos do numerador e, o denominador da segunda fração. O resultado também deverá ser exibido em formato de fração. e.g: ⅗

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
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Integer numerador1, denominador1, numerador2, denominador2, novoNumerador, novoDenominador;

        System.out.print("Informe o numerador da primeira fração: ");
        numerador1 = entrada.nextInt();

        System.out.print("Informe o denominador da primeira fração: ");
        denominador1 = entrada.nextInt();

        System.out.print("Informe o numerador da segunda fração: ");
        numerador2 = entrada.nextInt();

        System.out.print("Informe o denominador da segunda fração: ");
        denominador2 = entrada.nextInt();

        novoNumerador = (numerador1 * denominador2) + (numerador2 * denominador1);
        novoDenominador = denominador1 * denominador2;

        System.out.println("\nA soma das frações é: " + novoNumerador + "/" + novoDenominador);

        entrada.close();
    }
}
