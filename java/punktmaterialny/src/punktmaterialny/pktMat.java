package punktmaterialny;

public class pktMat 
{
	private int masa;					//masa
	
	public pktMat(){ 					//konstruktor domyślny
		this.masa = 1;
	}

	public pktMat(int a){				//konstruktor z parametrem
		if(a>0){
			this.masa=a;
		}
		else{
			System.out.println("Masa musi byc wieksza od zera");
		}
	}

	public int getMasa(){				//akcesor
		return this.masa;
	}

	public int zmienMase(int c){		//akcesor
		this.masa = c;
		return this.masa;
	}
	
	public int momBez(){				//metoda obliczająca moment bezwładności
		int i = 0;
		return i;
	}

	public int steiner(int d){			//metoda obliczająca moment bezwładości z twierdzenia Steinera
		int is;
		is = momBez() + this.masa*d*d;
		return is;
	}

	public String opis(){					//metoda zwracająca opis
		return "Punkt materialny";
	}
	
}