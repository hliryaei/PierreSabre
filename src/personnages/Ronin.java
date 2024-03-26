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
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2; 
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
        if (force >= adversaire.getReputation()) {
            parler("Je t’ai eu petit yakuza!");
            int montantGagne = adversaire.perdre();
            gagnerArgent(montantGagne); 
            honneur++; 
            
        } else {
            int montantPerdu = getArgent(); 
            perdreArgent(montantPerdu); 
            honneur--;
             
            parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
            adversaire.gagner(montantPerdu);
        }
		
	}
}
