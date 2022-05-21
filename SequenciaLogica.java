/*

** Detalhe

Desenvolva um programa capaz de ler um valor inteiro N. N * 2 linhas de saída vão ser apresentadas na execução do programa, seguindo a lógica do exemplo mais abaixo. Para os valores com mais de seis dígitos, todos os dígitos devem ser apresentados.

** Entrada

O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

** Saída

Imprima a saída conforme o exemplo fornecido.

*/

import java.io.IOException;
import java.util.Scanner;

// Abaixo segue um exemplo de código que você pode ou não utilizar

public class Desafio {	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();

//TODO: Complete os espaços em branco com uma solução possível

		for (int i = 1; i <= N; i++) {
			System.out.println((int)Math.pow(i, 1) + " " + (int)Math.pow(i, 2) + " " + (int)Math.pow(i, 3));
			System.out.println((int)Math.pow(i, 1) + " " + ((int)Math.pow(i, 2)+1) + " " + ((int)Math.pow(i, 3) + 1));
		}
    }
}