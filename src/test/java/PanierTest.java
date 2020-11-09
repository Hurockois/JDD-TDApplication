import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/*
 * 
 * @ Before : pour les initialisations de p1, p2. 
 * throw: une nouvelle méthode : avec l'indication que ca doit retourner une exception @Test ( expected=....)
 * l'égalité des paniers
 */

public class PanierTest {
	private Panier p1;
	private Panier p2;
	private Panier p3;
	
	@Before
	public void init(){
		p1 = new Panier(10);
		p2 = new Panier(10);
		p3 = new Panier(10);
	}	
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test public void testAttributs(){	
		p1.ajouterOrange(new Orange("France", 0.80)); 
		assertEquals(10, p1.getContenance());
	}
	
	@Test
	public void retirerOrange(){
			
		p1.ajouterOrange(new Orange("France", 0.80)); 
		p1.retirerOrange();		
		
		assertTrue(p1.estVide());
	}
	
	@Test
	public void testPanierPlein(){
		Panier p1 = new Panier (2);	
		
		p1.ajouterOrange(new Orange("France", 0.80)); 
		p1.ajouterOrange(new Orange("Senegal", 0.80)); 		
		assertTrue(p1.estPlein());	
	}
	
	@Test(expected=IllegalArgumentException. class)
	public void testAjouterElementSiPanierPlein(){
		Panier p1 = new Panier (2);			
		p1.ajouterOrange(new Orange("France", 0.80)); 
		p1.ajouterOrange(new Orange("Senegal", 0.80)); 		
		p1.ajouterOrange(new Orange("Maroc", 0.80));		
	}

	
	@Test
	public void testPanierVide(){
		Panier p1 = new Panier (2);			
		assertTrue(p1.estVide());
		
		p1.ajouterOrange(new Orange("France", 0.80)); 
		assertFalse(p1.estVide());
	}
	@Test	
	public void testEquivalencePanier() {
		Panier p1 = new Panier (8);
		Panier p2 = new Panier (8);
		p1.ajouterOrange(new Orange("France", 0.80)); 
		p1.ajouterOrange(new Orange("Espagne", 0.80)); 
		p1.ajouterOrange(new Orange("Floride", 0.90)); 
		p1.ajouterOrange(new Orange("Floride", 1.15)); 
		p1.ajouterOrange(new Orange("Floride", 1.35)); 
		
		 
		p2.ajouterOrange(new Orange("Espagne", 0.80)); 
		p2.ajouterOrange(new Orange("Floride", 0.90)); 
		p2.ajouterOrange(new Orange("Floride", 1.15)); 
		p2.ajouterOrange(new Orange("Floride", 1.35)); 
		p2.ajouterOrange(new Orange("France", 0.80));
		
		
		assertEquals(p1,p2);
		
		p2.ajouterOrange(new Orange("Senegal", 0.75)); 
		
		assertNotEquals(p1,p2);
	}
	@Test	
	public void testBoycottOrigine() {
		Panier p1 = new Panier (5);
		
		p1.ajouterOrange(new Orange("France", 0.80)); 
		p1.ajouterOrange(new Orange("Espagne", 0.80)); 
		p1.ajouterOrange(new Orange("Floride", 0.90)); 
		p1.ajouterOrange(new Orange("Floride", 1.15)); 
		p1.ajouterOrange(new Orange("Floride", 1.35)); 	

		assertEquals(5, p1.getOranges().size());
		p1.boycottOrigine("Floride");
		assertEquals(2, p1.getOranges().size());

	}
	
	@Test	
	public void testTotalPanier() {
		Panier p1 = new Panier (5);
		
		p1.ajouterOrange(new Orange("France", 0.80)); 
		p1.ajouterOrange(new Orange("Espagne", 0.80)); 
		p1.ajouterOrange(new Orange("Floride", 0.90)); 
		p1.ajouterOrange(new Orange("Floride", 1.15)); 
		p1.ajouterOrange(new Orange("Floride", 1.35)); 	

		assertTrue(5.0== p1.getPrix());


	}
}
