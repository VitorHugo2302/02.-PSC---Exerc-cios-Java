
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
