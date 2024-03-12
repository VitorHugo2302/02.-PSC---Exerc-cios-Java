//Muitas pessoas têm dúvida sobre qual o gasto com energia de determinados equipamentos que possuem. Crie um algoritmo que receba a potência do equipamento em Watts, a quantidade de horas que ele fica ligado por dia, e o valor do KW/h. O cálculo é feito multiplicando a potência pela quantidade de horas, depois, dividindo por mil. Ao final, apresente a quantidade de KWh consumidos pelo equipamento e qual será o valor pago por eles.

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
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double potencia, horasPorDia, valorKWh, consumoKWh, valorPago;

        System.out.print("Informe a potência do equipamento em Watts: ");
        potencia = entrada.nextDouble();

        System.out.print("Informe a quantidade de horas que o equipamento fica ligado por dia: ");
        horasPorDia = entrada.nextDouble();

        System.out.print("Informe o valor do KW/h: ");
        valorKWh = entrada.nextDouble();

        consumoKWh = (potencia * horasPorDia) / 1000.0;

        valorPago = consumoKWh * valorKWh;

        System.out.println("\nQuantidade de KWh consumidos pelo equipamento: " + consumoKWh + " KWh");
        System.out.println("Valor pago pelo consumo de energia: R$ " + valorPago);

        entrada.close();
    }
}
