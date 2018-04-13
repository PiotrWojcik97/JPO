public class SimEngine {
	public static void main(String[] args) {
		Vector2D wektor1 = new Vector2D(1,0);				//pkt1
		Vector2D wektor2 = new Vector2D(1,3);
		
		int[] wektorsuma = new int[2];						//pkt2
		int[] wektorroznica = new int[2];
		
		wektorsuma = wektor1.dodaj(wektor2.zwroc() );
		wektorroznica = wektor1.odejmij(wektor2.zwroc() );
		
		double[] wektornorm1 = new double[2];						//pkt3
		double[] wektornorm2 = new double[2];
		
		wektornorm1[0] = wektor1.wektor[0] / wektor1.dlugosc();
		wektornorm1[1] = wektor1.wektor[1] / wektor1.dlugosc();
		
		wektornorm2[0] = wektor2.wektor[0] / wektor2.dlugosc();
		wektornorm2[1] = wektor2.wektor[1] / wektor2.dlugosc();
		
		double dlugosc1 = wektor1.dlugosc();				//pkt4
		double dlugosc2 = wektor2.dlugosc();
		
		int stala = 3;										//pkt5
		int[] wektormnoz = new int[2];
		wektormnoz = wektor1.pomnoz(stala);
		

		System.out.println("Wektor 1: [" +wektor1.wektor[0]+","+wektor1.wektor[1]+"]" );
		System.out.println("Wektor 2: [" +wektor2.wektor[0]+","+wektor2.wektor[1]+"]" );
		System.out.println("Wektor zsumowany: [" +wektorsuma[0]+","+wektorsuma[1]+"]" );
		System.out.println("Wektor odejmowany: [" +wektorroznica[0]+","+wektorroznica[1]+"]" );
		System.out.println("Wektor normalny 1: [" +wektornorm1[0]+","+wektornorm1[1]+"]" );
		System.out.println("Wektor normalny 2: [" +wektornorm2[0]+","+wektornorm2[1]+"]" );
		System.out.println("Dlugos wektora 1: " +dlugosc1 );
		System.out.println("Dlugos wektora 2: " +dlugosc2 );
		System.out.println("Stala: " +stala );
		System.out.println("Iloczyn wektora 1 i stalej: [" +wektormnoz[0]+","+wektormnoz[1]+"]" );
	}
}
