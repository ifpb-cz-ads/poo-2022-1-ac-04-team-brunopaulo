import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class BMExercicio06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // Fazendo a Leitura dos dias da semana
        System.out.println("Informe o numero referente ao dia da semana"); // Imprimindo e informando ao usuário.

        int dia = ler.nextInt(); // Ler os números inteiros

        while (dia!=0){

            switch (dia) {
                case 1 -> System.out.println("Domingo");

                case 2 -> System.out.println("Segunda-Feira");

                case 3 -> System.out.println("Terça-Feira");

                case 4 -> System.out.println("Quarta-Feira");

                case 5 -> System.out.println("Quinta-Feira");

                case 6 -> System.out.println("Sexta-Feira");

                case 7 -> System.out.println("Sábado");
            }

        }
        int semana = dia;


    }
}
