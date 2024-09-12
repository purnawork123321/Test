package HackerRank;

public class Winner {
    public static void main(String[] args) {
       String eric = args[0];
       String babar = args[1];

       char[] ericEff = new char[eric.length()];
        for (int i = 0; i < eric.length(); i++) {
            ericEff[i] = eric.charAt(i);
        }
       int ericScore=0;
       for (int i=0;i<ericEff.length;i++) {
           if (ericEff[i] == 'E') {
               ericScore = ericScore+1;
           } else if (ericEff[i] == 'M') {
               ericScore = ericScore+3;
           }else if (ericEff[i] == 'H') {
               ericScore = ericScore+5;
           }
       }

        char[] babarEff = new char[babar.length()];
        for (int i = 0; i < babar.length(); i++) {
            babarEff[i] = babar.charAt(i);
        }
        int babarScore=0;
        for (int i=0;i<babarEff.length;i++) {
            if (babarEff[i] == 'E') {
                babarScore = babarScore+1;
            } else if (babarEff[i] == 'M') {
                babarScore = babarScore+3;
            }else if (babarEff[i] == 'H') {
                babarScore = babarScore+5;
            }
        }

        if (ericScore>babarScore)
            System.out.println("Eric is winner");
        else if(babarScore>ericScore) {
            System.out.println("Babar is winner");
        } else {
            System.out.println("Tied");
        }
    }
}
