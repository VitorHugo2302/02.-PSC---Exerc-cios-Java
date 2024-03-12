//Faça um programa que calcule o tempo necessário para o download de um arquivo qualquer da internet. Deve-se informar o tamanho do arquivo em MB, a velocidade do link em Mbps e, retornar o tempo total em minutos.

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
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double tamanhoArquivoMB, velocidadeLinkMbps, velocidadeMBps, tempoTotalSegundos, tempoTotalMinutos;

        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
        tamanhoArquivoMB = entrada.nextDouble();

        System.out.print("Digite a velocidade do link de internet (em Mbps): ");
        velocidadeLinkMbps = entrada.nextDouble();
        velocidadeMBps = velocidadeLinkMbps / 8;

        tempoTotalSegundos = tamanhoArquivoMB / velocidadeMBps;
        tempoTotalMinutos = tempoTotalSegundos / 60;

        System.out.println("\nTempo total para o download é de: " + tempoTotalMinutos + " minutos");

        entrada.close();
    }
}
