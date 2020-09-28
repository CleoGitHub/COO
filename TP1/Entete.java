import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Entete {
    private String titre;
    private String auteur;
    private Date date;
    private int largeur;

    public Entete(String titre, String auteur, Date date) {
        this.titre = titre; 
        this.auteur = auteur; 
        this.date = date;
    }

    public Entete(String titre, String auteur) {
        this.titre = titre; 
        this.auteur = auteur; 
        this.date = new Date();
    }

    public void fixeLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLarguer() {
        return this.largeur;
    }

    public toString() {
        String retour = "";
        TexteCentre t = new TexteCentre(this.titre);
        retour += t;

        t.setTexte(this.auteur);
        retour += t;
        
    }


}