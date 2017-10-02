import java.util.*;

public class KatteInternatet {
    public static void main(String[] args) {
        System.out.println("Hello internat!");

        Kat kat1; // Deklarer kat1 variablen
        kat1 = new Kat("Garfield"); // Initierer variablen
        kat1.sov();
        kat1.setAlder(3);
        kat1.hvorGammel();

        Kat kat2; // Deklarer kat2 variablen
        kat2 = new Kat("Misser"); // Initierer variablen
        kat2.sov();

        Kat kat3 = new Kat("Pølse"); // Initierer og deklarerer variablen
        kat3.hop();

        // Viser kat1 og kat2s alder
        kat1.hvorGammel();
        kat2.hvorGammel();

        // Slette kat3
        kat3 = null;

        // En lækker anvendelse af Dato klassen
        Date dato = new Date();
        System.out.println(dato.toString());
        // Her kan du se, hvorn kan man gøre datoen til dansk
        // http://www.linuxbog.dk/java/bog/java-i18n-formatering-dato.html

        // En lækker anvendelse af Random klassen
        Random random1 = new Random(3);
        System.out.print("From random1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random1.nextInt(1000) + " ");
        Random random2 = new Random(3);
        System.out.print("\nFrom random2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random2.nextInt(1000) + " ");
        // Her kan du se, hvordan vi kan lave tilfældige numre
        // https://www.tutorialspoint.com/java/lang/math_random.htm


        System.out.println();
        System.out.println();
        //Her starter mit
        Hund hund1 = new Hund("Søren", 5, "stor hund");
        System.out.println("Hunden "+ hund1.navn + " er lige oprettet. Den er "+ hund1.alder+" år gammel.");
        hund1.setAlder(6);
        hund1.hvorGammel();


    }
}
