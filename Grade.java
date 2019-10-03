import java.util.Scanner;

class Grade{
    public static void main(String[]args){
        System.out.println("what is your grade");
        Scanner sc = new Scanner(System.in);
        double grade = sc.nextDouble();
        if(grade <= 100 && grade >= 86){
            System.out.println("your grade is A");
        } else if(grade <= 85 && grade >= 73){
            System.out.println("your grade is B");
        } else if(grade <= 72 && grade >= 67){
            System.out.println("your grade is C+");
        } else if(grade <= 66 && grade >= 60){
            System.out.println("your grade is C");
        } else if(grade <= 59 && grade >= 50){
            System.out.println("your grade is C-");
        } else {
            System.out.println("your grade is F");
        }
            
        
        
        
        
        
        
        
        
        
        
    }
}
