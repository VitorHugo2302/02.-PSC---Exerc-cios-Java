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
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String genero;
        Integer variavelPorGenero1;
        Double variavelPorGenero2;

        System.out.print("Qual o seu gênero? (M ou F) ");
        genero = entrada.nextLine();

        variavelPorGenero2 = 0.0;
        variavelPorGenero1 = 0;

        if ("M".equals(genero)) {
            variavelPorGenero1 = 52;
            variavelPorGenero2 = 0.75;
        } else if ("F".equals(genero)) {
            variavelPorGenero1 = 49;
            variavelPorGenero2 = 0.67;
        }

        System.out.print("Digite o peso atual em KG: ");
        double pesoAtual = entrada.nextDouble();

        System.out.print("Digite a altura em centímetros: ");
        double alturaCentimetros = entrada.nextDouble();

        double pesoIdeal = variavelPorGenero1 + (variavelPorGenero2 * (alturaCentimetros - 152.4));
        double pesoIdealAjustado = ((pesoAtual - pesoIdeal) * 0.25) + pesoIdeal;

        System.out.println("Peso ideal: " + pesoIdeal + " kg");
        System.out.println("Peso ideal ajustado: " + pesoIdealAjustado + " kg");

        entrada.close();
    }
}
