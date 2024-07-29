import java.util.ArrayList;
import java.util.Scanner;
// declaration des liste qui son dans cette class
public class La_liste 
{
    private  ArrayList <Produit>  liste_de_produit;
    private  ArrayList <Client>  liste_de_client;
    private  ArrayList <Commande>  liste_de_commande;
    Scanner sc=new Scanner(System.in);
    
    // le constructteur
    public La_liste()
    {
        liste_de_produit= new ArrayList <Produit> ();
        liste_de_client= new ArrayList <Client> ();
        liste_de_commande= new ArrayList <Commande> ();
    }
    // les getteur 
    public ArrayList <Produit> get_la_liste_de_produit(){ return this.liste_de_produit;}
    public ArrayList <Client> get_la_liste_de_client(){ return this.liste_de_client;}
    public ArrayList <Commande> get_la_liste_de_commande(){ return this.liste_de_commande;}
    
    // les setteur 
    public void set_la_liste_de_produi( ArrayList <Produit>  liste_de_produit) {this.liste_de_produit=liste_de_produit;}
    public void set_la_liste_de_client(ArrayList <Client>  liste_de_client) {this.liste_de_client=liste_de_client;}
    public void set_la_liste_de_commande(ArrayList <Commande>  liste_de_commande) {this.liste_de_commande=liste_de_commande;}
    
    /****************** LA LISTE DES PRODUIT***********/
    
    // ajouter  un produit and la liste des produit 
    public void ajouter_produit (Produit p)
    {
        this.liste_de_produit.add(p);
    }
    // suprime  un produit dans la liste des produit 
    public void suprimer_produit(int position)
    {
        liste_de_produit.remove(this.liste_de_produit.get(position));
    }
    // modifier un produit 
    public void modifier_un_list_d_produit(int pos,Produit p)
    {
        Produit tp;
        tp= this.liste_de_produit.get(pos);
        tp.setnom(p.getnom());
        tp.setref(p.getref());
        tp.setdec(p.getdec());
        tp.setcar(p.getcar());
        tp.setprix(p.getptix());
        tp.settype(p.gettype());
        tp.setnbr(p.getnbr());
    }
    
    // l affichage de la liste 
    public void affiche_liste_de_produit()
    {
        Produit tmp ;
        for(int i=0;i<this.liste_de_produit.size();i++)
        {
            tmp=(Produit) this.liste_de_produit.get(i);
            tmp.affiche();
        }
    }
    // l affichage de la liste des produit par type 
    public void afficher_la_liste_des_produit_par_type()
    {
    	// le type mobile 
        Produit p=new Produit();
        System.out.println("la liste des produit mobiles est:");
    	for(int i=0;i<this.liste_de_produit.size();i++)
    	{
    		if(this.liste_de_produit.get(i).gettype().name().equalsIgnoreCase("mobiles"))
    		{
    			p=(Produit) this.liste_de_produit.get(i);
    			p.affiche();
    		}
    	}
    	// le type electronique 
    	System.out.println("la liste des produit électroniques est:");
    	for(int i=0;i<this.liste_de_produit.size();i++)
    	{
    		if(this.liste_de_produit.get(i).gettype().name().equalsIgnoreCase("électroniques"))
    		{
    			p=(Produit)this. liste_de_produit.get(i);
    			p.affiche();
    		}
    	}
    	
    	// le type electrominager
    	System.out.println("la liste des produit électroménager est:");
    	for(int i=0;i<this.liste_de_produit.size();i++)
    	{
    		if(this.liste_de_produit.get(i).gettype().name().equalsIgnoreCase("électroménager"))
    		{
    			p=(Produit) this.liste_de_produit.get(i);
    			p.affiche();
    		}
    	}
    	
    	// le type informatique
    	System.out.println("la liste des produit informatiques est:");
    	for(int i=0;i<this.liste_de_produit.size();i++)
    	{
    		if(this.liste_de_produit.get(i).gettype().name().equalsIgnoreCase("informatiques"))
    		{
    			p=(Produit) this.liste_de_produit.get(i);
    			p.affiche();
    		}
    	}
    	// le type kits solaire
    	System.out.println("la liste des produit kits_solaires est:");
    	for(int i=0;i<this.liste_de_produit.size();i++)
    	{
    		if(this.liste_de_produit.get(i).gettype().name().equalsIgnoreCase("kits_solaires"))
    		{
    			p=(Produit) this.liste_de_produit.get(i);
    			p.affiche();
    		}
    	}
    	
    	
    }
    
