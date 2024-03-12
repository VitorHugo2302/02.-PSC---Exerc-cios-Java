//Crie um programa que calcule a área, o perímetro e a diagonal de um retângulo. O resultado deve aparecer de maneira organizada e clara para a pessoa utilizadora.

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
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double largura, altura, area, perimetro, diagonal;
        System.out.print("Digite a largura do retângulo: ");
        largura = entrada.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        altura = entrada.nextDouble();

        area = largura * altura;
        perimetro = 2 * (largura + altura);
        diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));

        System.out.println("\nResultados:");
        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
        System.out.println("Diagonal do retângulo: " + diagonal);

        entrada.close();
    }
}
