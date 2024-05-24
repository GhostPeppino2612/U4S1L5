public class Video extends ElementoMultimediale {
    public int durata;
    public int volume;
    public int luminosita;

    public Video(String title, int durata, int volume, int luminosita) {
        super(title);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public void play() {
        String aster = "";
        String esclamations = "";
        for (int i = 0; i < luminosita; i++) {
            aster += "*";
        }
        for (int i = 0; i < volume; i++) {
            esclamations += "!";
        }
        for (int i = 0; i < durata; i++) {
            System.out.println("Il titolo: " + this.title + " Il Volume: " + esclamations + " Luminosità : " + aster);
        }
    }
    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }
    public void esegui() {
        play();
    }
}
