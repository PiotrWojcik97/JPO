package punktmaterialny;

public class Pret extends pktMat{
	
	private double momentBezw;
	
	public Pret() {
		super();
		momentBezw = getMasa() / 3.0;		// promien domyslnie 1
	}
	
	public Pret( int m, int r ) {
		super(m);
		this.momentBezw = getMasa() * r * r / 3.0;
	}
	
	public String opis( boolean a ) {
		return "Pret";
	}
	
	public void zmienOs( int d ) {
		this.momentBezw += getMasa() * d * d;
	}
	
	public double getMoment() {
		return this.momentBezw;
	}
}