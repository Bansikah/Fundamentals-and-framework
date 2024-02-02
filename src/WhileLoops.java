import java.util.Scanner;

public class WhileLoops {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        int count = 0;//initializing count
        while(x != 10){
            System.out.println("Enter a number: ");
            x = input.nextInt();
            count++;//if not the while loop will keep executing...
        }
        System.out.println("That is the correct number, you tried "+ count +" number of times");
        input.close();
    }
}
