package ProduktTest;



import ProduktyBazowe.Produkt1;
import Produkt.Podstawka;
import ProduktyBazowe.Produk2;
import dodatki.Dodatek1;
import dodatki.Dodatek2;

public class Produkt {

	public static void main(String[] args) {

		Podstawka nap�j = new Produk2();
		System.out.println(nap�j.pobierzOpis() + "  " + nap�j.koszta() + " z� " );
		
		Podstawka nap�j2 = new Produkt1();
		nap�j2  =  new Dodatek2(nap�j2);
		nap�j2 = new Dodatek1(nap�j2);
		nap�j2 = new Dodatek2(nap�j2);
		
		System.out.println(nap�j2.pobierzOpis() + " " + nap�j2.koszta() + "  z� cena z dodatkami");
		
		
	}

}
