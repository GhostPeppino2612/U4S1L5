public class RegistrazioneAudio extends ElementoMultimediale {
    private int durata;
    private int volume;

    public RegistrazioneAudio(String title, int durata, int volume) {
        super(title);
        this.durata = durata;
        this.volume = volume;
    }

    public void play() {
        String esclamations = "";
        for (int i = 0; i < volume; i++) {
            esclamations += "!";
        }
        for (int i = 0; i < durata; i++) {
            System.out.println("Il titolo:" + this.title + "Il Volume: " + esclamations);
        }
    }
    public void abbassaVolume() {
        volume--;
    }

    public void alzaVolume() {
        volume++;
    }
    public void esegui() {
        play();
    }
}
