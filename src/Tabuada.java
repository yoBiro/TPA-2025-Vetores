 package prjVetores2;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 5;
        int[] a = new int[TAM];

        // Leitura dos números
        for (int i = 0; i < TAM; i++) {
            System.out.print("Entre com o " + (i + 1) + "o. valor: ");
            a[i] = ler.nextInt();
        }

        // Apresentação das tabuadas
        for (int i = 0; i < TAM; i++) {
            System.out.println("Tabuada de " + a[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(a[i] + " x " + j + " = " + (a[i] * j));
            }
        }

        ler.close();
    }
}
