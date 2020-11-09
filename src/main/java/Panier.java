import java.util.ArrayList;

public class Panier {
	public ArrayList<Orange> oranges = new ArrayList<Orange>();
	private int contenance;

	public Panier(ArrayList<Orange> oranges, int contenance) {
		super();
		this.oranges = oranges;
		this.contenance = contenance;
	}

	public boolean estPlein() {
		if (this.contenance == oranges.size()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean estVide() {

		if (this.oranges.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return oranges.toString();
	}

	@Override
	public boolean equals(Object obj) {
		Panier p = (Panier) obj;
		// TODO Auto-generated method stub
		if (p.getContenance() == this.getContenance()) {	
			for (Orange o: p.getOranges()) {				
				if (!this.getOranges().contains(o)) {
					return false;
				}
			}			
			return true;			
		} else {
			return false;
		}
	}

	public ArrayList<Orange> getOranges() {
		return oranges;
	}

	public void setOranges(ArrayList<Orange> oranges) {
		this.oranges = oranges;
	}

	public int getContenance() {
		return contenance;
	}

	public void setContenance(int contenance) {
		this.contenance = contenance;
	}

	public void ajouterOrange(Orange o) {
		if (this.estPlein() == false) {
			oranges.add(o);
		} else {
			throw new IllegalArgumentException("Le panier est plein, sa contenance est de " + this.contenance);
		}

	}

	public void retirerOrange() {
		oranges.remove(oranges.size() - 1);
	}

	public double getPrix() {
		double total = 0;
		for (Orange o : oranges) {
			total += o.getPrix();
		}
		return total;
	}

	public void boycottOrigine(String pays) {
		ArrayList<Orange> liste = new ArrayList<Orange>(this.oranges);

		for (Orange o : liste) {
			if (o.getOrigine() == pays) {
				oranges.remove(o);
			}
		}
	}

	public Panier(int contenance) {
		super();
		this.contenance = contenance;
	}

}
