import java.util.Scanner;

  public class AtividadeTres {
    public static void main(String[] args) {	
     Scanner resultado = new Scanner(System.in);
     
     System.out.println("informe um valor para obter uma quinta parte: ");
     int valor1 = resultado.nextInt();
     
     int quintaParte = valor1 / 5;
     
     System.out.println("a quinta parte de " + valor1 + " = " + quintaParte);
     
     resultado.close();
 }

}
