
public class GuessGame {

    // 属性变量
    Player p1;
    Player p2;
    Player p3;


    public void start() {

        // 实例化属性变量
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // 记录玩家猜测数字变量
        int guessNumber1 = 0;
        int guessNumber2 = 0;
        int guessNumber3 = 0;

        // 记录玩家是否猜中变量
        boolean isRight1 = false;
        boolean isRight2 = false;
        boolean isRight3 = false;

        // 产生谜底数字
        int targetNumber = (int) (Math.random() * 10);

        System.out.println("I'm thinking of a number between 0 and 9 ..");

        while (true){


            // Start
            System.out.println("Game start");
            // Player Guess
            p1.guess();
            p2.guess();
            p3.guess();
            // Show target number
            System.out.println("Number to guess is " + targetNumber);

            // Check answer
            if (p1.number == targetNumber){
                isRight1 = true;
            }
            if (p2.number == targetNumber){
                isRight2 = true;
            }
            if (p3.number == targetNumber){
                isRight3 = true;
            }

            // Check winner
            if (isRight1 || isRight2 || isRight3) {

                System.out.println("We have winner !");
                System.out.println("player one got it right ? " + isRight1);
                System.out.println("player two got it right ? " + isRight2);
                System.out.println("player three got it right ? " + isRight3);

                // Finished game
                break;

            } else {

                System.out.println("Player will have to try again.");

            }

        }

    }

}
