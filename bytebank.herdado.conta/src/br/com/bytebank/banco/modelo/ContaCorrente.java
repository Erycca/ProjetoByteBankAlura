package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.teste.*;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero);
	}
	

	public void saca(double valor ) throws SaldoInsuficienteException {
		double ValorASacar = valor + 0.2;
		super.saca(ValorASacar);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor;
		
	}
	
	@Override
	public double getValorImposto() {
		return super.saldo*0.01;
	}
	
	 public String toString() {
	        return "ContaCorrente, " + super.toString();
	    }
	
	
	

}
