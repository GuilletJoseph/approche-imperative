package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 //Afficher l’ensemble des éléments du tableau grâce à une boucle
		 for(int i:array) 
			 System.out.print(i+" ");
			 System.out.println("");
		 
		 //Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		 for(int i=array.length-1; i>=0; i--) 
			 System.out.print(array[i]+" ");
			 System.out.println("");
		 //afficher que les entiers supérieurs à 3
		 for(int i=0; i<array.length; i++) {
			 if (array[i]>3)
			 System.out.print(array[i]+" ");
		 }
			 System.out.println("");
		 
			// afficher que les entiers pairs
			 for(int i=0; i<array.length; i++) {
				 if (array[i]%2==0)
				 System.out.print(array[i]+" ");
			 }
				 System.out.println("");
				 
		//afficher que valeurs des index pairs
				 for(int i=0; i<array.length; i++) {
					 if (i%2==0)
					 System.out.print(array[i]+" ");
				 }
				 System.out.println("");
				 //afficher que les entiers impairs
				 for(int i=0; i<array.length; i++) {
					 if (!(array[i]%2==0))
					 System.out.print(array[i]+" ");
				 }
				 System.out.println("");
		 
	}

}
