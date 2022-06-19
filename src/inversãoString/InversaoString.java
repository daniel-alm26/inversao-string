package inversãoString;

import java.util.Scanner;

public class InversaoString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a palavra para inversão da String: ");
		String palavra = sc.next();
		String novaPalavra = "";
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			novaPalavra = novaPalavra + Character.toString(palavra.charAt(i));
		}
		System.out.println(novaPalavra);
		
		
		sc.close();
	}
}
