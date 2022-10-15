package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Afficher tous les nombres de 1 à 10
for (int i=1; i<=10; i++)
	System.out.println(i);
//Afficher 0 fois nom et prénom
String st="Joseph GUILLET";
for (int i=1; i<=20; i++)
	System.out.println(st);
//Affichez les éléments pairs de 2 à 100
for (int i=2; i<=100; i++) {
	if (i%2==0) 
		System.out.println(i);	
}
//Affichez les éléments impairsde 1 à 99
for (int i=1; i<=99; i++) {
	if (!(i%2==0)) 
		System.out.println(i);	
}
	}

}
