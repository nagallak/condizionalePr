package condizioni;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=1;
		int i=10;
		boolean b1=true;
		boolean b2=i<5;
		//int prima = 22; se la dichiaro prima del blocco secondario il programma mi da l'errore
		
		
		if(x==1)
		{
			
			System.out.println("if funziona");
			int prima = 3;
			System.out.println(prima);
		}
	
		int prima = 22;// dopo il blocco interno non ho problemi ,perche la variabile e stata gia cancellata
	
		System.out.println(prima);
	}

}
