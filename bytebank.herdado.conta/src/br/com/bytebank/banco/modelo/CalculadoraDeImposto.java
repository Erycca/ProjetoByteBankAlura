package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.teste.*;

public class CalculadoraDeImposto {
	
	private double totalImposto;
	
	 public CalculadoraDeImposto() {
	    }

	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
      public double getTotalImposto() {
		return totalImposto;
	}
    
}
