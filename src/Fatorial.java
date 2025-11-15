package prjVetores2;
import java.util.*;
public class Fatorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		final int TAM = 5;
		int a[] = new int [TAM];
		int b[] = new int [TAM];
		for (int i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. elemento");
			a[i] = sc.nextInt();
			int fat = 1;
            for (int j = 1; j <= a[i]; j++) {
                fat *= j;
            	}
            	b[i] = fat;
			}
		//apresentação
		System.out.print("Números: [ ");
		for (int i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print(" ]");
		sc.close();
	}

}
