package Ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Esercizio2 {

	public static List<Integer> generaLista(int N) {
		List<Integer> creaLista = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < N; i++) {
			creaLista.add(rand.nextInt(101));
		}
		Collections.sort(creaLista);
		return creaLista;
	}

	public static List<Integer> invertiLista(List<Integer> lista) {
		List<Integer> nuovaLista = new ArrayList<>(lista);
		Collections.reverse(nuovaLista);
		nuovaLista.addAll(0, nuovaLista);
		return nuovaLista;
	}

	public static void stampaPariDispari(List<Integer> lista, boolean pari) {
		for (int i = 0; i < lista.size(); i++) {
			if (pari && i % 2 == 0) {
				System.out.println(lista.get(i));
			} else if (!pari && i % 2 != 0) {
				System.out.println(lista.get(i));
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> lista = generaLista(10);
		System.out.println("Lista primaria: " + lista);
		List<Integer> nuovaLista = invertiLista(lista);
		System.out.println("Nuova lista invertita: " + nuovaLista);
		System.out.println("Valori in posizioni dispari: ");
		stampaPariDispari(nuovaLista, true);
		System.out.println("Valori in posizioni pari: ");
		stampaPariDispari(nuovaLista, false);

	}

}
