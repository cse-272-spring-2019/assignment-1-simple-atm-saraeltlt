import sun.rmi.log.LogHandler;
import java.util.HashMap;

//check if the user have access >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
public class Logintest {

     HashMap userdata;
     //user data>>>>>>>>>>>>>>>>>>>
     public Logintest(){
       userdata= new HashMap();
       userdata.put("0000","00");
       userdata.put("3333","00");
     }

    //check code>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     public boolean test(String Card, String Pin) {
         String testPin =  (String) userdata.get(Card);
         if (testPin == null)
            return false;
         else
             return testPin.equals(Pin);
     }


}

