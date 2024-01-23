public class Responsable extends Employe {
    private double prime; // Attribut spécifique au responsable

    public Responsable(int identifiant, String nom, String adresse, double prime) {
        super(identifiant, nom, adresse, 0); // Le nombre d'heures pour un responsable est généralement 0
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    // Méthode pour calculer le salaire du responsable
   
}
