package Day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] desk = new ChessPiece[8];
        for (int i=0;i< desk.length;i++) {
            if (i<4) {
                desk[i] = ChessPiece.PAWN_WHITE;
            } else {
                desk[i] = ChessPiece.ROOK_BLACK;
            }
        }
        for (ChessPiece chessPiece : desk) {
            System.out.print(chessPiece.getStrName()+" ");
        }
    }
}
