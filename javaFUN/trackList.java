import java.util.HashMap;
import java.util.Iterator;
    public class trackList{
        public static void main(String[] args){
        
            HashMap<String, String> TrackList= new HashMap<>();

            TrackList.put("Supermassive Black Hole", "Glaciers melting in the dead of night And the superstars sucked into the(You set my soul) Into the supermassive");
            TrackList.put("Knights of Cydonia", "Come ride with me Through the veins of history I'll show you a god who Falls asleep on the job");
            TrackList.put("Invincible", "Follow throughMake your dreams come true Don't give up the fight You will be alright");
            TrackList.put("Assasin", "War is overdueThe time has come for you To shoot your leaders down Join forces underground");
            
            int count = 1;
            Iterator it = TrackList.entrySet().iterator();
            while (it.hasNext()) {
                HashMap.Entry pair = (HashMap.Entry)it.next();
                System.out.println(String.format("\n\n%d. %s:\n", count++, pair.getKey()));
                System.out.println(pair.getValue());
                it.remove();
            }    
        }
        

    }


 
