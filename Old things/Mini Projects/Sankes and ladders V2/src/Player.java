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
        this.position = snakeTrap(this.position);
        this.position = ladderReach(this.position);
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    static int snakeTrap(int pos) {
        int[] trap = new int[101];
        trap[17] = 7;
        trap[54] = 34;
        trap[62] = 19;
        trap[64] = 60;
        trap[87] = 24;
        trap[93] = 73;
        trap[95] = 75;
        trap[98] = 79;
        // now let's check
        if (trap[pos] != 0) {
            System.out.println("oops ! the snakc ate you :(");
            pos = trap[pos];
            System.out.println("your current postion now is : " + pos);
            return pos;
        } else {
            return pos;
        }
    }

    static int ladderReach(int pos) {
        int[] ladder = new int[101];
        ladder[1] = 38;
        ladder[4] = 14;
        ladder[21] = 42;
        ladder[71] = 91;
        ladder[80] = 100;
        // now let's check
        if (ladder[pos] != 0) {
            System.out.println("you've reached the ladder :o");
            pos = ladder[pos];
            System.out.println("Your current postion is : " + pos);
            return pos;
        } else {
            return pos;
        }
    }
}
