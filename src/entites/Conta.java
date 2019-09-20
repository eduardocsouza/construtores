package entites;

public class Conta {
	
	private static final double TAXA = 0.05;

	private int nConta;
	private String nome;
	private double saldo;
	
	public Conta() {
	}
	
	public Conta(String nome, int nConta) {
		this.nome = nome;
		this.nConta = nConta;
	}
	
	public Conta(String nome, int nConta, double saldo) {
		this.nome = nome;
		this.nConta = nConta;
		this.saldo = saldo;
	}
	
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getnConta() {
		return nConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double dep) {
		saldo += dep;
	}
	
	public void saque(double saque) {
		saldo -= saque + saque * TAXA;
	}
	
	@Override
	public String toString() {
		return "Conta " 
				+ nConta
				+ ", "
				+ "Titular: "
				+ nome
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
	}
}
