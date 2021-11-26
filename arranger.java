import java.util.Scanner;

public class arranger{
    private Etudiant[] liste;
    public void classe(){
        Scanner sc = new Scanner(System.in);
        System.out.print("entrer le nbre des etudiants ");
        int nbEtudiant = sc.nextInt();
        liste = new Etudiant[nbEtudiant];
        for(int  i=0; i< liste.length; i++){
            liste[i] = new Etudiant();
        }
    }
    public void afficherToutLesEtudiant(){
        for(Etudiant e : liste){
            e.afficheretudiant();
        }
    }
    //permet de classer les etudiant
    public void trier(){
        Etudiant stock;
        int i=0;
        int j=0;
        while(i !=liste.length){
            j= i+1;
            while(j !=liste.length){
                if(liste[i] != null && liste[i].getmoy() > liste[j].getmoy()){
                    stock = liste[i];
                    liste[i] = liste[j];
                    liste[j] = stock;
                }

                j=j+1;
            }
            i++;
        }
    }
}