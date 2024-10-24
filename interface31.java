public class interface31 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();// blueprint
}

class Queen implements ChessPlayer{// classes khud se define karegi moves
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all 4 direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}


class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(by 1 step)");
    }
}


