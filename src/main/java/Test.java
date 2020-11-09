import static org.junit.Assert.assertEquals;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Panier p1 = new Panier (5);
		
		p1.ajouterOrange(new Orange("France", 0.80)); 
		p1.ajouterOrange(new Orange("Espagne", 0.80)); 
		p1.ajouterOrange(new Orange("Floride", 0.90)); 
		p1.ajouterOrange(new Orange("Floride", 1.15)); 
		p1.ajouterOrange(new Orange("Floride", 1.35)); 	
		
		System.out.println(p1.getPrix());
		
		

	}

}
