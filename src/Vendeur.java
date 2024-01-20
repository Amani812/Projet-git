public class Vendeur extends Employe {
    private double tauxDeVente; // Attribut spécifique au vendeur

    public Vendeur(int identifiant, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        super(identifiant, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    public double getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(double tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    // Méthode pour calculer le salaire du vendeur
    @Override
    public double calculerSalaire() {
        double salaireFixe = 450.0; // Salaire fixe pour un vendeur
        double salaire = salaireFixe * (tauxDeVente / 100.0); // Salaire = Salaire fixe * taux de vente (en pourcentage)
        return salaire;
    }
}
