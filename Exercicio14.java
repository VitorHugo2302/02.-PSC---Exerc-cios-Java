//Escreva um algoritmo que recebe dois pontos no plano cartesiano, P1=(x1,y1) e P2=(x2,y2)e calcula a distância entre eles, dada por d(P1,P2)=(x1-x2)2+(y1-y2)2 .

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
public class Exercicio14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Double x1, y1, x2, y2, distancia;

        System.out.print("Informe a coordenada x do primeiro ponto: ");
        x1 = entrada.nextDouble();

        System.out.print("Informe a coordenada y do primeiro ponto: ");
        y1 = entrada.nextDouble();

        System.out.print("Informe a coordenada x do segundo ponto: ");
        x2 = entrada.nextDouble();

        System.out.print("Informe a coordenada y do segundo ponto: ");
        y2 = entrada.nextDouble();

        distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        System.out.println("\nA distância entre os pontos P1 e P2 é de: " + distancia);

        entrada.close();
    }
}
