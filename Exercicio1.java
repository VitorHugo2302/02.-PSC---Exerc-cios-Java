//Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos se passaram desde o início do dia (00:00).

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
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer hora, minuto, minutosTotal;
        System.out.print("Informe a hora: ");
        hora = entrada.nextInt();
        System.out.print("Informe os minutos: ");
        minuto = entrada.nextInt();
        minutosTotal = (hora * 60) + minuto;
        System.out.println(minutosTotal + " minutos se passaram desde 00:00");
        entrada.close();
    }
}
