package peggame2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BoardShape {
    private String filename;

    public BoardShape(String filename) {
        this.filename = filename;
    }

    /**
     * This method is responsible for creating an instance of a square peg game with a board
     * @return gameWithBoard
     * @throws IOException
     */
    public PegGame readFromFile() throws IOException {
        SquarePegGame gameWithBoard;
        try (FileReader fileReader = new FileReader(filename);
                BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            int size = Integer.parseInt(bufferedReader.readLine());

            gameWithBoard = new SquarePegGame(size, size);
            for (int row = 0; row < size; row++) {
                String line = bufferedReader.readLine();
                for (int column = 0; column < size; column++) {
                    if (line.charAt(column) == 'o') {
                        gameWithBoard.getBoard()[row][column] = new Location(row, column);
                    } else if (line.charAt(column) == '.') {
                        gameWithBoard.getBoard()[row][column] = null;
                    }
                }
            }
        }
        return gameWithBoard;
    }

}
