package com.mimaraslan.ana;

public class Ucgen {

	private String cesit;
	private int yükseklik;

	// ------------------------------------------------
	public Ucgen(String cesit) {
		this.cesit = cesit;
	}

	public Ucgen(String cesit, int yükseklik) {
		super();
		this.cesit = cesit;
		this.yükseklik = yükseklik;
	}

	// ------------------------------------------------
	public String getCesit() {
		return cesit;
	}

	public void setCesit(String cesit) {
		this.cesit = cesit;
	}

	public int getYükseklik() {
		return yükseklik;
	}

	public void setYükseklik(int yükseklik) {
		this.yükseklik = yükseklik;
	}

	// ------------------------------------------------
	public void ciz() {
		System.out.println(getYükseklik() + " birim  " + getCesit() + "Ucgen Ciziniz");

	}

}
