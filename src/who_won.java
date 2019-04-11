public class who_won {
    public who_won(int su,int s,int me){
        if(me==0){
            if(s>su)
                System.out.println("\n\nCongratulations, You won !!");
            else if(s==su)
                System.out.println("\n\nIts a DRAW !!");
            else
                System.out.println("\n\nYou lost, PC won\nTry again later");

            }
        else{
            if(s<su)
                System.out.println("\n\nYou lost, PC won\nTry again later");
            else if(s==su)
                System.out.println("\n\nIts a DRAW !!");
            else
                System.out.println("\n\nCongratulations, You won !!");
        }
    }
}
