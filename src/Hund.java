public class Hund {
    int alder=-100;
    String navn = "NONAME";
    String race = "IngenRace";
    int antalBen = 0;
    String personlighed = "INGEN";
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

    //Tilføj flere get/set
    public void setPersonlighed(String personlighed){
        this.personlighed = personlighed;
    }

    public String getPersonlighed() {
        return personlighed;
    }

    public void setAntalBen(int antalBen){
        this.antalBen = antalBen;
    }

    public int getAntalBen(){
        return antalBen;
    }

    //Har lavet ENUM her, så du kun behøves at "ændre" i en klasse..
    public enum Farver{n,a,d,e,f,g,s,y,w}
    Farver hundFarve = Farver.d;

}
