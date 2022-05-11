// write a programme to enter array and sort the values in ascending order
public class AscendingArray_2 {
    public static void main(String[] args) {
        //Initialize array
        int [] a = new int [] {15, 22, 81, 79, 10};
        int value = 0;
        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        //Sort the array in ascending order
        for (int i = 0; i < a.length; i++) {
           for (int j = i+1; j < a.length; j++) {
                if(a[i] > a[j]) {
                   value = a[i];
                    a[i] = a[j];
                   a[j] = value;
                }
            }
        }
        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

