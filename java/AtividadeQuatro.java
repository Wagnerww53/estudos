import java.util.Scanner;


   public class AtividadeQuatro {
    
	   void maiorMenor(int n, int m) {
	   if(n > m){
	   System.out.println(n + " é maior que " + m);
	   }else{
		   System.out.println(m + " é maior que " + n);
	   }
	 }
	   
	   public static void main(String[] args) {
         Scanner digitar = new Scanner(System.in);
         
      AtividadeQuatro AtividadeQuatro = new AtividadeQuatro();
	
      System.out.println("informe um valor: ");
      int valo1 = digitar.nextInt();
      
      System.out.println("informe outro valor: ");
      int valor2 = digitar.nextInt();
      
      AtividadeQuatro atividadeQuatro = new AtividadeQuatro();
	atividadeQuatro.maiorMenor(valo1, valor2);
      
      digitar.close();
	   
	   
	   }

}
