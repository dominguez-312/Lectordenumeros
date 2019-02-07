package ejemplos;

import java.util.Scanner;

public class Lectordenumeros {

	public static void main(String[] args) {
		int contador = 0, par = 0, impar = 0, numero;
		Scanner Sc = new Scanner(System.in);
		while (contador < 10) {
			contador = contador + 1;
			System.out.println("Introduzca un numero: ");
			numero = Sc.nextInt();
			if (numero % 2 == 0) {
				par = par + 1;
			} else {
				impar = impar + 1;

			}
			System.out.println("la contidad de numero pares es: " + par + " y la cantidad de impares es: " + impar);

		}
		Sc.close();
	}

}
