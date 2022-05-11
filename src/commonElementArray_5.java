// write a programme to find the common elements between two arrays
public class commonElementArray_5 {
    public static void main(String[]args){

//Initialize array
        int [] arr = new int [] {10, 20, 30, 4, 20, 4, 8, 8, 3};
        System.out.println("common  elements in given array: ");
        //Searches for common  element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}








