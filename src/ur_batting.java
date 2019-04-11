import java.util.*;

public class ur_batting {
    protected static int bat1st(pc_numbers t,Scanner sc, int s,int me) {
        int w=0;
        while(1 != 0) {
            //this is me batting 1st and pc is bowling
            if(me==0){
                int n=t.BowlnBat();
                int c=sc.nextInt()%10;
                System.out.println("You gave "+c);
                System.out.println("PC gave "+n);

                if(c==n || c==7 || c==8 || c==9){
                    System.out.println("\nOUT!! total run is " + s);
                    break;
                }
                else {
                    if (s > 49)
                        System.out.println("Congrats for crossing 50");
                    else if (s > 99)
                        System.out.println("Standing Applause for crossing 100");
                    s += c;
                }
            }

            //this is pc batting 1st and im am bowling
            else{

                int n=t.BowlnBat();
                int c=sc.nextInt()%10;
                System.out.println("PC gave "+n);
                System.out.println("You gave "+c);

                if(c==n){
                    System.out.println("OUT!! total run is " + s);
                    break;
                }
                else {
                    if(c>6||c==0) {
                        System.out.println("Wide Ball");
                        w++;
                        s++;
                    }
                    else if (s==50)
                        System.out.println("Congrats for crossing 50");
                    else if (s==100)
                        System.out.println("Standing Applause for crossing 100");
                    s += n;
                }
            }
        }
        System.out.println("No. of Wide balls = "+w);
        return s;
    }






    protected static int bat2nd(pc_numbers t,Scanner sc, int s,int su, int me){
        int w=0;
        while(1 != 0) {
            //this is me batting 2nd and chasing pc's score   pc is bowling now
            if(me==0){
                if(su>s){
                    System.out.println("You scored "+su);
                    break;
                }
                int n=t.BowlnBat();
                int c=sc.nextInt()%10;
                System.out.println("You gave "+c);
                System.out.println("PC gave "+n);

                if(c==n || c==7 || c==8 || c==9){
                    System.out.println("OUT!! total run is " + su);
                    break;
                }
                else{
                    if(su>49)
                        System.out.println("Congrats for crossing 50");
                    else if(su>99)
                        System.out.println("Standing Applause for crossing 100");
                    su+=c;
                }
            }

            //this is pc batting 2nd and chasing my score    i am bowling now
            else{
                if(su>s){
                    System.out.println("PC scored "+su);
                    break;
                }
                int n=t.BowlnBat();
                int c=sc.nextInt()%10;
                System.out.println("PC gave "+n);
                System.out.println("You gave "+c);

                if(n==c){
                    System.out.println("OUT!! total run is " + su);
                    break;
                }
                else{
                    if(c>6||c==0) {
                        System.out.println("Wide Ball");
                        w++;
                        su++;
                    }
                    else if(su>49 && su<53)
                        System.out.println("Congrats for crossing 50");
                    else if(su>99 && su<103)
                        System.out.println("Standing Applause for crossing 100");
                    su+=n;
                }
            }
        }
        System.out.println("No. of Wide balls = "+w);
        return su;
    }
}


