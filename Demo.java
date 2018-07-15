package happyfriday;
import java.util.Scanner;

class Demo{
	public static void main(String[] args) {
		Persoon persoon = new Persoon();
		persoon.dePortemonee.geldhoeveelheid = 60;
		persoon.naam = "Frits";
		persoon.getInfo();
		Winkel winkel = new Winkel();
		winkel.winkelnaam = "Edah";
		winkel.product.prijs = 10;
		int j;
		do {
		System.out.println("In de winkel "+ winkel.winkelnaam + " kunt u spullen kopen.");
		System.out.println("Wat wilt u kopen melk toets 0 eieren toets 1");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i==1) {
			System.out.println("U wilt eieren kopen, toets het aantal:");
			winkel.aantal = sc.nextInt();
			winkel.kopen(persoon);
			
		}
		else {
			System.out.println("U wilt melk kopen toets het aantal:");
			winkel.aantal = sc.nextInt();
			winkel.kopen1(persoon);
		}
		
		persoon.getInfo();
		System.out.println("\nU wilt vast nog meer kopen? Toets 1 voor ja, 0 voor nee.");
		j = sc.nextInt();
		}
		while(j==1);
		System.out.println("Bedankt voor uw aankoop.");
	}
}
class Persoon{
	String naam;
	Portemonee dePortemonee = new Portemonee();
	int eieren = 0;
	int pakMelk = 0;
	void getInfo() {
		System.out.println("Mijn naam is " + naam + " en ik heb "+ dePortemonee.geldhoeveelheid + " euro.");
		if(eieren == 1) {
		System.out.println("Ik heb " + eieren + " ei.");
		}
		else {
			System.out.println("Ik heb " + eieren + " eieren.");
		}
		if(pakMelk==1) {
			System.out.println("Ik heb " + pakMelk + " pak melk.");
		}
		else {
			System.out.println("Ik heb " + pakMelk + " pakken melk.");
		}
	}
}
class Portemonee{
	int geldhoeveelheid;
}
class Winkel{
	int aantal;
	String winkelnaam;
	Product product = new Product();
	Ei ei = new Ei();
	Melk melk = new Melk();
		void kopen(Persoon persoon) {
			if(persoon.dePortemonee.geldhoeveelheid >= ei.prijs*aantal) {
				int restcash = persoon.dePortemonee.geldhoeveelheid - ei.prijs*aantal;
				persoon.dePortemonee.geldhoeveelheid = restcash;
				persoon.eieren+= aantal;
				}
			else {
				System.out.println("Jammer nog even sparen.");
			}
		}
		void kopen1(Persoon persoon){
			if(persoon.dePortemonee.geldhoeveelheid >= melk.prijs*aantal) {
				int restcash = persoon.dePortemonee.geldhoeveelheid - melk.prijs*aantal;
				persoon.dePortemonee.geldhoeveelheid = restcash;
				persoon.pakMelk+= aantal;
			}
			else {
				System.out.println("Jammer nog even sparen.");
			}
		}
}
	
class Product{
	int prijs;
}
class Ei{
	
	int prijs = 1;
}
class Melk{
	int prijs = 2;
}