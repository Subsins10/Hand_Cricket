//import java.util.*;

public class toss {
        public boolean tossin(pc_numbers t,String c) {
            String to=t.tossing();
            System.out.println(to);
            if(c.equals(to)) {
                System.out.println("Great you won the toss\n");
                return true;
            }
            else{
                System.out.println("Sorry PC won the toss\n");
                return false;
            }
        }
}
