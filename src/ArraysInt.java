import java.util.Arrays;

public class ArraysInt
{
    public static void main(String[] args)
    {
        //Create an array of integers
        int[] array = {5, 10, 15, 25};

        //Calculate the sum of all elements in the array
        int sum = 0;
        int i;

        for(i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        System.out.print("The sum is:" + sum);

        // Find the maximum and minimum values in the array
        int max = array[0];
        int min = array[0];
        for (int j = 1; j < array.length; j++)
        {
            if (array[j] > max)
            {
                max = array[j];
            }
            if (array[j] < min)
            {
                min = array[j];
            }
        }
        System.out.println("Maximum value is:" + max);
        System.out.println("Minimum value is:" + min);

        // Sort the array in ascending order
        Arrays.sort(array);
        System.out.println("Sorted array in ascending order:" + Arrays.toString(array));
    }
}