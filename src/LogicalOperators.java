public class LogicalOperators {

    public static void main(String [] args){
        int x, y;
        x = 5;
        y = 8;
        boolean isEqual = x == y;
        boolean isNotEqual = x > y;
        boolean bothPositive = x > 0 && y > 0;
        System.out.println(isEqual);
        System.out.println(bothPositive);
        //OR->|| &&->AND
        //the boolean type returns either true or false
        //Comparing strings
        String name = "Jack";
        boolean isName = name.equals("John");
        System.out.println(isName);

    }
}
