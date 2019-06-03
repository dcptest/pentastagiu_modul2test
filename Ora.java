package pentastagiuTest;

public class Ora extends clasaNoua {
    public static void main(String[] args) {
            Ora newOra = new Ora();
            newOra.setOre(19);
            newOra.setMinute(31);
            newOra.setSecunde(43);

            newOra.beculetPornit(newOra.getSecunde());
            newOra.printOre(newOra.getOre());
            newOra.printMinute(newOra.getMinute());
            newOra.printSecunde(newOra.getSecunde());

        System.out.println("Legenda: X = numar par de secunde; O = 5 ore; Y = 1 ora; M = 5 min; Z = 1 min; I/P = secunde impare/pare");
    }
}
