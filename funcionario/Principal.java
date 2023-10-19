package polimorfismo.funcionario;

public class Principal {

	public static void main(String[] args) {
		Jornada jornada = new Jornada(5, "ana", "15 99807-1806", 4007, "rua casas cidade");
		System.out.println("--SALARIO JORNADA--");
		System.out.println(jornada.calcularSalario(5, 10));
		
		Horista horista = new Horista(5, "ana", "15 99807-1806", 4007, "rua casas cidade");
		System.out.println("--SALARIO HORISTA--");
		System.out.println(horista.calcularSalario(50, 10));
		
		PessoaJuridica pessoa = new PessoaJuridica(5, "ana", "15 99807-1806", 4007, "rua casas cidade");
		System.out.println("--SALARIO PESSOA JURIDICA--");
		System.out.println(pessoa.calcularSalario(1000, 57));
	}	
}