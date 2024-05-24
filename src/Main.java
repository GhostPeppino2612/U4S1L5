import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Inserisci il titolo dell'elemento " + (i + 1) + ": ");
            String titolo = scanner.nextLine();
            System.out.print("Seleziona il tipo di elemento (1 = Immagine, 2 = RegistrazioneAudio, 3 = Video): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.print("Inserisci la luminosità dell'immagine: ");
                    int luminosita = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminosita);
                    break;
                case 2:
                    System.out.print("Inserisci la durata della registrazione audio: ");
                    int durataAudio = scanner.nextInt();
                    System.out.print("Inserisci il volume della registrazione audio: ");
                    int volumeAudio = scanner.nextInt();
                    elementi[i] = new RegistrazioneAudio(titolo, durataAudio, volumeAudio);
                    break;
                case 3:
                    System.out.print("Inserisci la durata del video: ");
                    int durataVideo = scanner.nextInt();
                    System.out.print("Inserisci il volume del video: ");
                    int volumeVideo = scanner.nextInt();
                    System.out.print("Inserisci la luminosità del video: ");
                    int luminositaVideo = scanner.nextInt();
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                default:
                    System.out.println("Tipo non valido. Riprova.");
                    i--; // Ripeti l'iterazione
            }
        }

        while (true) {
            System.out.print("Quale elemento vuoi eseguire? (1-5, 0 per uscire): ");
            int scelta = scanner.nextInt();
            if (scelta == 0) {
                break;
            } else if (scelta >= 1 && scelta <= 5) {
                elementi[scelta - 1].esegui();

            } else {
                System.out.println("Scelta non valida. Riprova.");
            }
        }
    }
}