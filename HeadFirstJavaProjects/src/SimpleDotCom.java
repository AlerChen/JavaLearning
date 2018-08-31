

public class SimpleDotCom {

    // 谜底数组
    int[] locationCells;
    // 猜中次数
    int numberOfHits;


    public void setLocationCells (int[] locationCells){
        this.locationCells = locationCells;
    }

    public String checkYouself(String guessNumber){

        // string转换int
        int guess = Integer.parseInt(guessNumber);

        String result = "miss";

        for (int cell : locationCells){

            if (cell == guess){

                result = "hit";
                numberOfHits++;
                break;

            }
        }

        if (numberOfHits == locationCells.length){

            result = "kill";
        }

        System.out.println(result);

        return result;

    }

}
