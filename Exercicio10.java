//A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, para cada quilograma de peso. Crie um algoritmo que recebe o peso de uma pessoa e informe a quantidade recomendada de água em litros.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o peso em KG: ");
        double peso = entrada.nextDouble();

        double mlPorKg = 35.0;
        double quantidadeAgua = peso * mlPorKg / 1000.0; // Convertendo ml para litros

        System.out.printf("A quantidade recomendada de água é %.2f litros por dia.\n", quantidadeAgua);

        entrada.close();
    }
}
