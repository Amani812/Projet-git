import java.util.ArrayList;

public class magazin {
    int id;
    String adress;
    int capacite_magazin;
    private static int dernierID = 0;

    final int MAX_CAPA = 50;
    int nombreDeProduits;
    private int nombreEmployes;
    private Employe[] employes;
    private static final int MAX_EMPLOYES = 20;
    private String nom;
    private ArrayList<Produit> produits = new ArrayList<>();

    magazin(int id, String adress, int capacite_magazin,String nom) {
        this.id = id;
        this.adress = adress;
        this.capacite_magazin = capacite_magazin;

        this.nombreEmployes = 0;
        this.nom = nom;
        this.employes = new Employe[MAX_EMPLOYES];
        dernierID++;

    }


    public boolean addProducts(Produit produit) throws MagasinPleinException {
        if (chercherProduit(produit)) {
            // Le produit existe déjà, vous pouvez choisir de lever une exception ici si nécessaire
            return false;
        }

        if (produits.size() >= capacite_magazin) {
            // Le magasin est plein, lancez une exception MagasinPleinException
            throw new MagasinPleinException("Le magasin est plein, impossible d'ajouter plus de produits.");
        }

        // Si tout va bien, ajoutez le produit à la liste
        produits.add(produit);
        nombreDeProduits++;
        return true;
    }








    public boolean supprimerProduit(Produit produit) {
        for (int i = 0; i < produits.size(); i++) {
            if (produits.get(i).comparer(produit)) {
                produits.remove(i); // Remove the product from the ArrayList
                return true;
            }
        }
        return false;
    }


    public static magazin magasinAvecPlusDeProduits(magazin magasin1, magazin magasin2) {
        if (magasin1.getNombreTotalProduits() > magasin2.getNombreTotalProduits()) {
            return magasin1;
        } else {
            return magasin2;
        }
    }

    public boolean chercherProduit(Produit produit) {
        for (Produit existingProduct : produits) {
            if (existingProduct.comparer(produit)) {
                return true;
            }
        }
        return false;
    }
    public void ajouter(Produit p) {
        produits.add(p);
    }
    public float calculStockFruits() {
        float stockFruits = 0;
        for (Produit produit : produits) {
            if (produit instanceof ProduitFruit) {
                stockFruits += produit.getQuantite();
            }
        }
        return stockFruits;
    }

    public float calculStock() {
        float stockTotal = 0;
        for (Produit produit : produits) {
            stockTotal += produit.calculStock();
        }
        return stockTotal;
    }



    public int getNombreTotalProduits() {
        return nombreDeProduits;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("ID du magasin : ").append(this.id).append("\n");
        str.append("Adresse du magasin : ").append(this.adress).append("\n");
        str.append("Capacité du magasin : ").append(this.capacite_magazin).append("\n");
        str.append("Liste des produits du magasin :\n");

        for (Produit produit : produits) {
            str.append("Nom du produit : ").append(produit.getLibelle()).append("\n");
            str.append("Prix du produit : ").append(produit.getPrix()).append("\n");
        }

        return str.toString();
    }

    public void afficherCaracteristiques() {
        System.out.println("ID du magasin : " + this.id);
        System.out.println("Adresse du magasin : " + this.adress);
        System.out.println("Capacité du magasin : " + this.capacite_magazin);
        System.out.println("Liste des produits du magasin :");

        for (Produit produit : produits) {
            System.out.println("Nom du produit : " + produit.getMarque());
            System.out.println("Prix du produit : " + produit.getPrix());
        }
    }

    public void ajouterEmploye(Employe employe) {
        if (nombreEmployes < MAX_EMPLOYES) {
            employes[nombreEmployes] = employe;
            nombreEmployes++;

        } else {
            System.out.println("Le nombre maximum d'employés est atteint pour ce magasin.");
        }


}

    public void calculerSalairesEmployes() {
        System.out.println("Calcul des salaires des employés pour le magasin " + nom + ":");
        for (int i = 0; i < nombreEmployes; i++) {
            Employe employe = employes[i];
            double salaire = 0.0; // Initialise le salaire à 0 par défaut

            // Calcul du salaire en fonction du type d'employé
            if (employe instanceof Caissier) {
                Caissier caissier = (Caissier) employe;
                salaire = caissier.calculerSalaire();
            } else if (employe instanceof Vendeur) {
                Vendeur vendeur = (Vendeur) employe;
                salaire = vendeur.calculerSalaire();
            } else if (employe instanceof Responsable) {
                Responsable responsable = (Responsable) employe;
                salaire = responsable.calculerSalaire();
            }

            System.out.println("Identifiant : " + employe.getId());
            System.out.println("Nom : " + employe.getNom());
            System.out.println("Salaire : " + salaire + " DT");
            System.out.println(); // Ligne vide pour la clarté
        }
    }


   




}