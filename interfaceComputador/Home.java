package interfaceComputador;

public class Home implements Computador{
	@Override
	public void ligar() {
		System.out.println("computador home ligando");
	}
	@Override
	public void reiniciar() {
		System.out.println("computador home reiniciando");
	}
	@Override
	public void desligar() {
		System.out.println("computador home desligando");
	}
	@Override
	public void carregandoSistema() {
		System.out.println("computador home carregando o sistema");
	}
}
