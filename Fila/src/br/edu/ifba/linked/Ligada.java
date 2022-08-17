package br.edu.ifba.linked;

import java.util.LinkedList;

import br.edu.ifba.basica.Contato;

public class Ligada {
	
	LinkedList<Contato>lista = new LinkedList<Contato>();
	
	
	public void inserir(Contato info) {
		
		if(!verificar()) {
			lista.addFirst(info);
		}else {
			lista.addLast(info);
		}
	}
	public void remover() {
		 this.lista.removeFirst();
	}

	public boolean verificar() {
		if(lista.isEmpty()) {
			return false;
		}else {
			return true;
		}

	}

	public void mostrar() {
		System.out.println("\n" + lista.toString());
	}
	}
	
	

