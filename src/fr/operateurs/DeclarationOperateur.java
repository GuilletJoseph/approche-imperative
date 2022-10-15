package fr.operateurs;

public class DeclarationOperateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		boolean testEt = a>0 && b<10;
		boolean testOu = a>0 || b<10;
		

		System.out.println("valeur testET = "+ testEt);
		System.out.println("valeur testOu = "+ testOu);
		a=a+1;
		System.out.println("a=a+1 "+ a);
		a++;
		System.out.println("a++ "+ a);
		a+=1;
		System.out.println("a+=1 "+ a);
		
		//facultatif
		a=a++;
		System.out.println("Si je prends a=a++ alors: "+ a);
		a=++a;
		System.out.println("... et si je prends a=++a alors: "+ a);
		
		String c = a>0 ? "a est plus grand que 0": "a est inférieur à 0";
		System.out.println(c);
		
		
		
	}

}
