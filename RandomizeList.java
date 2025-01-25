import java.util.ArrayList;
import java.util.Random;

public class RandomizeList {
    public static ArrayList<String> randomList(ArrayList<String> theList){
        // Create a copy of the list; to not mutate the original list
        ArrayList<String> theCopiedList = theList;
        ArrayList<String> rList = new ArrayList<String>(theList);
        Random random = new Random();
    // TODO: Need to add an if here for base case of length=1
        for(int i = 0; i < theList.size(); i++){
            int randomNum = random.nextInt(theCopiedList.size()+1);
            //rList.add(theCopiedList[randomNum]); error here

        }
        return rList;
    }
}
