package dodatki;

import Produkt.Podstawka;
import Produkt.Dodatki;

public class Dodatek2 extends Dodatki {

	Podstawka bonus2 ;
	
	public Dodatek2 (Podstawka bonus2){
		this.bonus2 = bonus2;
	}
	
	@Override
	public String pobierzOpis() {
		return bonus2.pobierzOpis() + ", cos super 2";
	}

	@Override
	public double koszta() {
		return bonus2.koszta() + 2;
	}

}
