import java.util.Scanner;
public class Date 
{
    private int jour,mois,annee;
    Scanner sc=new Scanner(System.in);
    
    public Date(){}
    
    public Date(int jour, int mois, int annee)
    {
        this.jour=jour; this.mois=mois; this.annee=annee;
    }
    
    public int getjour(){return this.jour;}
    public int getmois(){return this.mois;}
    public int getannee(){return this.annee;}
    
    public void setjour(int jour){this.jour=jour;}
    public void setmois(int mois){this.mois=mois;}
    public void setannee(int annee){this.annee=annee;}
    
    public Date saisir_date()
    {
        System.out.println("donner le jour");
        this.jour=sc.nextInt();
        System.out.println("donner le mois");
        this.mois=sc.nextInt();
        System.out.println("donner l'annee");
        this.annee=sc.nextInt();
        Date d =new Date (jour,mois,annee);
        return d;
    }
   
    
    public String toString ()
    {
        return ("le jouur est:\n"+jour+"le mois est:\n"+mois+"lannee est:\n"+annee);
    }
    
    public void affich_date()
    {
        System.out.println ("le jouur est:\n"+jour+"le mois est:\n"+mois+"lannee est:\n"+annee);
    }
}