    /******************LA LISTE DES CLIENT***********/
    
   
    public void ajouter_client_et_changer_etat_de_fidelisation(Client c)
    {
        this.liste_de_client.add(c);
        System.out.println("vouler vous cree une carte de fidelite ?taper oui ou non ");
        String s=sc.next();
        if(s.equalsIgnoreCase("oui"))
        {
        	boolean b=true;
            while (b==true) // la boucle pour repeter en cas d errue dans le mdps
            {
        	System.out.println("donner le mots de passe du compte de client ");
        	String mot_de_passe_1="";
        	mot_de_passe_1=sc.nextLine();
        	mot_de_passe_1=sc.nextLine();
        	System.out.println("confirmer votre mot de passe ");
        	String mot_de_passe_2="";
        	mot_de_passe_2=sc.nextLine();
        	mot_de_passe_2=sc.nextLine();
        	if(mot_de_passe_2.equals(mot_de_passe_1)) // verifier si le mdps confirmer est le meme que le client a taper 
        	{
        	   Compte_de_fidelite compte =new Compte_de_fidelite(c,mot_de_passe_2);
        	   c.setetat("fidele");
        	   b=false;
        	}
            }
        	
        }
        
    }
    public void ajouter_client(Client c)
    {
    	this.liste_de_client.add(c);
    }
    
    
    public void suprimer_client(int pos)
    {
        this.liste_de_client.remove(this.liste_de_client.get(pos)); 
    }
    public void modifier_list_de_client(int post,Client c)
    {
        Client tmp ;
        tmp=this.liste_de_client.get(post);
        tmp.setnom(c.getnom());
        tmp. setprenom(c.getprenom());
        tmp.setadress(c.getadress());
        tmp.setville(c.getville());
        tmp.setetat(c.getetat());
        
    }
    public void affich_la_liste_des_client()
    {
        Client tp;
        for (int i=0;i<this.liste_de_client.size();i++)
        {
             tp=(Client)this. liste_de_client.get(i);
             tp.affiche_client();
        }
    }
    public void  Afficher_létat_de_fidélisation_des_clients()
    {
    	Client tp;
    	for (int i=0;i<this.liste_de_client.size();i++)
    	{
    		tp=(Client) this.liste_de_client.get(i);
    		tp.affiche_les_client_avec_etat_de_fidelite();
    	}
    }
    
    /******************LA LISTE DES COMMANDE***********/
    
    public void ajouter_commande (Commande c)
    {
        this.liste_de_commande.add(c);
        c.settype("instance"); // modifer le type de la commande an instante 
    }
    public void suprimer_commande(int position)
    {
        
        this.liste_de_commande.remove(this.liste_de_commande.get(position));
    }
    public void modifier_un_list_d_commande(int pos,Commande c)
    {
        Commande tp;
        tp= this.liste_de_commande.get(pos);
        tp.settype(c.gettype());
        tp.setdate (c.getdate ());
        tp.setclient(c.getclient());
        tp.setlist(c.getlist());
    }

    public void  afiicher_la_liste_des_commandes_satisfaites()
    {
       System.out.println("la liste des commandes satisfaite est: ");
        for(int i=0;i<this.liste_de_commande.size();i++)
        {
            
            if(this.liste_de_commande.get(i).gettype().equalsIgnoreCase("satisfaite"))
            {
               this.liste_de_commande.get(i).affiche_commande ();
            }
        }
    }
    
