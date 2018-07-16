package happyfriday;

public class School {

	public static void main(String[] args) {
		
		Werknemer directeur = new Werknemer();
		directeur.hoogteRang = 5;
		Werknemer hrmanager = new Werknemer();
		hrmanager.hoogteRang = 4;
		Werknemer accountmanager = new Werknemer();
		accountmanager.hoogteRang = 3;
		Werknemer schoonmaker = new Werknemer();
		schoonmaker.hoogteRang = 1;
		
		directeur.wachttijd(true);
		hrmanager.wachttijd(false);
	}

}
class Werknemer{
	String naam;
	int hoogteRang;
	Auto auto = new Auto();
	
	void wachttijd(boolean stuk) {
		if(hoogteRang > 3 && stuk==true) {
			try {
				auto.rijden(true);
			} catch (Exception e) {
				
				System.out.println("Binnen 30min een nieuwe auto");
			}
			
		}else if(hoogteRang>1 && hoogteRang< 4 && stuk==true) {
			try {
				auto.rijden(true);
			} catch (Exception e) {
				
				System.out.println("Binnen twee uur een nieuwe auto.");
			} 
			
		}else {
			try {
				auto.rijden(true);
			} catch (Exception e) {
				
				System.out.println("Pak maar de trein.");
			}
			
		}
	}
}
class Auto{
	String automerk;
	
	void rijden(boolean stuk) throws Exception{
		if(stuk == true ) {
			throw new Exception();
		}else {
			
			System.out.println("De auto rijdt naar behoren.");
		}
	}
	
}
