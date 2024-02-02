public class Methods {

    public static void main(String[] args){
        String text = "Hello World";
        System.out.println(text.length());//Here length() is a build in method, but we can create our own methods

        //Calling my created method in the main class
        printHello("Noel", 7);
        System.out.println(printPlusFive(6));
        }
    //Creating my own methods, methods can also receive arguments
    public static void printHello(String name, int n){
      for(int i=0; i < n; i++){
          System.out.println("Hello "+ name );
      }
    }
    //Creating another method with a return type, the above method has a return type of void which means nothing
    public static int printPlusFive(int num){
        return num + 5;
    }
}
