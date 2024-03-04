package peggame;

import java.util.ArrayList;
import java.util.Collection;

public class SquarePegGame implements PegGame {

    private BoardShape board;
    private GameState current_state;

    public SquarePegGame(){
        this.current_state=GameState.NOT_STARTED;
        this.board=new BoardShape();
    }

    @Override
    public GameState getGameState() {
        return current_state;
    }

    @Override
    public Collection<Move> getPossibleMoves() {
        Collection<Move> collection = new ArrayList<>();
        Location[][] temporaryBoard= board.getBoard();
        for (int row= 0; row <temporaryBoard.length; row++){
            for (int column=0; column< temporaryBoard[row].length; column++){
                if (temporaryBoard[row][column]!=null){
                    for(){
                        
                    }
                    
                    if(row-2>=0&& column-2>=0){

                    }
                    if ()

                }
            }
        }
    
        return collection;
    }

    @Override
    public void makeMove(Move move) throws PegGameException {// not sure how to do that either
        
            if (getPossibleMoves().contains(move)){
            
                return;
            } else {
                throw new PegGameException("invalid move");
            }
                
        
    }

    @Override
    public String toString() {
        return ""; //check if my BoardShape class is good, if  it's then make the toString method 
    }

}
