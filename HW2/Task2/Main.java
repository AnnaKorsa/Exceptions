package HW2.Task2;

public class Main {
    public static void main(String[] args) {

        /*
        Если необходимо, исправьте данный код:
         */
        int[] intArray = new int[] {1,5,6,9,25,56,7,16,3};/* Добавлен массив*/
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
