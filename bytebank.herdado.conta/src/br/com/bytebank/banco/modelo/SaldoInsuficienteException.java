package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.teste.*;

public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
