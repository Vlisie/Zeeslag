package happyfriday;

import java.util.Scanner;
	class Vechten{
		public static void main(String[] args) {
			Strijder strijder1 = new Strijder("Subzero", 124);
			Strijder strijder2 = new Strijder("Raiden", 115);
			char j;
			char k;
			strijder1.introduceren();
			strijder2.introduceren();
		
		System.out.println("Sla met de toetsen j en k");
		Scanner sc = new Scanner(System.in);
		j  = sc.next().charAt(0);
		if(j==j) {
			strijder1.slaan(strijder2);
			strijder1.introduceren();
			strijder2.introduceren();
		}
		k = sc.next().charAt(0);
		if(k==k) {
			strijder2.slaan(strijder1);
			strijder1.introduceren();
			strijder2.introduceren();
		}
		}	
		
	}
	class Strijder{
		int hp;
		String naam;
		Wedstrijd wedstrijd = new Wedstrijd();
		Strijder(String deNaam, int hp){
			naam = deNaam;
			this.hp = hp;
		}
		void introduceren(){
			System.out.println("Hoi ik ben "+ naam + " en ik heb "+ hp +"health");
		}
		
		void slaan(Strijder geslagenStrijder) {
			if(!wedstrijd.afgelopen) {
				if(geslagenStrijder.hp > 0) {
					System.out.println(naam + " slaat "+ geslagenStrijder.naam);
					geslagenStrijder.hp -= 20;
					if(geslagenStrijder.hp <= 10) {
						System.out.println("Finish him");
					}
				}
				else {
					geslagenStrijder.doodgaan();
					System.out.println(naam + " heeft gewonnen");
					wedstrijd.afgelopen=true;
				}
			}else {
				System.out.println("wedstrijd is afgelopen");
			}
		}
		void doodgaan() {
			System.out.println(naam + " zegt: Auw");
			
		}
		
	}
class Wedstrijd{
	boolean afgelopen;
}

