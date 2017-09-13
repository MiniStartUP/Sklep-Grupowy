package ProduktyBazowe;

import Produkt.Podstawka;

public class Produk2 extends Podstawka {

	public Produk2(){
		opis = "opis drugiego produktu";
	}
	
	@Override
	public double koszta() {
		
		return 8;
	}

}
