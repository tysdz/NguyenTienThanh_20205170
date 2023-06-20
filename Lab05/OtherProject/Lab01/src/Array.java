import java.util.Arrays;

public class Array {
    public static void main(String args[]) {
        int[] src = {1789, 2035, 1899, 1456, 2013};
        int k = 0;
        System.out.println("The array after sort:");
        Arrays.toString(src);
        Arrays.sort(src);

        System.out.println(Arrays.toString(src));
        for (int i=0; i<src.length ; i++){
            k = k + src[i];
        }
        float h = k / src.length;
        System.out.println("The sum of array is " + k);
        System.out.println("The average of array is " + h);
        }
    }
