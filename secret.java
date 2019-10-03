import java.util.Scanner;

class secret{
    public static void main(String[]args){
        System.out.println("what is the password");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if("dragon".equals(answer)){
            System.out.println("you are correct");
            System.out.println("The secret is: It is what you think it is");
        
}
}
}