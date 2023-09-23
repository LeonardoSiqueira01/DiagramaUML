
public class aplicacaoJava {

	public static void main(String[] args) {
		Celular iphone = new Celular();
		iphone.Ligar();
		iphone.Desligar();
		iphone.iniciarCorrerioVoz();
		iphone.Desligar();
		
		iphone.selecionarMusica();
		iphone.Tocar();
		iphone.Pausar();
		
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
	}

}
