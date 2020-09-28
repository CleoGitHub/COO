public class Main {
    public static void main(String[] args) {

        TexteCentre t = new TexteCentre("Teste de phrases");
        System.out.print(t);

        t.fixeLargeur(5);
        System.out.print(t);
    }
}