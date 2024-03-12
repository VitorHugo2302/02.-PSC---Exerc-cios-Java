//Faça um programa para uma loja de cerâmica que ajuda no cálculo da quantidade de revestimento necessário para uma obra. A pessoa utilizadora deve informar as medidas de largura e comprimento da área que será revestida e da cerâmica escolhida. Sempre arredonde o valor para cima, e acrescente dez por cento para o acabamento.

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
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double larguraArea, comprimentoArea, larguraCeramica, comprimentoCeramica, areaRevestimento, areaTotal, areaCeramica, areaComAcabamento;

        System.out.print("Digite a largura da área a ser revestida (em metros): ");
        larguraArea = entrada.nextDouble();

        System.out.print("Digite o comprimento da área a ser revestida (em metros): ");
        comprimentoArea = entrada.nextDouble();

        System.out.print("Digite a largura da cerâmica escolhida (em metros): ");
        larguraCeramica = entrada.nextDouble();

        System.out.print("Digite o comprimento da cerâmica escolhida (em metros): ");
        comprimentoCeramica = entrada.nextDouble();

        areaTotal = larguraArea * comprimentoArea;
        areaCeramica = larguraCeramica * comprimentoCeramica;
        areaComAcabamento = areaTotal * 1.1;

        areaRevestimento = areaComAcabamento / areaCeramica;

        System.out.println("\nQuantidade de revestimento necessária: " + Math.ceil(areaRevestimento) + " metros quadrados");

        entrada.close();
    }
}
