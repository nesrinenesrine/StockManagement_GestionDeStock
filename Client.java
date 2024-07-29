import java.util.Scanner;
public class Client 
{   
    // declaration des attribut de client 
    private String nom;
    private String prenom;
    private String adress;
    private String ville;
    private String etat_de_fidelisation;
   
    
    Scanner sc=new Scanner(System.in);
    
    // contructeur son paramethre
    public  Client(){}
    
    //constructeur avec paramethre pour cree un client avec etat de fidelisation 
    public Client(String nom,String prenom,String adress,String ville,String etat_de_fidelisation )
    {
        this.nom=nom;
        this.prenom=prenom;
        this.adress=adress;
        this.ville=ville;
        this.etat_de_fidelisation=etat_de_fidelisation;
       
    }
    //constructeur pour cree un client  son etat de fedalisation pour le modifier apre 
    public Client(String nom,String prenom,String adress,String ville )
    {
        this.nom=nom;
        this.prenom=prenom;
        this.adress=adress;
        this.ville=ville;
       
    }
    // les getter
    public String getnom(){return this.nom;}
    public String getprenom(){return this.prenom;}
    public String getadress(){return this.adress;}
    public String getville(){return this.ville; }
    public String getetat(){return this.etat_de_fidelisation; }
    
    // les setteru
    public void setnom (String nom){this.nom=nom;}
    public void setprenom(String prenom){this.prenom=prenom;}
    public void setadress(String adress){this.adress=adress;}
    public void setville(String ville){this.ville=ville;}
    public void setetat(String etat_de_fidelisation ){this.etat_de_fidelisation=etat_de_fidelisation;}
    
    // la method de saisie
    public Client  saisir_un_client ()
    {
        System.out.println("saisir le nom de clien");
        this.nom=sc.nextLine();
        this.nom=sc.nextLine();
        System.out.println("saisir le prenom de clien");
        this.prenom=sc.nextLine();
        this.prenom=sc.nextLine();
        System.out.println("saisir l'adress de clien");
        this.adress=sc.nextLine();
        this.adress=sc.nextLine();
        System.out.println("saisir la ville de clien");
        this.ville=sc.next();
        Client c=new Client(nom,prenom,adress,ville); 
        return c ;
    
    }
    //la method toString  
    public String toString ()
    {
        return("le nom de client est:\n"+nom+"\nle prenom est:\n"+prenom+"\nl'adress du client est:\n"+adress+"\nla ville est:\n"+ville);
    }
    
    //affichage du client 
    public void affiche_client ()
    { 
        System.out.println("le nom de client est:\n"+nom+"\nle prenom est:\n"+prenom+"\nl'adress du client est:\n"+adress+"\nla ville est:\n"+ville);
        
    }
    //affichage du client avec son etat de fidalisatoin
    public void affiche_les_client_avec_etat_de_fidelite()
    {
    	System.out.println("le nom de client est:\n"+nom+"\nle prenom est:\n"+prenom+"\nl'adress du client est:\n"+adress+"\nla ville est:\n"+ville+"\nl'etat de fidelisation de client est:"+etat_de_fidelisation);
    }
    
}











