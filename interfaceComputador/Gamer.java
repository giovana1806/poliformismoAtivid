package interfaceComputador;

public class Gamer implements Computador{
	@Override
	public void ligar() {
		System.out.println("computador gamer ligando");
	}
	@Override
	public void reiniciar() {
		System.out.println("computador gamer reiniciando");
	}
	@Override
	public void desligar() {
		System.out.println("computador gamer desligando");
	}
	@Override
	public void carregandoSistema() {
		System.out.println("computador gamer carregando o sistema");
	}
}
