import java.util.HashMap;
import java.util.Set;
public class HashMapSong{
    public static void main (String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("man.Ihave been everywhere, man.Crossed the deserts bare, man","Ihave Been Everywhere");
        trackList.put("Well East coast girls are hipI really dig those styles they wear","California Girls");
        trackList.put("You just slip out the back, JackMake a new plan, StanYou dont need to be coy, Roy","list song");
        trackList.put("Beautys where you find it move to the music","Vogue");

        String trackName = trackList.get("Well East coast girls are hipI really dig those styles they wear");
        System.out.println("this is the track name" + trackName);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }

}


