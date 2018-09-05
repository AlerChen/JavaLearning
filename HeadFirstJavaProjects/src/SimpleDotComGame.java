

public class SimpleDotComGame {


    public static void main (String[] args) {

        // 记录玩家猜测次数
        int numberOfGuesss = 0;

        GameHelper gameHelper = new GameHelper();

        SimpleDotCom simpleDotCom = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum,randomNum+1,randomNum+2};

        // 赋值
        simpleDotCom.setLocationCells(locations);

        // 记录游戏生命线
        boolean isAlive = true;

        while (isAlive == true){

            String guess = gameHelper.getUserInput("enter a number");
            String result = simpleDotCom.checkYouself(guess);

            numberOfGuesss++;

            if (result.equals("kill")) {

                isAlive = false;
                System.out.println("You took " + numberOfGuesss + " guesses");

            }

        }

    }

}
