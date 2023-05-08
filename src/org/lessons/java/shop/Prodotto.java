package org.lessons.java.shop;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;
	
	public Prodotto( int codice, String nome, String descrizione, double prezzo, double iva) {
		
		setCodice(codice);
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);
		
		
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
	
	public String getDescrizione() {
		
		return descrizione;
	}
	
	public void setDescrizione( String descrizione) {
		
		this.descrizione = descrizione;
	}
	
	public double getPrezzo() {
		
		return prezzo;
	}
	
	public void setPrezzo( double prezzo) {
		
		this.prezzo = prezzo;
	}
	
	public double getIva() {
		
		return iva;
	}
	
	public void setIva( double iva) {
		
		this.iva = iva;
	}
}
