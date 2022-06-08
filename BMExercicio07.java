import java.util.Scanner;

public class BMExercicio07 {
    public static void main(String[] args) {
        int x;
        int y = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informa um numero:");
        x = scanner.nextInt();
        do{
            if (x % 2 == 0){
                y = x / 2;
                x = y;
                System.out.println(y);
            }
            else{
                y = 3 * x + 1;
                System.out.println(y) ;
                x = y;
            }
        }while(x!=1);
    }
}


/* Escreva um programa que, dada uma variável x (com valor 180, por
exemplo), temos y de acordo com a seguinte regra:

se x é par, y = x / 2
se x é impar, y = 3 * x + 1
imprime y

O programa deve então jogar o valor de y em x e continuar até que y
tenha o valor final de 1.
Por exemplo, para x = 13, a saída será:
40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
*/
