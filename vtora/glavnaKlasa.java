package vtora;

public class glavnaKlasa {

	public static void main(String[] args) {
		vtora prvFaks = new vtora();
		prvFaks.nazivNaFakultet="Kliment Ohridski";
		prvFaks.brojNaSmerovi=30;
		prvFaks.brojNaStudenti=250;
		prvFaks.dekan ="Riste Risteski";
		prvFaks.sediste="Prilep";
		
		prvFaks.prvMetod();
		System.out.println("Namaleniot broj na studenti e "+prvFaks.vtorMetod(50));
	    prvFaks.pecati();
	}

}
