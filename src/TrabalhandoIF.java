
public class TrabalhandoIF {
	public static void main(String[] args) {
		System.out.println("Trabalando com IF:");
		int idade = 17;
		int quantidade = 1;
		if (idade >= 18) {
			System.out.println("Voc� pode entrar.");
			System.out.println("Seja bem vindo!");
		} else {
			if (quantidade >= 2) {
				System.out.println("Voc� n�o tem 18, porem pode entrar pois est� acompanhado.");
			} else {
				System.out.println("Voc� n�o pode entrar.");
			} 
				
		}
		
	}
}
