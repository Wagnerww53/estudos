import java.util.Scanner;

public class AtividadeUm {
 public static void main(String[] args) {
	Scanner digite = new Scanner(System.in);
	
	System.out.println("Informe o primeiro numero para soma!");
	int valor1 = digite.nextInt();
	
	System.out.println("Informe o segundo numero para soma!");
	int valor2 = digite.nextInt();
	
	System.out.println("Informe o terceiro numero para soma!");
	int valor3 = digite.nextInt();
	
	int soma = valor1 + valor2 + valor3;
	System.out.println("a soma dos tres numeros é igual a: " + soma);

	
	}

}
