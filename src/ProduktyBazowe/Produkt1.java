package ProduktyBazowe;

import Produkt.Podstawka;

public class Produkt1 extends Podstawka {

	
	public Produkt1() {

		opis = " opis pierwszego produktu";
	
	}
	@Override
	public double koszta() {
		
		return 10; // tu podajemy cenê
	}

}
