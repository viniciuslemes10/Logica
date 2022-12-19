
public class TrabalhandoIF {
	public static void main(String[] args) {
		System.out.println("Trabalando com IF:");
		int idade = 17;
		int quantidade = 1;
		if (idade >= 18) {
			System.out.println("Você pode entrar.");
			System.out.println("Seja bem vindo!");
		} else {
			if (quantidade >= 2) {
				System.out.println("Você não tem 18, porem pode entrar pois está acompanhado.");
			} else {
				System.out.println("Você não pode entrar.");
			} 
				
		}
		
	}
}
