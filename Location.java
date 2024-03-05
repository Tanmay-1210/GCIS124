public class Location {
    //Defining the variables along with their datatype and whether they are public or private
    private int row;
    private int col;

    //Initializing constructor for Location class with variables
    public Location(int row, int col){
        this.row=row;
        this.col=col;
    }

    //Generating Getters for row and col since they are private
    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }
    
    /*
     * Overriding toString method to change the implementation according to our needs.
     * @return "o" since we have "o" in our game which will be seen further
     */
    @Override 
    public String toString(){
        return"o";
    }
}
