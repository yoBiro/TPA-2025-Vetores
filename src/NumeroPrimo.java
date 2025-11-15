package prjVetores2;
import java.util.Scanner;
public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numeroA[] = new int[3]; 
		int numeroB[] = new int[3];
		int total[] = new int[3];
		int j;
		for (int i = 0; i < 3; i++) {
			numeroA[i] = ler.nextInt();
			total[i] = 0;
			for (j = 1; j < numeroA[i]; j++) {
				if (numeroA[i] % j != 0) {
					numeroB[i] = numeroA[i];
					total[i]++;
				}
			}
		}
		System.out.print("Primos [ ");
		for (int i = 0; i < 3; i++) {
			System.out.print(numeroB[i] + " ");
		}
		System.out.println(" ]");
		
		ler.close();
		}
	}
		
	
