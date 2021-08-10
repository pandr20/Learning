package SimpleDotComGame;

import java.util.ArrayList;


public class DotCom {



    //int [] locationCells;
    //int numOfHits = 0;
    private ArrayList<String> locationCells;
    private String name;


  public void setLocationCells(ArrayList<String> loc) {
  locationCells = loc;
  }

  public void SetName(String n) {
      name = n;
  }
     public String checkYourself(String userInput) {

      String result = "miss"; // make a variable to hold the result we'll return. put "miss in as the default (i.e we assume a "miss")

         int index = locationCells.indexOf(userInput); // Find out if the user guess is in the ArrayList, by asking for its index if its not the list, then indexOf() return a -1

         if (index>= 0) {
             locationCells.remove(index);

             if (locationCells.isEmpty()) {
                 result = "Kill";
                 System.out.println("Ouch! You sunk " + name + " : (");
             } else {
                 result = "Hit";
             }
         }
 return result;
    }



    }

    //String checkYourself(String guess)

    // void setLocationCells(int [] loc

