import java.util.*;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;


    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourself(String userInput) {

        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {

            locationCells.remove(index);

            if (locationCells.isEmpty()) {

                result = "kill";
                System.out.println("Ouch! You sunk " + name + " : (");

            }else {

                result = "hit";


            }

        }



    }
}
