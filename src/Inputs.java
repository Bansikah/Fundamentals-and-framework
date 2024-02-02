import java.util.Scanner;

public class Inputs {

    public static void main(String [] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String name = input.nextLine();
//        System.out.println("How old are you?");
//        int age = input.nextInt();
//        //outputs
//        System.out.println("Hey"+ name);
//        System.out.println("You are"+ age +" years old!");
//        input.close();
        //*****Control Structures using if, else if, and else conditions
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("How old are you?");
        //using control structures
        if(age > 18 && age <=60){
            System.out.println("You are an adult");
            if((age >= 18) && (age <=30) ) {
                System.out.println("you are in your 20s");
            }
                else if((age >= 30) && (age <=40)) {
                System.out.println("You are in your 30s or 40s");
            }
        else{
            System.out.println("You are a senior Citizen!");
            }
        }
        else{
            System.out.println("Please enter your name");
        }
    }
}
