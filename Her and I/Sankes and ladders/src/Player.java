public class Player {
    protected String name;
    protected int position;

    public Player(String name) {
        this.name = name;
        this.position = 0;
    }

    public int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public void move(int step) {
        if (this.position + step <= 100) {

            this.position += step;
        } else {
            System.out.println(name + " need exact roll to reach 100");

        }
    }

    public void checkPositon() {
        // this method will check the postion from the main class
        this.position = SnakeGame.snakeTrap(this.position);
        this.position = SnakeGame.ladderReach(this.position);
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
