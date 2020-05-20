package com.mimaraslan.ana;

public class Siparis {
	
	int tutar;

	public Siparis() {
		System.out.println("Siparis Sinifinin Bos parametreli Yapilandiricisi");
	}

	public int getTutar() {
		return tutar;
	}

	public void setTutar(int tutar) {
		this.tutar = tutar;
	}

	public void toplamSonucuAl() {
		
		System.out.println("Siparis Sinifindaki Toplam Sonucunu Al Metodu");
		System.out.println("TOPLAM :"+getTutar());
		
	}
	
	
	
	

}
