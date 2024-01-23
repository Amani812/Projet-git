class ProduitLegume extends Produit {
    public ProduitLegume(int id, String libelle, float quantite, String saison) {
        super(id, libelle, quantite, saison);
    }

    @Override
    public boolean estFrais(String saison) {
        String[] mois = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};
        int saisonIndex = 0;
        int parametreIndex = 0;

        for (int i = 0; i < mois.length; i++) {
            if (this.saison.equals(mois[i])) {
                saisonIndex = i;
            }
            if (saison.equals(mois[i])) {
                parametreIndex = i;
            }
        }

        return (parametreIndex - saisonIndex) <= 1;
    }
}
