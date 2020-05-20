package com.mimaraslan.ana;

public class Müsteri {
	
	private Siparis siparis;

	public Müsteri() {
		System.out.println("Müsteri sinifinin bos parametreli yapilandiricisi");
	}

	public Siparis getSiparis() {
		return siparis;
	}

	public void setSiparis(Siparis siparis) {
		this.siparis = siparis;
	}
	
	public void hesabiOde() {
		System.out.println("Müsteri sinifindaki hesabi öde metodu");
		siparis.toplamSonucuAl();
	}
	

}
