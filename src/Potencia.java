package prjVetores2;
public class Potencia {
	public static void main(String[] args) {
		final int TAM = 10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int [TAM];
		
		
		for (i=0; i<TAM; i++) {
			b[i] = (int) Math.pow(2, i);
			a[i] = b[i];
			System.out.println(b[i]);
			}
		System.out.print("Números: [ ");
		//apresentação
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print(" ]");
	}

}
