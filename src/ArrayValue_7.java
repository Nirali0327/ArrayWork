public class ArrayValue_7 {

    public static void main(String[] args) {
        int[] a = {10, 20, 6, 50, 8};
        int max = a[0]; // declaring number ten a zero index as a max value
        int min = a[0]; // declaring number ten a zero index as a min value
        for (int i = 1; i < a.length; i++){// to find out max value  from array we need forloop
            if (max < a[i]) {
                max = a[i];
            }
        }
        for (int i = 1; i < a.length; i++) {   // to find out max value  from array we need forloop
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Maximum element of Array " + max);
        System.out.println("Minimum element of Array " + min);
    }
}
