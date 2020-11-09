
public class Orange {
	private double prix;
	private String origine;
	
	public Orange(String origine,double prix) {
		super();
		this.prix = prix;
		this.origine = origine;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		if (prix<0) {
			throw new IllegalArgumentException("Only Positive Numbers is allowed for the price"); 
		}
		this.prix = prix;
	}
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	
	@Override
	public boolean equals(Object obj) {
		Orange o = (Orange)obj;
		// TODO Auto-generated method stub
		if (o.getPrix()==this.getPrix() && o.getOrigine()==this.getOrigine()) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "orange de prix: " + this.prix + " euros et d'origine " + this.origine;
	}
	
}
