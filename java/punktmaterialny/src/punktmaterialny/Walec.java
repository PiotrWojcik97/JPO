package punktmaterialny;

public class Walec extends pktMat {
	
	private double momentBezw;
	
	public Walec() {
		super();
		momentBezw = getMasa() * 0.5;		// promien domyslnie 1
	}
	
	public Walec( int m, int r ) {
		super(m);
		this.momentBezw = getMasa() * r * r * 0.5;
	}
	
	public String opis( boolean a ) {
		return "Walec";
	}
	
	public void zmienOs( int d ) {
		this.momentBezw += getMasa() * d * d;
	}
	
	public double getMoment() {
		return this.momentBezw;
	}
}