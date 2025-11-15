package prjVetores2;
import java.util.*;
public class Palindromo { 
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		final int TAM = 10;
		int a[] = new int[TAM], i, j = TAM-1;
		for ( i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o.Numero");
			a[i] = sc.nextInt();
			a[j] = a[i];
		}
		int palindromo = 0;
		for (i=0; i<TAM; i++) {
			if (a[i] == a[j]) {
		    j--; 
		    palindromo = 1;
			} else {
				palindromo = 0;
				}
		}
			if (palindromo ==1 ) {
				System.out.println("é um palíndromo");
		}	else {
				System.out.println("não é um palíndromo");
		}
		sc.close();
		}

	}


