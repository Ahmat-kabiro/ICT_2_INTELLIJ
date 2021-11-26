import java.util.Scanner;

public class Etudiant{
    
    private String nom ;
    private String prenom;
    private double [] note;
    private double moy;

    public Etudiant(){
        Scanner sc = new Scanner(System.in);

        System.out.println("entrer le nom de l'etudiant");
            nom = sc.next();

            System.out.println("entrer le prenom de l'etudiant");
            prenom = sc.next();

            System.out.println("les notes de l'etudiant "+nom+" "+prenom+" son combien : ");
            int nb = sc.nextInt();

            note = new double[nb];
            int i=0;

            while( i !=  note.length){
                System.out.println("entrer la note numero " + (i+1)+" : ");
                note[i] = sc.nextDouble();
                i++;
            }
            moy = calcul_moy();
          
    }
    private double calcul_moy() {
        double som = 0.0;
        for(double valeur_note : note){
            som = som + valeur_note;
        }

        return som/note.length;

    }
    /* permet l'affichage*/
    public void afficheretudiant(){
        System.out.print("les notes de "+nom+ " " + prenom + " "+"sont : ");
        for(double valeur_note : note){
            System.out.print(" "+ valeur_note);
        }
        System.out.println();
        System.out.print("sa moyenne vaut " +moy+ "\n") ;
    }
// renvoie la moyenne d'un etudiant
public double getmoy(){
    return moy;
}

}