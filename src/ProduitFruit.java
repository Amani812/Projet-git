class ProduitFruit extends Produit {
    public ProduitFruit(int id, String libelle, float quantite, String saison) {
        super(id, libelle, quantite, saison);
    }

    @Override
    public boolean estFrais(String saison) {
        return this.saison.equals(saison);
    }
}
