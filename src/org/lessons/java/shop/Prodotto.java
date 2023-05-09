package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private int prezzo;
	private float iva;
	
	public Prodotto( String nome, String descrizione, int prezzo) {
		
		
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
		
		codice = rnd.nextInt(99999999);
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
	
	public int getPrezzo() {
		
		return prezzo;
	}
	
	public void setPrezzo( int prezzo) {
		
		this.prezzo = prezzo;
	}
	
	public double getIva() {
		
		return iva;
	}
	
	
	public void setIva( int prezzo) {
		
		this.iva = prezzo / 100f * 22;
	}
	
	public float prezzoNoIva( int prezzo, float iva) {
		
		return (float) (prezzo - iva);
	}
	
	public String nomeEsteso( int codice, String nome) {
		
		return codice + nome;
	}
	
	public String getPaddedCode() {
		
		String strCode = "" + codice;
		
		int strLng = strCode.length();
		
		for (int x=0; x < 8 - strLng ; x++) {
			
			strCode = "0" + strCode;
		}
		
		return strCode;
	}
	
//	toString
	@Override
	public String toString() {
		
		return "[" + getCodice() + "] Prodotto: " + getNome() + " "  + getPaddedCode() +  "\n"
				+ "Descrizione: " + getDescrizione() + "\n" 
				+ "Prezzo: " + getPrezzo() + "\n"
				+ "Iva: " + + getIva() + "\n"
				+ "Prezzo senza Iva: " + prezzoNoIva( prezzo, iva) + "\n"
				+ "Nome esteso: " + nomeEsteso(codice, nome) + "\n";
				 
	}
}
