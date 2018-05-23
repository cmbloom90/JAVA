import java.util.ArrayList;

public class Basics{
    public void print1to255() {
        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }
    
    public void printOdds1to255() {
        for (int i = 1; i < 256; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void printIntsAndSums1To255() {
        int sum = 0;
        for (int i = 1; i < 256; i++) {
            sum += i;
            System.out.println(String.format("int: %d sum: %d", i, sum));
        }
    }
    
    public void printMax(ArrayList<Object> list) {
        int max = (int) list.get(0);
        for (Object item : list) {
            int val = (int) item;
            if (val > max) {
                max = val;
            }
        }
        System.out.println(max);
    }
    
    public void printAvg(ArrayList<Object> list) {
        Double sum = 0.0;
        for (Object item : list) {
            sum += (int) item;
        }
        System.out.println(sum / list.size());
    }
    
    public int[] oddsArray1to255() {
        int[] arr = new int[128];
        for (int i = 0; i < 128; i++) {
            arr[i] = 2 * i + 1;
        }
        return arr;
    }
    
    public void greaterThanY(ArrayList<Object> list, int y) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((int) list.get(i) > y) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    public void squareArray(ArrayList<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            int val = (int) list.get(i);
            list.set(i, val * val);
        }
        System.out.println(list);
    }
    
    public void eliminateNegatives(ArrayList<Object> list)
    {
        for (int i=0; i<list.size(); i++)
        {
            if ((int) list.get(i) < 0)
            {
                list.set(i, 0);
            }       
        }
        System.out.println(list);
    }
    
    public void shiftArrayToLeft(ArrayList<Object> list) {
        int i = 0;
        for (i = 0; i < list.size() - 1; i++) {
            list.set(i, list.get(i + 1));
        }
        list.set(i, 0);
        System.out.println(list);
    }
    


}