import java.util.ArrayList;
import java.util.Collection;
    //Using SquarePegGame class with PegGame interface
public class SquarePegGame implements PegGame {
    //Initializing variable with datatypes
    private Location[][] board;
    private GameState current_state;

    //Initializing constructor for the class
    public SquarePegGame(int row, int col ) {
        this.current_state = GameState.NOT_STARTED;
        this.board = new Location[row][col];
    }
    
    //initializing getters
    public Location[][] getBoard() {
        return board;
    }

    //Initializing getters
    @Override
    public GameState getGameState() {
        return current_state;
    }
}