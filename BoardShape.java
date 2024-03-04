package peggame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BoardShape {
    private Location[][] board;

    public Location[][] readFromFile(String filename) throws IOException {
        try (FileReader fileReader = new FileReader(filename);
                BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            int size = Integer.parseInt(bufferedReader.readLine());
            board = new Location[size][size];
            for (int row = 0; row < size; row++) {
                String line = bufferedReader.readLine();
                for (int column = 0; column < size; column++) {
                    if (line.charAt(column) == 'o') {
                        board[row][column] = new Location(row, column);
                    } else if (line.charAt(column) == '.') {
                        board[row][column] = null;
                    }
                }
            }
        }
        return board;
    }

    public Location[][] getBoard() {
        return board;
    }
}
