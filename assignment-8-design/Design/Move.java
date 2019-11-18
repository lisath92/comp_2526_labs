public abstract class Move {
    public Move(){}
    Movement movement;
    abstract void display();
    public void movePerformance(){
        movement.move();
    }
}

