package jana60.bank;

public class Conto {
	
	private int codice;
	private String nome;
	private static int saldo = 0;
	
	public Conto (int codice, String nome) {
		
		setCodice(codice);
		setNome(nome);
	}
	
	public int getCodice() {
		
		return codice;
	}
	
	private void setCodice( int codice) {
		
		this.codice = codice;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public void setNome( String nome) {
		
		this.nome = nome;
	}
	
	public int getSaldo() {
		
		return saldo;
	}
	
	private void getSaldo( int saldo) {
		
		this.saldo = saldo;
	}
	
}
