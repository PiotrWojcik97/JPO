package punktmaterialny;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
/* Stage I */
		Walec walec1 = new Walec(2,2);
		Kula kula1 = new Kula(2,2);
		Pret pret1 = new Pret(2,2);
		
		//Walec1
		System.out.println(walec1.opis(true) + " masa: " + walec1.getMasa() );
		System.out.println(walec1.opis(true) + " moment bezw: " + walec1.getMoment() + "\n" );
		//Kula1
		System.out.println(kula1.opis(true) + " masa: " + kula1.getMasa() );
		System.out.println(kula1.opis(true) + " moment bezw: " + kula1.getMoment() + "\n" );
		//Pret1
		System.out.println(pret1.opis(true) + " masa: " + pret1.getMasa() );
		System.out.println(pret1.opis(true) + " moment bezw: " + pret1.getMoment() + "\n" );

/* Stage II */
		ArrayList<pktMat> listaBryl = new ArrayList<>();
		
		for( int i = 1 ; i < 4 ; i++) {
			if( i % 3 == 0 ) {
				Walec walec2 = new Walec(i,i);
				listaBryl.add(walec2);
			}
			else if( i % 3 == 1 ) {
				Kula kula2 = new Kula(i,i);
				listaBryl.add(kula2);
			}
			else if( i % 3 == 2 ) {
				Pret pret2 = new Pret(i,i);
				listaBryl.add(pret2);
			}
			else {
				System.out.println("Error in loop 1");
				break;
			}
		}
		
		for ( pktMat i : listaBryl ) {
			if( i instanceof Walec) {
				System.out.println( ( (Walec)i ).opis(true) + " masa: " + i.getMasa() );
				System.out.println( ( (Walec)i ).opis(true) + " moment bezw: " + ( (Walec)i ).getMoment() + "\n" );
			}
			else if( i instanceof Kula) {
				System.out.println( ( (Kula)i ).opis(true) + " masa: " + i.getMasa() );
				System.out.println( ( (Kula)i ).opis(true) + " moment bezw: " + ( (Kula)i ).getMoment() + "\n" );
			}
			else if( i instanceof Pret) {
				System.out.println( ( (Pret)i ).opis(true) + " masa: " + i.getMasa() );
				System.out.println( ( (Pret)i ).opis(true) + " moment bezw: " + ( (Pret)i ).getMoment() + "\n" );
			}
			else {
				System.out.println("Error in loop 2");
				break;
			}
			
		}
/* Stage III */
		for ( pktMat i : listaBryl ) {
			if( i instanceof Walec) {
				( (Walec)i ).zmienOs( 2 );
				System.out.println( ( (Walec)i ).opis(true) + " moment bezw: " + ( (Walec)i ).getMoment() + "\n" );
			}
			else if( i instanceof Kula) {
				( (Kula)i ).zmienOs( 2 );
				System.out.println( ( (Kula)i ).opis(true) + " moment bezw: " + ( (Kula)i ).getMoment() + "\n" );
			}
			else if( i instanceof Pret) {
				( (Pret)i ).zmienOs( 2 );
				System.out.println( ( (Pret)i ).opis(true) + " moment bezw: " + ( (Pret)i ).getMoment() + "\n" );
			}
			else {
				System.out.println("Error in loop 3");
				break;
			}
		}
	}
}