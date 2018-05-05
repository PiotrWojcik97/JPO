public class SimEngine {
		
	private double masa;			//masa
	private double k;				//wspolczynnik sprezystosci
	private double c;				//tlumienie
	private double l;				//dluosc swobodna sprezyny
	private double x;				//wspolzedna x masy
	private double v;				//predkosc masy
	private double x_pktzaw;		//polozenie punktu zawieszenia
	private double g = 9.81;		//stala grawitacji
	private double a;
	private double time;
	
	public SimEngine() {
		this.masa = 0;			//masa
		this.k = 0;				//wspolczynnik sprezystosci
		this.c = 0;				//tlumienie
		this.l = 0;				//dluosc swobodna sprezyny
		this.x = 0;				//wspolzedna x masy
		this.v = 0;				//predkosc masy
		this.x_pktzaw = 0;		//polozenie punktu zawieszenia
		this.a = 0;
		this.time = 0;
	}
	
	public SimEngine(double masa, double k, double c, double l, double g, double x, double v, double x_pktzaw) {
		this.masa = masa;				//masa
		this.k = k;						//wspolczynnik sprezystosci
		this.c = c;						//tlumienie
		this.l = l;						//dluosc swobodna sprezyny
		this.x = x;						//wspolzedna x masy
		this.v = v;						//predkosc masy
		this.x_pktzaw = x_pktzaw;		//polozenie punktu zawieszenia
		this.a = 0;
		this.time = 0;
		this.g = g;
	}
	
	public void set_x( int x ) {
		this.x = (double) x;
	}
	
	public double get_masa(){
		return this.masa;
	}
	
	public double get_k(){
		return k;
	}
	
	public double get_c(){
		return c;
	}
	
	public double get_l(){
		return l;
	}
	
	public double get_x(){
		return x*5;				//wieksze oscylacje
	}
	
	public double get_v(){
		return v;
	}
	public double get_x_pktzaw(){
		return x_pktzaw;
	}
	public double get_g(){
		return g;
	}
	
	public void simulation( double t ) {
		Vector2D przemieszczenie = new Vector2D();
		
		this.time = t;
		this.a = ( 1/masa ) * ( - k*x - c*v + masa*g );
		this.v += a*time;
		this.x += v*time + 0.5*a*time*time;
		przemieszczenie.wektor[1] = (int) x;
		przemieszczenie.wektor[0] = 0;
		System.out.println(x);
	}
	
	public void reset_simulation() {
		this.v = 0;
	}
	
}
