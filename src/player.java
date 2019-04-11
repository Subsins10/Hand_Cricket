import java.util.*;

public class player {
    public player(Scanner sc, int s,int su,pc_numbers t) {
        int me=0;
        System.out.println("Do you want to Bat or Bowl?");
        System.out.println("Press 'B' for batting\nPress 'b' for bowling");
        char choice = sc.next().charAt(0);

        if (choice == 'B'){
            System.out.println("\nYou chose batting\n");
            System.out.println("\nYou Start batting ");
            s = ur_batting.bat1st(t, sc, s, me);

            me++;
            System.out.println("\nPC's Target is "+s+"\n\n--------------------2nd Innings------------------------\n\n");
            System.out.println("You Start bowling ");
            //su = ur_bowling.bowl2nd(t, sc, su,s,me);
            su = ur_batting.bat2nd(t,sc,s,su,me);
            me--;

        }
        else if(choice == 'b'){
            me++;
            System.out.println("\nYou chose bowling\n");
            System.out.println("You Start bowling ");
            //su = ur_bowling.bowl1st(t, sc, su,me);
            su=ur_batting.bat1st(t, sc, su, me);

            me--;
            System.out.println("\nYour Target is "+s+"\n\n-------------------2nd Innings------------------------\n\n");
            System.out.println("You Start batting ");
            s = ur_batting.bat2nd(t,sc,su,s,me);
        }
        new who_won(su,s,me);
    }
}
