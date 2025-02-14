package exceptions.nested_try_catch_block;

public class DivideArrayElement {

    public static int divideElementOnIndex(int[] arr, int divisor, int index) throws ArrayIndexOutOfBoundsException{
        if(index > (arr.length - 1)){
            throw new ArrayIndexOutOfBoundsException();
        }
        try{
            int answer = arr[index] / divisor;
            System.out.println("Your answer is: "+ answer);
            return answer;
        }catch (ArithmeticException e){

            throw new ArithmeticException();
        }
    }
}
