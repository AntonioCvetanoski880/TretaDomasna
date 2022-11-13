package prva;

public class Avtomobil {
    public String marka;
    public String model;
    public String boja;
    public double pominatiKm;
    public int godinaNaP;
    public String reg;
    
    
	public  Avtomobil(String marka,String model,String boja,double pominatiKm,int godinaNaP,String reg ) {
	this.marka = marka;
	this.model = model;
	this.boja = boja;
	this.pominatiKm = pominatiKm;
	this.godinaNaP = godinaNaP;
	this.reg = reg;
	
	}
public void prvMetod() {
	System.out.println(this.marka+" "+this.model+" "+this.boja+" "+this.pominatiKm+" "+this.godinaNaP+" "+this.reg);
}
public double vtorMetod() {
	double pkm;
	pkm = this.pominatiKm + 1520.25;
	return pkm;
}
	

}
