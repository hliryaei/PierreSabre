package personnages;

public class Ronin extends Humain {

	private int honneur = 1 ;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent); 
    }
	public void donner(Commercant beneficiaire) {
        int montantADonner = getArgent() / 10; 
        if (montantADonner > 0) {
            perdreArgent(montantADonner); 
            beneficiaire.recevoir(montantADonner); 
            parler("Marco prend ces " + montantADonner + " sous.");
        }
    }
}
