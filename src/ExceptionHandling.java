public class ExceptionHandling {

    public static void main(String[] args){
        //This is an example to illustrate exception handling, it is used to control errors and also
        //to display meaningful error messages: we can also have multiple try and catches, example using an array
        int[] nums = {1,2,3,4}; //Elements of the array nums

        try{
//            int numerator = 10;
//            int denominator = 0;
//            System.out.println(numerator / denominator);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e) {
        System.out.println("This operation is not possible, can not divide a number by zero");
        }
        catch(IndexOutOfBoundsException e){
            System.out.print("The array contains only 4 elements")
;        }
        catch(Exception e){
            System.out.println("Sorry and unexpected error occured");
        }
        finally{
            System.out.println("This is always printed");
        }
    }
}
