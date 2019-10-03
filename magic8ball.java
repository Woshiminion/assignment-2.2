
import java.util.Scanner;

class magic8ball {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ask me a yes or no question");
        sc.nextLine();
   
        
        int X = (int) (Math.random()*10)+1;
        if (X==1){
            System.out.println("The magic 8 ball says: As I see it, yes.");
        }
        if (X==2){
            System.out.println("The magic 8 ball says: Ask again later.");
        }
        if (X==3){
            System.out.println("The magic 8 ball says: Better not tell you now.");
        }
        if (X==4){
            System.out.println("The magic 8 ball says: Cannot predict now.");
        }
        if (X==5){
            System.out.println("The magic 8 ball says: Concentrate and ask again.");
        }
        if (X==6){
            System.out.println("The magic 8 ball says: Don't count on it.");
        }
        if (X==7){
            System.out.println("The magic 8 ball says: It is certain.");
        }
        if (X==8){
            System.out.println("The magic 8 ball says: It is decidedly so.");
        }
        if (X==9){
            System.out.println("The magic 8 ball says: My reply is no.");
        }
        if (X==10 ){
            System.out.println("The magic 8 ball says: Very doubtful.");
        }
    }
    
}