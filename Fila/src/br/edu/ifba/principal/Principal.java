package br.edu.ifba.principal;

import br.edu.ifba.basica.Contato;
import br.edu.ifba.linked.Ligada;

public class Principal {
	
	
	public static void main(String[] args) {
		
		Ligada l = new Ligada();
		Contato c1 = new Contato("Sicrano", "0987654");
		Contato c2 = new Contato("Beltrano","12233445");
		Contato c3 = new Contato("Clara", "988785887");
		
		l.inserir(c1);
		l.mostrar();
		l.inserir(c2);
		l.mostrar();
		l.inserir(c3);
		l.mostrar();
		l.remover();
		l.mostrar();
		l.remover();
		l.mostrar();

	}

}
