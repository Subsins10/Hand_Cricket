import java.util.*;

public class PC {
    public PC(Scanner sc, int s, int su, pc_numbers t) {
        int me=1;
        if (t.choice().equals("B")) {
            System.out.println("\nPC chose to bat First\n");
            System.out.println("\nPC is batting now\nYou start bowling\n");
            su = ur_batting.bat1st(t, sc, su, me);

            me--;
            System.out.println("\nYour Target is " + su + "\n\n-------------------2nd Innings------------------------\n\n");
            System.out.println("PC is bowling now\nYou start batting\n");

            s = ur_batting.bat2nd(t,sc,su,s,me);
            me++;
        }
        else {
            me--;
            System.out.println("\nPC chose to bowl First\n");
            System.out.println("\nPC is bowling now\nYou start batting\n");
            s=ur_batting.bat1st(t, sc, s, me);

            me++;
            System.out.println("\nPC's Target is " + s + "\n\n-------------------2nd Innings------------------------\n\n");
            System.out.println("PC is batting now\nYou start bowling\n");
            su = ur_batting.bat2nd(t,sc,s,su,me);
        }
        new who_won(su,s,me);
    }
}
