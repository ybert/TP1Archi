import java.util.ArrayList;
import java.util.Scanner;


public class Caisse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Article> articles = new ArrayList<Article>();
		articles.add(new Article("pomme",150));
		articles.add(new Article("banane",75));
		articles.add(new Article("cerise",69));
		articles.add(new Article("apple",150));
		articles.add(new Article("mele",150));
		ArrayList<Article> pannier = new ArrayList<Article>();
		int i=0;

		while(i==0){
			Scanner sc = new Scanner(System.in);
			String nom = sc.nextLine();
			if(nom=="pomme")
				pannier.add(articles.get(0));
			else if(nom=="cerise")
				pannier.add(articles.get(2));
			else if(nom=="banane")
				pannier.add(articles.get(1));
			else if(nom=="apple")
				pannier.add(articles.get(3));
			else if(nom=="mele")
				pannier.add(articles.get(4));
			
				
				System.out.println(calculPrix(pannier));
		}


	}
	
	public static int comptePomme(ArrayList<Article> pannier){
		int cpt = 0;
		for(Article a:pannier){
			if(a.getNom()=="pomme")
				cpt++;
			
		
		}
		return cpt;
	}
	
	public static int calculPrix(ArrayList<Article> pannier){
		int total = 0;
		int reducCerise =0;
		int reducBanane = 0;
		int reducMele = 0;
		for(Article a:pannier){
			
			total = total + a.getPrix();
			if (a.getNom() == "cerise")
				reducCerise++;
			else if(a.getNom()=="banane")
				reducBanane++;
			else if(a.getNom()=="mele")
				reducMele++;
				
		}
		if (reducCerise>=0)
				total=total-20;
		if(reducBanane>=2)
				total=total-150;
		if(reducMele>=2)
				total=total-100;
		return total;
	}

}
