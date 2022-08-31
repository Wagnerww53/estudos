import java.util.Scanner;

public class AtividadeDois {
  public static void main(String[] args) {
	  Scanner digite = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero para soma!");
		double valor1 = digite.nextDouble();
		
		System.out.println("Informe o segundo numero para soma!");
		double valor2 = digite.nextDouble();
		
		System.out.println("Informe o terceiro numero para soma!");
		double valor3 = digite.nextDouble();
		
		double soma = (valor1 + valor2 + valor3)/3;
		System.out.println("Á média dos tres valores é: " + soma);
	     	
        digite.close();
  }

	

}


