package punktmaterialny;

public class Kula extends pktMat {
	
	private double momentBezw;
	
	public Kula() {
		super();
		momentBezw = getMasa() * 0.4;		// promien domyslnie 1
	}
	
	public Kula( int m, int r ) {
		super(m);
		this.momentBezw = getMasa() * r * r * 0.4;
	}
	
	public String opis( boolean a ) {
		return "Kula";
	}
	
	public void zmienOs( int d ) {
		this.momentBezw += getMasa() * d * d;
	}
	
	public double getMoment() {
		return this.momentBezw;
	}

}
