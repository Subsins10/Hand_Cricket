import java.util.*;

public class pc_numbers {
    Random r=new Random();

    public int BowlnBat(){

        int[] arr={0, 1, 2, 3, 4, 5, 6, 9};
        int randomrun=r.nextInt(arr.length);
        return arr[randomrun];

    }
    public String tossing(){


        String[] tos={"H","T"};
        int no=r.nextInt(tos.length);
        String randomtoss=tos[no];
        return randomtoss;

    }
    public String choice(){


        String[] pc_choice={"B","b"};
        int no=r.nextInt(pc_choice.length);
        String randomchoice=pc_choice[no];
        return randomchoice;
    }
}
