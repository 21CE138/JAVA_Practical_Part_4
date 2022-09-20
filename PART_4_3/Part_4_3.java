package PART_4_3;

public class Part_4_3 {
    public static void main(String[] args) {


        // ArithmeticException
        try  {
            int a = 138 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("ArithmeticException");
        }
        // ArrayIndexOutOfBoundsException
        int[] arr = {1, 4, 32, 4,7,9,10};
        try
        {
            System.out.println(arr[16]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        System.out.println("This program is created by 21CE138 Yuvrajsinh Solanki");
    }
}
