package interfaceComputador;

public class Principal {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		System.out.println("----PC GAMER----");
		gamer.ligar();
		gamer.carregandoSistema();
		gamer.desligar();
		gamer.reiniciar();
		
		Home home = new Home();
		System.out.println("----PC HOME----");
		home.ligar();
		home.carregandoSistema();
		home.desligar();
		home.reiniciar();
	}

}
