public class Move {
    //Defining the variables
    private Location from;
    private Location to;
    /*
     * It is a constructor for the Move class.
     */
    public Move(Location from, Location to) {
        this.from = from ;
        this.to = to;
    }
    /* 
     * Initializing getters for From and To variables since they are private.
    */
    public Location getFrom() {
        return from;
    }
    public Location getTo() {
        return to;
    }
    /*
     * Overriding equals method to make our way of implementing it.
     * We compare if obj is an instance of move class
     * If both are same, we make the row and column value same for both the instances or else just return false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Move){
            Move other = (Move) obj;
            return from.getRow()== other.from.getRow() && from.getCol() == other.from.getCol() && to.getRow() == other.to.getRow() && to.getCol() == other.to.getCol(); 
        } else {
            return false;
        }
    }
}
