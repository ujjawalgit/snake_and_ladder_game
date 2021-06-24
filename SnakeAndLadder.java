public class SnakeAndLadder {

    public static void main(String[] args) {

        final int NO_PLAY = 0, LADDER = 1, SNAKE = 2;
        int position = 0, option = 0, die = 0;

        die = (int) Math.floor(Math.random() * 1000) % 6 + 1;
        option = (int) Math.floor(Math.random() * 10) % 3;
        switch (option) {

            case LADDER:
                position += die;
                break;

            case SNAKE:
                position -= die;
                break;
        }
    }
}
