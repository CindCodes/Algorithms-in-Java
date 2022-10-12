import java.util.Scanner;

public class GuessMyNumber{
  
        public static void main(String[] args) {
           
            Scanner input = new Scanner(System.in);
            System.out.print("Enter n : ");
            int n=input.nextInt();
            
            System.out.println("Welcome to Guess My Number! ");
            System.out.println(" Please think of a number between 0 and "+(n-1));
            
            int left=0,right=n-1;
            
            while(true){
               
            int guess=(left+right)/2 + (left+right)%2;
            System.out.println(" Is your number : "+guess+"?");
            
            
            System.out.println("Please enter C for correct, H for too high, or L for too low.");
            System.out.print("Enter your response (H/L/C) : ");
            char ans = input.next().charAt(0);
            
            
            if(ans=='C'){
               System.out.println("Thank you for playing Guess My Number!");
               break;
            }
            
            else if(ans=='H')
                right=guess-1;
            
            else if(ans=='L')
                left=guess+1;
            }
        }
}
