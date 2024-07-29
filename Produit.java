import java.util.Scanner;
public  class Produit 

{   // la déclaration des attributs de la class client
	
    private String nom;
    private int reference ;
    private String decriptif;
    private String caracteristique;
    private double prix; 
    private int nbr_achat;
    private type_de_produit type;
    
    Scanner sc=new Scanner(System.in);
    // le contructeur son parametre
    public Produit(){}
    // contructeur avec parametre
    public Produit (String nom ,int reference,String decriptif,String caracteristique,double prix,type_de_produit type) 
    {
        this.nom=nom;
        this.reference=reference;
        this.decriptif=decriptif;
        this.caracteristique=caracteristique;
        this.prix=prix;
        this.type=type;
    }
    
    // les getters
    public String getnom(){ return this.nom;}
    public int getref(){ return  this.reference;}
    public String getdec(){return this. decriptif;}
    public String getcar(){return this.caracteristique;}
    public double getptix(){return this.prix;}
    public int getnbr(){ return  this.nbr_achat;}
    public type_de_produit gettype() {return this.type;}
     
     // les setters
     public void setnom(String nom){ this.nom=nom;}
     public void setref(int reference) { this.reference=reference;}
     public void setdec(String decriptif){this.decriptif=decriptif;}
     public void setcar(String caracteristique){this.caracteristique=caracteristique;}
     public void setprix (double prix){this.prix=prix;}
     public void setnbr(int nbr_achat ) { this.nbr_achat=nbr_achat;}
     public void settype (type_de_produit type) {this.type=type;}
     
     // la method saisir
     public Produit saisir_un_produit ()
     {
    	 
        System.out.println("saisir le nom de produit:");
        this.nom=sc.nextLine();
        this.nom=sc.nextLine();
        System.out.println("saisir la reference de produit:");
        this.reference=sc.nextInt();
        System.out.println("saisir le decriptif de produit:");
        this.decriptif=sc.nextLine();
        this.decriptif=sc.nextLine();
        System.out.println("saisir les caracteristique de produit:");
        this.caracteristique=sc.nextLine();
        this.caracteristique=sc.nextLine();
        System.out.println("saisir le prix de produit:");
        this.prix=sc.nextDouble();
        System.out.println("saisir le type de produit:");
        String s="";
        s=sc.next();
        switch(s) //un swith case pour saisir le type car le type est une enumeration 
        {
           case("mobiles"):
           {
        	   type_de_produit l=type_de_produit.valueOf("mobiles");
        	   this.type=l;
        	   break;
           }
           case("electronique"):
           {
        	   type_de_produit l=type_de_produit.valueOf("electronique");
        	   this.type=l;
        	   break;
           }
           case("électroménager"):
           {
        	   type_de_produit l=type_de_produit.valueOf("électroménager");
        	   this.type=l;
        	   break;
           }
           case("informatiques"):
           {
        	   type_de_produit l=type_de_produit.valueOf("informatiques");
        	   this.type=l;
        	   break;
           }
           case("kits_solaires"):
           {
        	   type_de_produit l=type_de_produit.valueOf("kits_solaires");
        	   this.type=l;
        	   break;
           }
        }
        Produit p=new Produit(nom,reference,decriptif,caracteristique,prix,type);
        return p ;
    }
     
     
     
     // la method toString
     public String toString ()
     {
         return ("le nom de le produit est:\n" +nom+"\nla reference de ce produit est:\n"+reference+"\nce produit est:\n"+decriptif+"\net il est carcririsé par:\n"+caracteristique+"\nle prix de ce produit est:\n"+prix+"\nle type de ce produit est:\n"+type);
     }
     // la method affiche
     public void affiche()
     {
       System.out.println ("le nom de le produit est:\n" +nom+"\nla reference de ce produit est:\n"+reference+"\nce produit est:\n"+decriptif+"\net il est carcririsé par:\n"+caracteristique+"\nle prix de ce produit est:\n"+prix+":\nle type de ce produit est:\n"+type);
     }
     
     }

