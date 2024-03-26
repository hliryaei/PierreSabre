package personnages;

public class Yakuza extends Humain {

	private String clan;
    private int reputation = 4;
    
    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);
        this.clan = clan;
    }
    public void extorquer(Commercant victime) {
        int montantExtorque = victime.seFaireExtorquer();
        gagnerArgent(montantExtorque); 
        reputation++; 
        parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        parler("Marco, si tu tiens à la vie donne-moi ta bourse !");
        parler("J’ai piqué les " + montantExtorque + " sous de Marco, ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
    }
    public int perdre() {
        int montantPerdu = getArgent(); 
        perdreArgent(montantPerdu); 
        reputation--; 
        parler("J’ai perdu mon duel et mes " + montantPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
        return montantPerdu;
    }
    public void gagner(int gain) {
        gagnerArgent(gain); 
        reputation++;
        parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
    }
    public int getReputation() {
        return reputation;
    }
    
}
