

public class SimpleDotComTestDrive {

    // 测试代码
    public static void main (String[] srgs){


        SimpleDotCom dot = new SimpleDotCom();

        int[] locationCells = {2,3,4};

        dot.setLocationCells(locationCells);

        String guessNumver = "2";

        dot.checkYouself(guessNumver);

    }

}

