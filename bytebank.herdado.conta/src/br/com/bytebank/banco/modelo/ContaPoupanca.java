package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.teste.*;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca (int agencia, int numero) {
		super(agencia,numero);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor;
			
	}
	
	public String toString() {
        return "ContaPoupanca, " + super.toString();
    }

}
