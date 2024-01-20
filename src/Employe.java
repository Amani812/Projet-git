public class Employe {

    private static int dernierID = 0;
    private String nom;
    private String adresse;
    private int nbrHeures; // Nombre d'heures travaillées par mois
    private int id;


    public Employe(int identifiant, String nom, String adresse, int nbrHeures) {
        this.id =id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
        this.id = ++dernierID;
    }
    public int getId() {
        return id;
    }


    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbrHeures() {
        return nbrHeures;
    }

    public void setNbrHeures(int nbrHeures) {
        this.nbrHeures = nbrHeures;
    }

    // Méthode pour calculer le salaire (à être redéfinie dans les sous-classes)
    public double calculerSalaire() {
        return 0.0; // Cette valeur sera remplacée dans les sous-classes (Caissier, Vendeur, Responsable)
    }
}
