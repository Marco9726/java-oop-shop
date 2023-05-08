package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;
	
	public Prodotto( String nome, String descrizione, double prezzo) {
		
		
		setCodice();
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(prezzo);
			
	}
	
	public int getCodice() {
		
		return codice;
	}
	
	private void setCodice() {
		
		Random rnd = new Random();
		
		codice = rnd.nextInt(101);
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
	
	
	public void setIva( double prezzo) {
		
		this.iva = prezzo / 100 * 22;
	}
	
	public double prezzoNoIva( double prezzo, double iva) {
		
		return prezzo - iva;
	}
	
	public String nomeEsteso( int codice, String nome) {
		
		return codice + nome;
	}
	
//	public String codiceCompleto ( int codice) {
//		
//		String cod = this.codice + "";
//		
//		
//		for ( int i = 7; i < cod.length(); i-- ) {
//			
//			String zeri = "00000000";
//			
//			
//			int count = cod.length() -1;
//			
//			zeri.charAt(i) = cod.charAt(count--);
//		}
//		
//		
//	}
	
	@Override
	public String toString() {
		
		String cod = this.codice + "";
		
		return "[" + getCodice() + "] Prodotto: " + getNome() + "\n"
				+ "Descrizione: " + getDescrizione() + "\n" 
				+ "Prezzo: " + getPrezzo() + "\n"
				+ "Iva: " + + getIva() + "\n"
				+ "Prezzo senza Iva: " + prezzoNoIva( prezzo, iva) + "\n"
				+ "Nome esteso: " + nomeEsteso(codice, nome) + "\n";
				 
	}
}
