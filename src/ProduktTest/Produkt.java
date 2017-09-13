package ProduktTest;



import ProduktyBazowe.Produkt1;
import Produkt.Podstawka;
import ProduktyBazowe.Produk2;
import dodatki.Dodatek1;
import dodatki.Dodatek2;

public class Produkt {

	public static void main(String[] args) {

		Podstawka napój = new Produk2();
		System.out.println(napój.pobierzOpis() + "  " + napój.koszta() + " z³ " );
		
		Podstawka napój2 = new Produkt1();
		napój2  =  new Dodatek2(napój2);
		napój2 = new Dodatek1(napój2);
		napój2 = new Dodatek2(napój2);
		
		System.out.println(napój2.pobierzOpis() + " " + napój2.koszta() + "  z³ cena z dodatkami");
		
		
	}

}
