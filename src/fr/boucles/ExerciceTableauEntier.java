package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Déclarer un tableau d’entiers contenant tous les entiers de 1 à 10
		int [] arr= new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//Afficher le premier élément du tableau
		System.out.println(arr[0]);
		//Afficher la longueur du tableau
		System.out.println(arr.length);
		//Afficher le dernier élément du tableau
		System.out.println(arr.length-1);
		//Modifier la valeur de l’élément d’index 4 et donnez lui la valeur 8
		arr[4]=8;
		
	}

}
