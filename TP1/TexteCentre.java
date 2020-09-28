public class TexteCentre {
    private String texte; 
    private int largeur;

    public TexteCentre(String texte) {
        this.texte = texte;
        this.largeur = 50;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public String texte() {
        return this.texte;
    }

    public void fixeLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLarguer() {
        return this.largeur;
    }

    public String toString() {
        String retour = "";
        String courant = "";
        String[] mots = this.texte.split(" ");
    
        //Tant que texte contient des mots 
        for(int i = 0; i < mots.length; i++) {
            //Si le mot peut loger dans la largeur
            if((courant.length() + mots[i].length() +1 ) <= largeur)
                //On met le mot dans courant
                courant += " " + mots[i];
            //Sinon
            else {
                //Si courant contient des caractère
                if(courant.length() > 0)
                    //On met courant au centre et on ajout un saut de ligne et ajoute a retour
                    for(int j = 0; j < (this.largeur - courant.length())/2; j++)
                        retour += " ";
                    retour += courant + "\n";
                    courant = "";
                //Si la longueur du mot est inférieur a la largeur
                if(mots[i].length() <= this.largeur)
                    //On ajoute le mot
                    courant += mots[i];
                //Sinon
                else{
                    //On coupe le courant a la même taille que largeur 
                    courant += mots[i].substring(0,this.largeur);
                    mots[i] = "-" + mots[i].substring(this.largeur);
                    i--;
                }               
            }              
        }

        //Si il reste des mots dans courant
        if(courant.length() > 0) {
            for(int j = 0; j < (this.largeur - courant.length())/2; j++)
                retour += " ";
            retour += courant + "\n";
        }

        return retour;
    }
}