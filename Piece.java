public class Piece {
    int coordx;
    int coordy;
    String clan;
    String type;
    boolean dead = false;
    public Piece(int cx, int cy, String ct, String tt){
        clan = ct;
        type = tt;
        coordx = cx;
        coordy = cy;
    }
    boolean killOff(){
        if(this.type.equals("K")){
            return true;
        }
        return false;
    }
    boolean moveLegal(String move){
        return false;
    }

}
