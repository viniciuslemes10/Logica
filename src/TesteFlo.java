
public class TesteFlo {

		public static void main(String[] args)	 {
         double salario = 1270.50;
         
         
         //Este tipo de variavel recebe numeros com virgula e ele vai até 32bits e tem que declarar no final.//
         float pontoFlutuante = 3.14f;
        System.out.println(pontoFlutuante); 
         
        //este tipo de variavel é do tipo inteiro e não recebe números flutuantes ex: 3.2//
        //Este int entre parentes são chamados de casting// 
        int valor = (int) salario;
         System.out.println(valor);
		
         
         //Este tipo de variavel é usado quando utrapassa de 32bits e vai até 64bits//
		 long numeroGrande = 32148590595L;
		 System.out.println(numeroGrande);
}
}
