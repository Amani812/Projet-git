public class Caissier extends Employe {
    private int numeroDeCaisse; // Specific attribute for caissier

    public Caissier(int identifiant, String nom, String adresse, int nbrHeures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbrHeures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }



        if (getNbrHeures() <= heuresNormales) {
            salaire = tauxHoraire * getNbrHeures();
        } else {
            // Overtime hours are paid at 115% of the hourly rate
            salaire = tauxHoraire * heuresNormales + (getNbrHeures() - heuresNormales) * (1.15 * tauxHoraire);
        }

        return salaire;
    }

    @Override
    public String toString() {
        return "Caissier{" +
                "numeroDeCaisse=" + numeroDeCaisse +
                '}';
    }
}

