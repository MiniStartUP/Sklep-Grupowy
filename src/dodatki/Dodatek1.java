package dodatki;

import Produkt.Podstawka;
import Produkt.Dodatki;

public class Dodatek1 extends Dodatki {

	Podstawka bonus ; 
	
	public Dodatek1 (Podstawka bonus ) {
		
		this.bonus = bonus;
		
	}
	
	@Override
	public String pobierzOpis() {
		return bonus.pobierzOpis() + " , coœ super";
	}

	@Override
	public double koszta() {
		
		return bonus.koszta() + 2;
	}

}
