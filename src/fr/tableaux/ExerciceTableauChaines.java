package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] st=new String []{"Nantes", "Rochelle", "Angers", "Rennes", "Laval" };
		System.out.println("Villes avant de changement");
		for (String  s  : st)
		System.out.println(s);
		System.out.println(st.length);
		st[3]="Reims";
		System.out.println("Villes apres de changement");
		for (String  s  : st)
			System.out.println(s);
	}

}
