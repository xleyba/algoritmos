package net.javier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] intArray = new int[] {4,14,1,17,8, 33, 3};

        int[] result = MyRoutines.quickSort(intArray, 0, 6);

        System.out.println("Resultado: " + MyRoutines.array2String(result));
    }
}