    public void afiicher_la_liste_des_commandes_instance()
    {
       System.out.println("la liste des commandes instances est: ");
        for(int i=0;i<this.liste_de_commande.size();i++)
        {
            if(this.liste_de_commande.get(i).gettype().equalsIgnoreCase("instance"))
            {
               this.liste_de_commande.get(i).affiche_commande ();
            }
        }
    }
    // cette method verfie si d3 est  entre d2 et d1
    public boolean verfier_periode(Date d1,Date d2,Date d3)
    {
        boolean b=true;
        if(((d3.getannee()>=d1.getannee()) && (d3.getannee()<d2.getannee())) || ((d3.getannee()>d1.getannee()) && (d3.getannee()<=d2.getannee())))
        {
            b=true;
        }
        if((d3.getannee()>d1.getannee()) && (d3.getannee()<d2.getannee()))
        {
        	b=true;
        }
        if((d3.getannee()>d1.getannee()) || (d3.getannee()>d2.getannee()))
        {
            b=false;
        }
        if((d3.getannee()==d1.getannee()) && (d3.getannee()==d2.getannee()))
        {
        	if(((d3.getmois()>=d1.getmois()) && (d3.getmois()<d2.getmois())) || ((d3.getmois()>d1.getmois()) && (d3.getmois()<=d2.getmois())))
        	{
        		b=true;
        	}
            if((d3.getmois()>d1.getmois()) && (d3.getmois()<d2.getmois()))
            {
               b=true;
            }
            if((d3.getmois()>d1.getmois()) ||(d3.getmois()>d2.getmois()))
            {
                 b=false;
            }
            
            if((d3.getmois()==d1.getmois()) && (d3.getmois()==d2.getmois()))
            {
            	if(((d3.getjour()>=d1.getjour()) && (d3.getjour()<d2.getjour())) || ((d3.getjour()>d1.getjour()) && (d3.getjour()<=d2.getjour())))
            	{
            		b=true;
            	}
                if((d3.getjour()>d1.getjour()) || (d3.getjour()>d2.getjour()))
                {
                   b=false;
                }
                if((d3.getjour()>d1.getjour()) && (d3.getjour()<d2.getjour()))
                {
                   b=true;
                }
                if((d3.getjour()==d1.getjour()) || (d3.getjour()==d2.getjour()))
                {
                    b=true;
                }
            
            }
        }   
            
            
        return b;
    }
    // calcule de nbr d achat de chaque produit pour un periode
    public void calcuer_de_nbr_dachat_de_chaque_produit (Date d1,Date d2)
    {
        
        for(int i=0;i<this.liste_de_produit.size();i++) // parcourir la liste de produit 
        {   
            int l=0;
            for(int j=0;j<this.liste_de_commande.size();j++) // pour chaque produit on parcour la liste des commande 
            {
                if(verfier_periode(d1,d2,this.liste_de_commande.get(j).getdate())) // verifie si la date de la commande est dans la peried
                	
                	
                {
                    for(int k=0;k<this.liste_de_commande.get(j).getlist().size();k++) // parcourie la liste des produit qui est dand la commnade 
                    {
                         l =this.liste_de_produit.get(i).getnbr();// calculer le nbr d achat
                         l=l+ 1;
                         this.liste_de_produit.get(i).setnbr(l); //modofie le nbr d acht de chaque produit 
                    }
                }
            }
           
        }
    }
    
    public void affiche_le_produit_le_plus_commercialise_sur_une_periode()
    {
           int max=this.liste_de_produit.get(0).getnbr();
            Produit p=new Produit();
            for(int i=1;i<this.liste_de_produit.size();i++) // parcour de la liste des produit 
            {
                if(this.liste_de_produit.get(i).getnbr()>max) // verifier si le nbr d achat de produit est plus grand su le max 
                {
                    max=this.liste_de_produit.get(i).getnbr(); // alors en change le max
                    p=this.liste_de_produit.get(i);
                 }
            }
        p.affiche();
    } 
    // le meme principe que le max
    public void affiche_le_produit_le_mois_commercialise()
    {
        
        int min=this.liste_de_produit.get(0).getnbr();
        Produit p=new Produit();
        for(int i=1;i<this.liste_de_produit.size();i++)
        {
            if(this.liste_de_produit.get(i).getnbr()<min)
            {
                min=this.liste_de_produit.get(i).getnbr();
                p=this.liste_de_produit.get(i);
            }
        }
        p.affiche();
    }
    public int Achats_de_produit_donné_sur_une_période_donné(Date d1,Date d2,Produit p)
    {
         int cpt=0; boolean trouve =false;
        for(int i=1;i<this.liste_de_produit.size();i++) // en parcour la liste des produit 
        {
            if(this.liste_de_produit.get(i)==p) // verifie si le produit existe 
            { 
                trouve=true;
                for(int j=0;j<this.liste_de_commande.size();j++) // parcourir la liste des commande pour ce produit 
                {
                    if(verfier_periode(d1,d2,this.liste_de_commande.get(j).getdate())) // verifie si la date de la commande est dans la peried
                    {
                        for(int k=0;k<this.liste_de_commande.get(j).getlist().size();k++) // parcourir la liste des produit qui elle se trouve dans la commande 
                        {
                           cpt =this.liste_de_produit.get(i).getnbr(); // modifier le nbr d achat 
                           cpt=cpt+ 1;
                          
                        }
                    }
                }
            }
        }
        if(trouve==false)
        {
        	System.out.println("le produit n existe pas dans la lsite");
        }
        return cpt;
    }
}    
    
    
    
    
    


