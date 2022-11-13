package vtora;

public class vtora {
   public String nazivNaFakultet;
   public int brojNaSmerovi;
   public int brojNaStudenti;
   public String dekan;
   public String sediste;

   
	public void prvMetod() {
	System.out.println("Zgolemeniot boj na studenti e "+(this.brojNaStudenti + 100));
		
	}
	public int vtorMetod(int namali) {
		int namalenaVrednost= this.brojNaStudenti - namali;
		return namalenaVrednost;
     
	}
	public void pecati() {
		System.out.println("Naziv na fakultetot "+this.nazivNaFakultet+" so sediste vo "+this.sediste);
	}


}
