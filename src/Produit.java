import java.util.Date;
public class Produit {
    int id;
    String libelle,marque;
    float prix;
    Date dateExp;
    static int nbrproduits;

    private String type;

    private float quantite;
    public String saison;

    Produit(){

    }
    Produit(int id,String libelle,String marque)
        {this.id=id;
        this.libelle=libelle;

        this.marque=marque;


        }
    Produit(int id,String libelle,String marque,float prix)
    {   this.id=id;
        this.libelle=libelle;
        this.marque=marque;
        this.prix=prix;
        nbrproduits++;
   }
    Produit(int id,String libelle,String marque,Date dateExp)
    {   this.id=id;
        this.libelle=libelle;
        this.marque=marque;

        this.dateExp= dateExp;
        }
    public Produit(int id, String libelle, float quantite, String saison) {
        this.id = id;
        this.libelle = libelle;
        this.quantite = quantite;
        this.saison = saison;
    }
    public void ajouter(Produit p) {
        // Ajoute le produit au magasin
    }

    public boolean estFrais(String saison) {
        return false; // Par défaut, un produit n'est pas frais
    }

    public float calculStock() {
        return quantite; // La quantité totale est la même pour tous les produits
    }
    public String determinerTypeProduit() {
        if ("Fruit".equalsIgnoreCase(type)) {
            return "Fruit";
        } else if ("Légumes".equalsIgnoreCase(type)) {
            return "Légumes";
        } else {
            return "Autre";
        }
    }

    public float getQuantite() {
        return this.quantite;
    }

    void afficher()
    {
        System.out.println("L'id:" +id);
        System.out.println("Libelle:" +libelle);
        System.out.println("marque:" +marque);
        System.out.println("prix:" +prix);
        System.out.println("date:" +dateExp);

        }
    public void setLibelle(String libelle)
    {this.libelle=libelle;}

    public String getLibelle() {
        return libelle;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getPrix() {
        return prix;
    }

    public void setMarque(String vitalait) {
        this.marque = marque;
    }

    public String getMarque(){
        return marque;
    }

    public void setDateExpiration(Date dateExp) {
        this.dateExp = dateExp;
    }

    public boolean comparer(Produit autreProduit) {
        return this.id == autreProduit.id && this.libelle != null && this.libelle.equals(autreProduit.libelle) && this.prix == autreProduit.prix;
    }

    public static boolean comparer(Produit p1,Produit p2)
    {
        return p1.id==p2.id &&p1.prix ==p2.prix &&p1.libelle.equals(p2.libelle);
    }

    public float calculerTVA(float tauxTVA) {
        // Calcule la TVA pour le produit en utilisant le taux de TVA fourni
        if (prix <= 0) {
            System.out.println("Prix invalide. Impossible de calculer la TVA.");
            return 0;
        }

        float tva = prix * tauxTVA / 100;
        return tva;
    }




}


