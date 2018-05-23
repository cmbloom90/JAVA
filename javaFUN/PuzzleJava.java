import java.util.ArrayList;

public class PuzzleJava{
    
    public void testArray(ArrayList<Integer> puzzleArray){
    
        ArrayList<Integer> newList= new ArrayList<Integer>();
        int sum = 0;{
        for(int i=0; i<puzzleArray.size();i++){
            i += sum;
            if(i> 10){
                newList.add(i);
            }
        }
    }
    ArrayList<Integer> puzzleArray1 = new ArrayList<Integer>();
    puzzleArray1.add(3);
    puzzleArray1.add(5);
    puzzleArray1.add(1);
    puzzleArray1.add(2);
    puzzleArray1.add(7);
    puzzleArray1.add(9);
    puzzleArray1.add(8);
    puzzleArray1.add(13);
    puzzleArray1.add(25); 
    puzzleArray1.add(32);          
    }
}
    