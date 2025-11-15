package prjVetores2;
import java.util.Scanner;
public class ParesImpares {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vetorA[] = new int[5];
		int vetorB[] = new int[5];
		int iPares = 0; 
		int iImpares = 0;
		
		for(int i = 0; i < 5; i++) {
			vetorA[i] = ler.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			
			if (vetorA[i] % 2 == 0) {
				vetorB[iPares] = vetorA[i];
				vetorA[iPares] = vetorB[iPares];
				iPares++;
			}
		}
		
		for(int i = 0; i < 5; i++) {
			
			if (vetorA[i] % 2 != 0) {
				vetorB[iPares + iImpares] = vetorA[i];
				iImpares++;
			}
			
	}
        System.out.print("Números pares: ");
        for (int i = 0; i < iPares; i++) {
            System.out.print(vetorA[i] + " ");
        }

        // Mostrar ímpares
        System.out.print("Números ímpares: ");
        for (int i = iPares; i < iPares + iImpares; i++) {
            System.out.print(vetorB[i] + " ");
        }

		ler.close();
			}
	}