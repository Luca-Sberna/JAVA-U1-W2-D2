import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		boolean valido = false;
		while (!valido) {
			try {
				System.out.print("Inserisci il numero di parole da inserire: ");
				n = scanner.nextInt();
				valido = true;
			} catch (InputMismatchException e) {
				System.out.println("Inserisci un numero!");
				scanner.nextLine();
			}
		}
		scanner.nextLine();

		Set<String> paroleDistinte = new HashSet<>();
		Set<String> paroleDuplicate = new HashSet<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Inserisci la parola " + (i + 1) + ": ");
			String parola = scanner.nextLine();
			if (!paroleDistinte.add(parola)) {
				paroleDuplicate.add(parola);
			}
		}

		System.out.println("Parole identiche: " + paroleDuplicate);
		System.out.println("Numero di parole diverse create: " + paroleDistinte.size());
		System.out.println("Elenco delle parole diverse: " + paroleDistinte);
		scanner.close();
	}
}