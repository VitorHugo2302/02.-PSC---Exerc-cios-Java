//Pesquise o valor aproximado de dias por mês e ajuste o programa anterior para exibir o custo mensal em energia elétrica com o equipamento inserido.

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
public class Exercicio12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Double potencia, horasPorDia, valorKWh;

        System.out.print("Informe a potência do equipamento em Watts: ");
        potencia = entrada.nextDouble();

        System.out.print("Informe a quantidade de horas que o equipamento fica ligado por dia: ");
        horasPorDia = entrada.nextDouble();

        System.out.print("Informe o valor do KW/h: ");
        valorKWh = entrada.nextDouble();

        int diasPorMes = 30;

        double consumoKWhMensal = (potencia * horasPorDia * diasPorMes) / 1000.0;

        double valorPagoMensal = consumoKWhMensal * valorKWh;

        System.out.println("\nQuantidade de KWh consumidos pelo equipamento por mês: " + consumoKWhMensal + " KWh");
        System.out.println("Custo mensal em energia elétrica: R$ " + valorPagoMensal);

        entrada.close();
    }
}
