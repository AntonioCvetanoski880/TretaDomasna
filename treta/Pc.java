package treta;

public class Pc {
	public int memorija;
	public String tipNaMemorija;
	public int SSD;
	public String golemina;
	
	public void main() {
		this.memorija = 2;
		this.tipNaMemorija= "DDR4";
		this.SSD = 256;
		this.golemina="GB";
		
		System.out.println("Memorijata bese "+this.memorija+this.golemina+", sega iznesuva "+(this.memorija+(2))+this.golemina);	
		System.out.println("Tipot na memorija e "+this.tipNaMemorija);
		System.out.println("SSD ima golemina od "+(this.SSD+(256))+this.golemina+". A prethodno iznesuvase "+this.SSD+this.golemina);
	}

}


