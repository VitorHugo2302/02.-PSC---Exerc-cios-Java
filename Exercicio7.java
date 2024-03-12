
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
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double larguraArea, comprimentoArea, larguraCeramica, comprimentoCeramica, areaRevestimento, areaTotal, areaCeramica,
                areaComAcabamento, valorMetroQuadrado, valorTotal;

        System.out.print("Digite a largura da área a ser revestida (em metros): ");
        larguraArea = entrada.nextDouble();

        System.out.print("Digite o comprimento da área a ser revestida (em metros): ");
        comprimentoArea = entrada.nextDouble();

        System.out.print("Digite a largura da cerâmica escolhida (em metros): ");
        larguraCeramica = entrada.nextDouble();

        System.out.print("Digite o comprimento da cerâmica escolhida (em metros): ");
        comprimentoCeramica = entrada.nextDouble();

        System.out.print("Digite valor do metro quadrado da cerâmica: ");
        valorMetroQuadrado = entrada.nextDouble();

        areaTotal = larguraArea * comprimentoArea;
        areaCeramica = larguraCeramica * comprimentoCeramica;
        areaComAcabamento = areaTotal * 1.1;

        areaRevestimento = areaComAcabamento / areaCeramica;
        valorTotal = valorMetroQuadrado * areaRevestimento;
        
        System.out.println("\nQuantidade de revestimento necessária: " + Math.ceil(areaRevestimento) + " metros quadrados");
        System.out.println("Valor total é de R$" + Math.ceil(valorTotal));

        entrada.close();
    }
}
