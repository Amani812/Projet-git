public class Caissier extends Employe {
    private int numeroDeCaisse; // Specific attribute for caissier

    public Caissier(int identifiant, String nom, String adresse, int nbrHeures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbrHeures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    // Method to calculate the caissier's salary
    @Override
    public double calculerSalaire() {
        double tauxHoraire = 5.0; // Hourly rate for a caissier
        int heuresNormales = 180; // Number of regular hours
        double salaire = 0.0;

        if (getNbrHeures() <= heuresNormales) {
            salaire = tauxHoraire * getNbrHeures();
        } else {
            // Overtime hours are paid at 115% of the hourly rate
            salaire = tauxHoraire * heuresNormales + (getNbrHeures() - heuresNormales) * (1.15 * tauxHoraire);
        }

        return salaire;
    }
}

