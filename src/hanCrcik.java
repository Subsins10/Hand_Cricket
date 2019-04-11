import java.util.*;

public class hanCrcik {
    public static void main(String[] args) {
        int s=0,su=0;
        Scanner sc=new Scanner(System.in);
        pc_numbers t=new pc_numbers();
        toss to=new toss();


        System.out.println("Welcome to this game\nlets play hand-cricket with PC\n");
        System.out.println("RULES:\n1)You can only use 1,2,3,4,5 and 6.\n2)When Bowling, 7,8,9 and 0 are wide balls " +
                "and will cost you a run.\n" +
                "  Try to use single digit, if the number more than single digit then the one's digit of that number will be accepted.\n" +
                "3)When Batting, try to use single digit, if the number more than 6 then you are OUT!!\n" +
                "  If the number more than single digit then the one's digit of that number will be accepted.\n\nSo Lets GO!!\n");
        System.out.println("\nEnter H for heads\nEnter T for tails\n");
        String c=sc.next();
        boolean value=to.tossin(t,c);

        if( value == true)
            new player(sc,s,su,t);

        else
            new PC(sc,s,su,t);
        }
    }