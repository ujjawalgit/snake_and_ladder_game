public class SnakeAndLadder {
    public static final int NO_PLAY = 0, LADDER = 1, SNAKE = 2;
    public static int[] count = new int[2];
    public static int[] positionOfPlayer = new int[2];
    public static int die = 0, option = 0, turn = 0;

    public static void play() {
        die = (int) Math.floor(Math.random() * 1000) % 6 + 1;
        option = (int) Math.floor(Math.random() * 10) % 3;

        switch (option) {

            case LADDER:
                if ((positionOfPlayer[turn] + die) > 100) {
                    positionOfPlayer[turn] = positionOfPlayer[turn];
                    break;
                } else {
                    positionOfPlayer[turn] += die;
                    break;
                }

            case SNAKE:
                if ((positionOfPlayer[turn] - die) < 0) {
                    positionOfPlayer[turn] = 0;
                    break;
                } else {
                    positionOfPlayer[turn] -= die;
                    break;
                }
        }
        if (turn == 0) {
            System.out.println("Player_1 turn\nPosition reached by Player_1:" + positionOfPlayer[turn]);
            count[turn]++;
        } else {
            System.out.println("Player_2 turn\nPosition reached by Player_2:" + positionOfPlayer[turn]);
            count[turn]++;
        }

        option = (int) Math.floor(Math.random() * 10) % 3;
        if (option == LADDER && positionOfPlayer[turn] != 100)
            play();
        else
            turn = turn == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        while (true) {
            if (positionOfPlayer[0] == 100) {
                System.out.println("\nPalayer_1 won the game \nnumber of times dice rolled to win the game by Palayer_1 is:" + count[0]);
                break;
            }
            if (positionOfPlayer[1] == 100) {
                System.out.println("\nPalayer_2 won the game \nnumber of times dice rolled to win the game by Palayer_2 is:" + count[1]);
                break;
            }
            play();
        }
    }
}
