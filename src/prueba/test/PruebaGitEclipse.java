package prueba.test;

import prueba.modelo.Saludo;

public class PruebaGitEclipse {

	public static void main(String[] args) {
		Saludo saludo = new Saludo();
		System.out.println(saludo.saludar("Juan"));
		System.out.println(saludo.saludar("Ana"));
		System.out.println(saludo.saludar("Luis"));
		System.out.println(saludo.saludar("Elena"));
	}

}
