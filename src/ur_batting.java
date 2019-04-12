import java.util.*;

public class ur_batting {
    protected static int bat1st(pc_numbers t,Scanner sc, int s,int me) {
        int w=0, no=0, fif=0,hun=0;
        while(1 != 0) {
            //this is me batting 1st and pc is bowling
            if(me==0){
                int n=t.BowlnBat();
                int c=sc.nextInt()%10;
                System.out.println("You gave "+c);
                System.out.println("PC gave "+n);

                if(c==n || c>=7 || c==0){
                    System.out.println("\n\nOUT!! total run is " + s);
                    break;
                }
                else {
                    if (n == 0) {
                        System.out.println("No Ball i.e. (1 + Your runs) = FREE HIT !!");
                        no++;
                        s++;
                    } else if (n == 9) {
                        System.out.println("Wide ball, one run add to your total");
                        w++;
                        c = 1;
                    }
                    s += c;
                    if (s > 49 || s > 99) {fif++;
                        if (s > 49 && fif==1){System.out.println("\nCongrats for crossing 50"); hun++;}
                        else if (s > 99 && hun==1){System.out.println("\nStanding Applause for crossing 100"); hun++;}}
                }
            }

            //this is pc batting 1st and im am bowling
            else{

                int n=t.BowlnBat();
                int c=sc.nextInt()%10;
                //just for cheating lol
                if(n==9) n-=4;
                else if(n==0) n++;

                System.out.println("PC gave "+n);
                System.out.println("You gave "+c);

                if(c==n){
                    System.out.println("\n\nOUT!! total run is " + s);
                    break;
                }
                else {
                    if(c==0) {
                        System.out.println("No Ball i.e. (1 + Your runs) = FREE HIT !!");
                        no++;
                        s++;
                    }
                    else if(c>6){
                        System.out.println("Wide ball, one run add to your total");
                        w++;
                        n=1;
                    }
                    s+=n;

                    if (s > 49 || s > 99) {fif++;
                        if (s > 49 && fif==1){System.out.println("Congrats for crossing 50"); hun++;}
                        else if (s > 99 && hun==1){System.out.println("Standing Applause for crossing 100"); hun++;}}
                }
            }
        }
        System.out.println("No. of Wide balls = "+w);
        System.out.println("No. of No balls = "+no);
        return s;
    }






    protected static int bat2nd(pc_numbers t,Scanner sc, int s,int su, int me){
        int w=0, no=0,hun=0,fif=0;
        while(1 != 0) {
            //this is me batting 2nd and chasing pc's score   pc is bowling now
            if(me==0){
                if(su>s){
                    System.out.println("\n\nTotal runs + No. of wides + No. of NOs\nYou scored "+su);
                    break;
                }
                int n=t.BowlnBat();
                int c=sc.nextInt()%10;
                System.out.println("You gave "+c);
                System.out.println("PC gave "+n);

                if(c==n || c>=7 || c==0){
                    System.out.println("OUT!! total run is " + su);
                    break;
                }
                else{
                    if(n==0) {
                        System.out.println("No Ball i.e. (1 + Your runs) = FREE HIT !!");
                        no++;
                        su++;
                    }
                    else if(n==9){
                        System.out.println("Wide ball, one run add to your total");
                        w++;
                        c=1;
                    }

                    su+=c;
                    if (su > 49 || su > 99) {fif++;
                        if (su > 49 && fif==1){System.out.println("Congrats for crossing 50"); hun++;}
                        else if (su > 99 && hun==1){System.out.println("Standing Applause for crossing 100"); hun++;}}
                }
            }

            //this is pc batting 2nd and chasing my score    i am bowling now
            else{
                if(su>s){
                    System.out.println("\n\nTotal runs + No. of wides + No. of NOs\nPC scored "+su);
                    break;
                }
                int n=t.BowlnBat();
                int c=sc.nextInt()%10;
                System.out.println("PC gave "+n);
                System.out.println("You gave "+c);

                //just for cheating lol
                if(n==9) n-=4;
                else if(n==0) n++;

                if(n==c){
                    System.out.println("OUT!! total run is " + su);
                    break;
                }
                else{
                    if(c==0) {
                        /*System.out.println("Wide Ball");
                        w++;
                        su++;*/
                        System.out.println("No Ball i.e. (1 + Your runs) = FREE HIT !!");
                        no++;
                        su++;
                    }
                    else if(c>6){
                        System.out.println("Wide ball, one run add to your total");
                        w++;
                        n=1;
                    }

                    su+=n;
                    if (su > 49 || su > 99) {fif++;
                        if (su > 49 && fif==1){System.out.println("Congrats for crossing 50"); hun++;}
                        else if (su > 99 && hun==1){System.out.println("Standing Applause for crossing 100"); hun++;}}
                }
            }
        }
        System.out.println("No. of Wide balls = "+w);
        System.out.println("No. of No balls = "+no);
        return su;
    }
}


