public class Immagine extends ElementoMultimediale {
    public int luminosita;

    public Immagine(String title, int luminosita) {
        super(title);
        this.luminosita = luminosita;
    }

    public void show() {
        String aster = "";
        for (int i = 0; i < luminosita; i++) {
            aster += "*";
        }
        System.out.println("Il titolo dell'immagine: " + this.title + " La luminosità: " + aster);
    }
    public void esegui() {
        show();
    }
}
