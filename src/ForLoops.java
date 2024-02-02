import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = input.nextInt();

        for(int i = 1; i <= 10; i++){
            int results = i * number;
            System.out.println(number +"x"+ i+"="+ results);
            if(results >= 6){
                System.out.println("The line breaks");
            }
            System.out.println("The for loop has ended");
            input.close();
        }
    }
}
