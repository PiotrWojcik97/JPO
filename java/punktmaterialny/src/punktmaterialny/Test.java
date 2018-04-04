package punktmaterialny;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
/* Stage I */
		
		pktMat punkt1 = new pktMat();																		// punkt1- domyslny
		pktMat punkt2 = new pktMat(5);																		// punkt2- parametry

		//punkt1
		System.out.println( punkt1.opis()+ " 1 masa: " +punkt1.getMasa() );
		System.out.println( punkt1.opis()+ " 1 moment bezwladnosci: " +punkt1.momBez() );
		System.out.println( punkt1.opis()+ " 1 moment bezwladnosci wzgledem osi: " +punkt1.steiner(2) ); 	// promien = 2
		System.out.println();
		
		//punkt2
		System.out.println( punkt2.opis()+ " 2 masa: " +punkt2.getMasa() );
		System.out.println( punkt2.opis()+ " 2 moment bezwladnosci: " +punkt2.momBez() );
		System.out.println( punkt2.opis()+ " 2 moment bezwladnosci wzgledem osi: " +punkt2.steiner(5) ); 	// promien = 5
		System.out.println();
		
		punkt1.zmienMase(10);																				// punkt1 zmiana masy = 10
		
		//punkt1
		System.out.println( punkt1.opis()+ " 1 masa: " +punkt1.getMasa() );
		System.out.println( punkt1.opis()+ " 1 moment bezwladnosci: " +punkt1.momBez() );
		System.out.println( punkt1.opis()+ " 1 moment bezwladnosci wzgledem osi: " +punkt1.steiner(2) ); 	// promien = 2
		System.out.println();
		
/* Stage II */
		
		System.out.println();
		
		ArrayList<pktMat> listaPunktow = new ArrayList<>();
		
		for( int i = 0 ; i < 3 ; i++ ) { 
			pktMat punkt = new pktMat( i+1 );
			listaPunktow.add(punkt);
		}
		
		for( int i = 0 ; i < 3 ; i++ ) {
			System.out.println( listaPunktow.get(i).opis()+ " masa: " +listaPunktow.get(i).getMasa() );
			System.out.println( listaPunktow.get(i).opis()+ " moment bezwladnosci: " +listaPunktow.get(i).momBez() );
			System.out.println( listaPunktow.get(i).opis()+ " moment bezwladnosci wzgledem osi: " +listaPunktow.get(i).steiner(2) ); 	// promien = 2
			System.out.println();
		}
		
	}
	

}