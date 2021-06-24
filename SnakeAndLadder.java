public class SnakeAndLadder {

    public static void main(String[] args) {

        final int NO_PLAY = 0, LADDER = 1, SNAKE = 2;
        int position = 0, option = 0, die = 0, count = 0;

        while (true) {
            count++;
            die = (int) Math.floor(Math.random() * 1000) % 6 + 1;
            option = (int) Math.floor(Math.random() * 10) % 3;

            switch (option) {

                case LADDER:
                    if ((position + die) > 100) {
                        position = position;
                        break;
                    } else {
                        position += die;
                        break;
                    }

                case SNAKE:
                    if ((position - die) < 0) {
                        position = 0;
                        break;
                    } else {
                        position -= die;
                        break;
                    }
            }

            System.out.println("position:" + position);
            if (position == 100)
                break;
        }

        System.out.println("number of times the dice was played to win the game is:" + count);
    }
}
