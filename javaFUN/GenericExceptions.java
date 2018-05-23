import java.util.ArrayList;

public class GenericExceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        int len = myList.size();
        for(int i= 0; i<len; i++){
            try{
                Integer castedValue = (Integer) myList.get(i);
            }
            catch (ClassCastException e) {
                System.out.println("ERROR ON INDEX {" + i + "}");
                System.out.println(e.getMessage());
            }
        }

    }
}