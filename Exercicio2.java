//Uma dúvida que sempre paira na cabeça dos motoristas é: Abastecer com etanol ou gasolina? Especialistas indicam que o consumo do carro aumenta em torno de trinta por cento, quando abastecido com etanol, logo, só vale a pena abastecer com ele se o valor estiver abaixo de setenta por cento do valor da gasolina. Para auxiliar motoristas a realizar este cálculo, crie um algoritmo que receba o preço dos dois combustíveis, e informe qual deve ser a escolha, com base no custo.

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
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double valorGasolina, valorEtanol, percentualLimite, custoEtanol;
        System.out.print("Digite o valor da gasolina: ");
        valorGasolina = entrada.nextDouble();
        System.out.print("Digite o valor do etanol: ");
        valorEtanol = entrada.nextDouble();

        percentualLimite = 70.0;

        custoEtanol = valorEtanol / valorGasolina * 100;

        if (custoEtanol <= percentualLimite) {
            System.out.println("Recomendado abastecer com etanol.");
        } else {
            System.out.println("Recomendado abastecer com gasolina.");
        }
        entrada.close();
    }
}
