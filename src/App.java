/*Faça um programa para imprimir:
    1
    1   2
    1   2   3
    .....
    1   2   3   ...  n
para um n informado pelo usuário. Use uma função que receba um valor n inteiro imprima até a n-ésima linha.
*/
import java.util.Scanner;

class App {
	
	public void print(int n) {
		for (int i = 1; i <= n; i++) { //para imprimir o primeiro número da linha
			for (int j = 1; j <= i; j++) { //para imprimir os outros números de acordo com o j.
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			App e = new App();
			System.out.println("Digite o Número \"n\":");
			
			e.print(scan.nextInt());
		}		
	}
}
