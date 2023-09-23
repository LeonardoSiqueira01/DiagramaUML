import java.util.List;

public class Celular implements ReprodutorMusicial, NavegadorNaInternet {


	private int NumeroProprio;

	private List<String> ListaContatos;

	private ReprodutorMusicial Musicas;

	private NavegadorNaInternet SafariWebBrowser;

	protected void Ligar() {
		System.out.println("Ligando...");

	}

	protected void Atender() {
		System.out.println("Chamada Atendida...");

	}
	protected void Desligar() {
		System.out.println("Desligando chamada...");
	}

	public void iniciarCorrerioVoz() {
		System.out.println("Correio de voz iniciado...");

	}

	private String EncontrarContato() {
		return ListaContatos.get(1);
	}


	/**
	 * @see ReprodutorMusicial#Tocar()
	 */
	public void Tocar() {
		System.out.println("Tocando musica...");
	}


	/**
	 * @see ReprodutorMusicial#Pausar()
	 */
	public void Pausar() {
System.out.println("Musica pausada..");
	}


	/**
	 * @see ReprodutorMusicial#selecionarMusica()
	 */
	public void selecionarMusica() {
			
			System.out.println(musicas.get(1));
	}


	/**
	 * @see NavegadorNaInternet#exibirPagina()
	 */
	public void exibirPagina() {

	}


	/**
	 * @see NavegadorNaInternet#adicionarNovaAba()
	 */
	public void adicionarNovaAba() {
System.out.println("Nova aba aberta....");
	}


	/**
	 * @see NavegadorNaInternet#atualizarPagina()
	 */
	public void atualizarPagina() {
System.out.println("Pagina atualizada...");
	}

}
