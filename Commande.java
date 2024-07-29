
import java.util.ArrayList;
public class  Commande
{
    // declaration des attribut de la class commande
    private String type;
    private Date date;
    private Client client;
    private ArrayList <Produit>  liste_de_produit;
    
    //constructeur son paramethre
    public Commande(){}
    
    //constructeur avec paramethre
    public Commande(Date date,Client client)
    {
        
        this.date=date;
        this.client=client;
        liste_de_produit = new ArrayList <Produit> ();
    }
    
    // les getter
    public String gettype(){return this.type; }
    public Date getdate (){return this.date; }
    public Client getclient(){return this.client;}
    public  ArrayList<Produit> getlist(){return this.liste_de_produit;}
   
    // les setter
    public void settype(String type){this.type=type;}
    public void setdate (Date date){this.date=date;}
    public void setclient (Client client){this.client=client;}
    public void setlist (ArrayList<Produit>  liste_de_produit){this.liste_de_produit=liste_de_produit;}
    
    
    
   
    
    // tostring
    public String toString ()
    {
        return ("le type de commande est:\n"+type+"\nla date de la commande est:\n"+date+"\nle client concerner:\n"+client);
    }
     
    // affichage une commande
    public void affiche_commande ()
    {
        System.out.println("le type de commande est:\n  "+type+"\nla date de la commande est: ");
        date.affich_date();
        System.out.println("le client concerner:  ");
        client.affiche_client ();
        System.out.println("la liste de produit est:  ");
        for (int i=0;i<liste_de_produit.size();i++)
        {
            liste_de_produit.get(i).affiche();
        }
    }
  
}


