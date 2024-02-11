
public class Kupuvac {

	private int kupuvacID;
	private AdresaLok adresaLinija;
	public Kupuvac(int kupuvacID, AdresaLok adresaLinija) {
		this.kupuvacID = kupuvacID;
		this.adresaLinija = adresaLinija;
		
	}
	public int getKupuvacID() {
		return kupuvacID;
		
	}
	public AdresaLok getAdresaLinija() {
		return adresaLinija;
	}
	
}
