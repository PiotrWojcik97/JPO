import static java.lang.Math.sqrt;

public class Vector2D {
	
	public int[] wektor = new int[2];
	
	public Vector2D(){
		this.wektor[0] = 0;
		this.wektor[1] = 0;
	}
	
	public Vector2D( int x, int y ){
		this.wektor[0] = x;
		this.wektor[1] = y;
	}
	
	public int[] dodaj( int[] wektorek ) {
		int[] temp = new int[2];
		temp[0] = wektorek[0] + this.wektor[0];
		temp[1] = wektorek[1] + this.wektor[1];
		return temp;
	}
	
	public int[] odejmij( int[] wektorek ) {
		int[] temp = new int[2];
		temp[0] = this.wektor[0] - wektorek[0] ;
		temp[1] = this.wektor[1] - wektorek[1];
		return temp;
	}
	
	public int[] pomnoz( int a ) {
		int[] temp = new int[2];
		temp[0] = a * this.wektor[0];
		temp[1] = a * this.wektor[1];
		return temp;
	}
	
	public double dlugosc() {
		return sqrt( (this.wektor[0] * this.wektor[0]) + (this.wektor[1] * this.wektor[1])  );
	}
	
	public int[] zwroc() {
		return wektor;
	}
	
}
