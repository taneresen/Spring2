package com.mimaraslan;

public class Personel {
	
	String adi,soyadi,telNo,adres;
	String anneAdi, babaAdi;
	int dogumYili, maas;
	boolean ehliyet, medeniHali;
	
	String epostaAdresi;
	

	
	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getAnneAdi() {
		return anneAdi;
	}
	public void setAnneAdi(String anneAdi) {
		this.anneAdi = anneAdi;
	}
	public String getBabaAdi() {
		return babaAdi;
	}
	public void setBabaAdi(String babaAdi) {
		this.babaAdi = babaAdi;
	}
	public int getDogumYili() {
		return dogumYili;
	}
	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	public boolean isEhliyet() {
		return ehliyet;
	}
	public void setEhliyet(boolean ehliyet) {
		this.ehliyet = ehliyet;
	}
	public boolean isMedeniHali() {
		return medeniHali;
	}
	public void setMedeniHali(boolean medeniHali) {
		this.medeniHali = medeniHali;
	}
	@Override
	public String toString() {
		return "Personel [adi=" + adi + ", soyadi=" + soyadi + ", \ntelNo=" + telNo + ", adres=" + adres + ", \nanneAdi="
				+ anneAdi + ", babaAdi=" + babaAdi + ", \ndogumYili=" + dogumYili + ", \nmaas=" + maas + ", \nehliyet="
				+ ehliyet + ", medeniHali=" + medeniHali + "]";
	}
	
	
	
	

}
