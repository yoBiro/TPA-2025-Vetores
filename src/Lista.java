package prjVetores2;
import java.util.*;
public class Lista {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		String tarefas[] = new String[4];
		for (int i = 0; i < 4; i++) {
			System.out.println("Insira sua " + (i+1) + "° Tarefa:");
			tarefas[i] = ler.next();
		}
		
		for (int j = 0; j < 4; j++) {
			System.out.println(j + " - " + (tarefas[j]));
		}
		
		for (int k = 0; k < 1; k++) {
			String busca = ler.next();
			if (busca == tarefas[k]) {
				System.out.println(tarefas[k]);
			}
		}
		ler.close();
	}
}

	
