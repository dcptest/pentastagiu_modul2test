package pentastagiuTest;

public class clasaNoua {

    private static int ore;
    private static int minute;
    private static int secunde;
    private static int paritate = 0;
    public String sep = System.lineSeparator();

    public void beculetPornit(int secunde){
        if(secunde%2==0){
            System.out.println("X");
        }
    }
    public void printOre(int ore){
        int iteratii = ore/5;
        int rest = ore-(iteratii*5);


        for (int i = 0; i < iteratii; i++) {
            System.out.print("O");
            if (i==iteratii-1){
                System.out.print(sep);
            }
        }
        for(int i = 0; i<rest; i++){
            System.out.print("Y");
            if (i==rest-1){
                System.out.print(sep);
            }
        }
    }

    public void printMinute(int minute){
        int iteratii = minute/5;
        int rest = minute-(iteratii*5);
        for (int i=0; i< iteratii; i++){
            System.out.print("M");
            if (i==iteratii-1){
                System.out.print(sep);
            }
        }
        for (int i = 0; i < rest; i++) {
            System.out.print("Z");
            if (i==rest-1){
                System.out.print(sep);
            }
        }
    }

    public void printSecunde(int secunde){
        for(int i=0; i<secunde; i++){
            if (paritate == 0){
                System.out.print("I");
                paritate++;
            } else {
                System.out.print("P");
                paritate--;
            }
            if (i==secunde-1){
                System.out.print(sep);
            }
        }
    }

    public int getOre() {
        return ore;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecunde() {
        return secunde;
    }

    public void setSecunde(int secunde) {
        this.secunde = secunde;
    }

    public int getParitate() {
        return paritate;
    }
}
