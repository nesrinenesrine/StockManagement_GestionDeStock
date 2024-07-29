import java.util.Scanner;
//import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		La_liste liste;
		liste= new La_liste();
		
		// declaration des type de produit 
		type_de_produit mobile=type_de_produit.mobiles;
		type_de_produit electronique=type_de_produit.electronique;
		type_de_produit électroménager=type_de_produit.électroménager;
		type_de_produit informatiques=type_de_produit.informatiques;
		type_de_produit kits_solaires=type_de_produit.kits_solaires;
		
		// les instensation des produit 
		Produit telephone1 =new Produit("telephone portable",2006172,"un telphone portable","un bon carateristique",23000,mobile);
		Produit telephone2 =new Produit("telephone portable",2008150,"un telphone portable","un bon carateristique",23000,mobile);
		Produit téléviseurs1 = new Produit ("téléviseurs",1253,"un televiseur smart","meilleur technique",70000,electronique);
		Produit téléviseurs2 = new Produit ("téléviseurs",1342,"un televiseur smart","meilleur technique",70000,electronique);
		Produit Climatiseurs1 =new Produit ("Climatiseurs",200618,"un grand climatiseur","des bonnes possibilites",60000,électroménager);
		Produit Climatiseurs2 =new Produit ("Climatiseurs",200813,"un grand climatiseur","des bonnes possibilites",60000,électroménager);
		Produit pc_portable1 =new Produit (" pc portable",84319,"un pc portable gamer","un bon carateristique",100000,informatiques );
		Produit pc_portable2 =new Produit (" pc portable",13678,"un pc portable gamer","un bon carateristique",100000,informatiques );
		Produit batteries_solaires1 =new Produit ("batteries solaires",2375,"batteries solaires autonome","meilleur reistance",5000,kits_solaires);
		Produit batteries_solaires2 =new Produit ("batteries solaires",4667,"batteries solaires autonome","meilleur reistance",5000,kits_solaires);
		
		
		// l'ajoue a la liste des produit 
		liste.ajouter_produit(telephone1);
		liste.ajouter_produit(telephone2);
		liste.ajouter_produit(téléviseurs1);
		liste.ajouter_produit(téléviseurs2);
		liste.ajouter_produit(Climatiseurs1);
		liste.ajouter_produit(Climatiseurs2);
		liste.ajouter_produit(pc_portable1);
		liste.ajouter_produit(pc_portable2);
		liste.ajouter_produit(batteries_solaires1);
		liste.ajouter_produit(batteries_solaires2);
		
		
		//declaration des client 


		Client client1=new Client ("ait said","nesrine","18 rus ahmed chaib","alger","fidel");
		Client client2=new Client ("saidani","sirine","citer bachdjarah","alger","non fidel");
		Client client3=new Client ("chadani","ahmed","citer 11 sidaili aiof","alger","non fidel");
		Client client4=new Client ("twalbi","mariem","citer rachid kaoiche","alger","fidel");
		// l'ajoue a la liste des client
		liste.ajouter_client(client1);
		liste.ajouter_client(client2);
		liste.ajouter_client(client3);
		liste.ajouter_client(client4);
		
		
		boolean continu =true;
	    while(continu==true) // la boucle pour le grand menu 
	    {
		int  num,nb;
		System.out.println("choisisez un numero compris entre 1 et 3 telque:");
		System.out.println(" 1-GESTION DES PRODUITS\n 2-GESTION DES CLIENTS\n 3-GESTION DES COMMANDES ");
		Scanner sc=new Scanner(System.in);
		do{
		num=sc.nextInt();
		}while(num<1 || num>3);
		
		
		
		switch (num)
		{
		    case 1 :
		        {
		        	boolean b=true; // la bouce pour le menu ds gestion des produit 
		        	while(b){
		            System.out.println("GESTION DES PRODUITS");
		            System.out.println("choisisez un numero compris entre 1 et 6 telque:");
		            System.out.println(" 1- Ajouter produit\n 2- Supprimer produit\n 3- Modifier produit\n 4- Afficher la liste Produit par type de produit\n 5- Quitter ");
		            do{
		                nb=sc.nextInt();
		            }while(num<1 || num>5);
		            switch(nb)
		            {
		                
		                case 1:
		                    {
		                        System.out.println("saisisez le produit a ajouter");
		                        Produit p=new Produit();
		                        liste.ajouter_produit( p.saisir_un_produit ());
		                        break;
		                    }
		                case 2:
		                    {
		                        System.out.println("donner la position de produit que vous vouler suprimer ");
		                        int postion =sc.nextInt();
		                        liste.suprimer_produit(postion);
		                        break;
		                    }
		                case 3:
		                    {
		                        System.out.println("donner la position du produit que vous vouler modifier et aver quele produit vous vouler le modifier ");
		                        int position =sc.nextInt();
		                        Produit p=new Produit();
		                        liste.modifier_un_list_d_produit(position,p.saisir_un_produit ());
		                        break;
		                    }
		                case 4:
		                    {
		                        System.out.println("la liste de produit est:");
		                        liste.afficher_la_liste_des_produit_par_type();
		                        break;
		                        
		                    }
		                case 5:
		                    {
		                    
		                    	continu=false;
		                    }
		            
		            }
		     
		       	System.out.println("vouler vous continue dans la gestion des produit taper oui ou non");
		       	Scanner k=new Scanner(System.in);
			    String s="";
			    s=k.next();
			    if(s.equalsIgnoreCase("oui"))
		        {
		        	b =true;
		        }
			    if(s.equalsIgnoreCase("non"))
			    {
			    	b =false;
			    }
		       	
		      }
		        	break;
		}
	
		
		        
		    case 2:
		        {
		        	boolean b=true; // la boucle pour le gestion des client 
		        	while(b) {
		            System.out.println("GESTION DES CLIENTS");
		            System.out.println("choisisez un numero compris entre 1 et 7 telque:");
		            System.out.println("1- Ajouter client\n 2- Supprimer client\n 3-Modifier client\n  4- Afficher la liste client\n 5- Afficher l’état de fidélisation des clients\n 6- Quitter ");
		            do{
		                nb=sc.nextInt();
		            }while(num<1 || num>7);
		            switch(nb)
		            {
		                
		                case 1:
		                    {
		                        System.out.println("saisisez le client a ajouter");
		                        Client c =new Client();
		                        liste.ajouter_client_et_changer_etat_de_fidelisation(c.saisir_un_client ());
		                    }
		                case 2:
		                    {
		                        System.out.println("donner la position de client que vous vouler suprimer ");
		                        int postion =sc.nextInt();
		                        liste.suprimer_client(postion);
		                    }
		                case 3:
		                   {
		                        System.out.println("donner la postion du client que vous vouler modifier et aver quele client vous vouler le modifier ");
		                        int position =sc.nextInt();
		                        Client c =new Client();
		                        liste.modifier_list_de_client(position,c.saisir_un_client ());
		                   }
		                case 4:
		                   {
		                       System.out.println("la liste des clients est:");
		                       liste.affich_la_liste_des_client();
		                       
		                   }
		                case 5:
		                    {
		                        liste.Afficher_létat_de_fidélisation_des_clients();
		                    }
		               case 6:
		                   {
		                	   continu =false;
		                   }
		                    
		            }
		            System.out.println("vouler vous continue dans la gestion des client  taper oui ou non");
			       	Scanner k=new Scanner(System.in);
				    String s="";
				    s=k.next();
				    if(s.equalsIgnoreCase("oui"))
			        {
			        	b =true;
			        }
				    if(s.equalsIgnoreCase("non"))
				    {
				    	b =false;
				    }
		           
		        	}
		        	break;
		        }
		     case 3:
		        {
		        	boolean b=true; // la boucle pour gestion des commande 
		        	while(b) {
		            System.out.println("GESTION DES COMMANDES");
		            System.out.println("choisisez un numero compris entre 1 et 11 telque:");
		            System.out.println(" 1-Créer une liste de commandes\n  2-Ajouter une commande\n 3-Supprimer une commande\n 4-Modifier une commande\n 5-Afficher la liste des commandes satisfaites\n 6-Afficher la liste des commandes en instance\n 7-Afficher le produit le plus commercialisé sur une période donnée\n 8-Afficher le produit le moins commercialisé sur une période donnée\n 9-Achats d’un produit donné sur une période donné\n 10-Achats d’un produit donné sur une période donnée, par ville\n 11-Quitter ");
		            do{
		                nb=sc.nextInt();
		            }while(num<1 || num>11);
		            switch(nb)
		            {
		                case 1:
		                    {
		                    	  boolean a=true;
		  		                  while (a)  
		  		                  {
		  		                	System.out.println("saisisez la commande a ajouter");
				                       Commande c=new Commande();
				                       System.out.println("donner la date de la commande");
				                       Date d=new Date();
				                       c.setdate(d.saisir_date());
				                       System.out.println("donner le client de la commande");
				                       Client tmp = new Client();
				                       c.setclient (tmp.saisir_un_client ());	                      
				                       System.out.println("donner la liste des produit de la commande");
				                       Produit p=new Produit();
				                       boolean terminer=false; 
				                       while(terminer==false)
				                       {
				                    
				                    	   p.saisir_un_produit ();
				                    	   System.out.println("avez vous terminer la commande ?taper oui ou non");
				                    	   String s="";
				                    	   s=sc.next();
				                    	   if(s.equalsIgnoreCase("oui"))
				                    	   {
				                    		   terminer=false;
				                    	   }
				                    	   if(s.equalsIgnoreCase("non"))
				                    	   {
				                    		   terminer=true;
				                    	   }
				                       }
				                       liste.ajouter_commande(c);
				                       System.out.println("voulez vous ajouter une autre commande  taper oui ou non");
				                       String m="";
				                       m=sc.next();
				                       if(m.equalsIgnoreCase("oui"))
				                       {
				                    	   a=true;
				                       }
				                       if(m.equalsIgnoreCase("non"))
				                       {
				                    	   a=false;
				                       }
		  		                  }
		  		                  break;
		                    }
		                    
		                case 2:
		                   {
		                       System.out.println("saisisez la commande a ajouter");
		                       Commande c=new Commande();
		                       System.out.println("donner la date de la commande");
		                       Date d=new Date();
		                       c.setdate(d.saisir_date());
		                       System.out.println("donner le client de la commande");
		                       Client tmp = new Client();
		                       c.setclient (tmp.saisir_un_client ());	                      
		                       System.out.println("donner la liste des produit de la commande");
		                       Produit p=new Produit();
		                       boolean terminer=false; 
		                       while(terminer==false)
		                       {
		                    
		                    	   p.saisir_un_produit ();
		                    	   System.out.println("avez vous terminer la commande ?taper oui ou non");
		                    	   String s="";
		                    	   s=sc.next();
		                    	   if(s.equalsIgnoreCase("oui"))
		                    	   {
		                    		   terminer=false;
		                    	   }
		                    	   if(s.equalsIgnoreCase("non"))
		                    	   {
		                    		   terminer=true;
		                    	   }
		                       }
		                       liste.ajouter_commande(c);
		                       break;
		                   }
		               case 3:
		                   {
		                       System.out.println("donner la position de commande que vous vouler suprimer ");
		                        int postion =sc.nextInt();
		                        liste.suprimer_commande(postion);
		                        break;
		                   }
		               case 4:
		                   {
		                       System.out.println("donner la postion du commnade que vous vouler modifier et aver quele commnade vous vouler le modifier ");
		                        int position =sc.nextInt();
		                        Commande c =new Commande();
			                    System.out.println("donner la date de la commande");
			                    Date d=new Date();
			                    c.setdate(d.saisir_date());
			                    System.out.println("donner le client de la commande");
			                    Client tmp = new Client();
			                    c.setclient (tmp.saisir_un_client ());	                      
			                    System.out.println("donner la liste des produit de la commande");
			                    Produit p=new Produit();
			                    boolean terminer=false; 
			                    while(terminer==false)
			                       {
			                    
			                    	   p.saisir_un_produit ();
			                    	   System.out.println("avez vous terminer la commande ?taper oui ou non");
			                    	   String s="";
			                    	   s=sc.next();
			                    	   if(s.equalsIgnoreCase("oui"))
			                    	   {
			                    		   terminer=false;
			                    	   }
			                    	   if(s.equalsIgnoreCase("non"))
			                    	   {
			                    		   terminer=true;
			                    	   }
		                        liste.modifier_un_list_d_commande(position,c);
		                       
			                       }
			                    break;
		                   }
		              case 5:
		                  {
		                      liste.afiicher_la_liste_des_commandes_satisfaites ();
		                      break;
		                  }
		              case 6:
		                  {
		                      liste.afiicher_la_liste_des_commandes_instance();
		                      break;
		                  }
		              case 7:
		                  {
		                      System.out.println("donner la periode:");
		                      Date d=new Date();
		                      Date d1=d.saisir_date();
		                      Date d2=d.saisir_date();
		                      liste.calcuer_de_nbr_dachat_de_chaque_produit(d1,d2);
		                      System.out.println("le produit le plus commercialisé est");
		                      liste.affiche_le_produit_le_plus_commercialise_sur_une_periode();
		                      break;
		                  }
		              case 8:
		                  {
		                      System.out.println("donner la periode:");
		                      Date d=new Date();
		                      Date d1=d.saisir_date();
		                      Date d2=d.saisir_date();
		                      liste.calcuer_de_nbr_dachat_de_chaque_produit(d1,d2);
		                      liste.affiche_le_produit_le_mois_commercialise();
		                      break;
		                      
		                  }
		              case 9:
		                  {
		                      System.out.println("donner la periode et le produit");
		                      Date d=new Date();
		                      Produit p=new Produit();
		                      liste. Achats_de_produit_donné_sur_une_période_donné(d.saisir_date(),d.saisir_date(),p. saisir_un_produit ());
		                      break;
		                  }
		              case 10 :
		                  {
		                	  break;
		                  }
		              case 11:
		                  {
		                	  continu =false;
		                  }
		          
		           }
		            System.out.println("vouler vous continue dans la gestion des commande  taper oui ou non");
			       	Scanner k=new Scanner(System.in);
				    String s="";
				    s=k.next();
				    if(s.equalsIgnoreCase("oui"))
			        {
			        	b =true;
			        }
				    if(s.equalsIgnoreCase("non"))
				    {
				    	b =false;
				    }
		           
		        	}
		        	
		       }
		    }
		System.out.println("voulez vous continue ? taper oui ou non");
	    Scanner k=new Scanner(System.in);
	    String s="";
	    s=k.next();
	    if(s.equalsIgnoreCase("oui"))
        {
	    	continu =true;
        }
	    if(s.equalsIgnoreCase("non"))
	    {
	    	continu =false;
	    }
		        
		}
		

       }
	    
	}
 


