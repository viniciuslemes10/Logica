
public class TreinandoIf3 {
	public static void main(String[] args) {
		System.out.println("Teste tr�s:");
		
		int idade = 18;
		int quantidade = 3;
		boolean acompanhado;
		
		if(quantidade >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("Valor acompanhado " + acompanhado);
		
		if(idade >= 18 && acompanhado == true) {
			System.out.println("Seja bem vindo:");
		} else {
			System.out.println("Voc� n�o pode entrar.");
		}
	}
}


