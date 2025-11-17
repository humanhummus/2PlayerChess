public class Board {
    String[] a = {"-", "-", "-", "-", "-", "-", "-", "-"};
    String[] b = {"-", "-", "-", "-", "-", "-", "-", "-"};
    String[] c = {"-", "-", "-", "-", "-", "-", "-", "-"};
    String[] d = {"-", "-", "-", "-", "-", "-", "-", "-"};
    String[] e = {"-", "-", "-", "-", "-", "-", "-", "-"};
    String[] f = {"-", "-", "-", "-", "-", "-", "-", "-"};
    String[] g = {"-", "-", "-", "-", "-", "-", "-", "-"};
    String[] h = {"-", "-", "-", "-", "-", "-", "-", "-"};
    String[][] aa = {a, b, c, d , e, f, g, h};
    Piece[] t1 = {null, null, null, null, null, null, null, null};
    Piece[] t2 = {null, null, null, null, null, null, null, null};
    Piece[] t3 = {null, null, null, null, null, null, null, null};
    Piece[] t4 = {null, null, null, null, null, null, null, null};
    Piece[] t5 = {null, null, null, null, null, null, null, null};
    Piece[] t6 = {null, null, null, null, null, null, null, null};
    Piece[] t7 = {null, null, null, null, null, null, null, null};
    Piece[] t8 = {null, null, null, null, null, null, null, null};
    Piece[][] tracks = {t1, t2, t3, t4, t5, t6, t7, t8};

    void display(){
        for(int i = 0; i < 8; i++){
            for(int b = 0; b < 8; b++){
                String aaa = aa[i][b];
                System.out.print(aaa + "  ");
            }
            System.out.println("");

        }

        
    }

    //next method should use the 2d array, change the first value to "-" and the second to the character moved there

    //Checks the legality of a piece move 
    boolean legalityCheck(char piece){
        if(piece == 'r'){
            
        }
        return false;
    }

}
