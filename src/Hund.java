public class Hund {
    int alder=-100;
    String navn = "NONAME";
    String race = "IngenRace";

    Hund(String hundensNavn, int hundensAlder, String hundensRace){
        navn = hundensNavn;
        alder =hundensAlder;
        race = hundensRace;
    }
    public void hop(){
        System.out.println("Hunden Hoppe");
    }
    public void sov(){
        System.out.println("Hunden sover");
    }
    public void setAlder(int hundensAlder){
        alder=hundensAlder;
        System.out.println("Hundens alder er nu blevet ændret til: "+alder);
    }

    public void hvorGammel(){
        System.out.println("Hunden er "+ alder+" gammel.");
    }

}
