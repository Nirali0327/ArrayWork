// write a programme to test the equality of two int arrays
public class EqualityArray_1 {
    public static  void  equalityCheck(int[] array1, int[] array2)
    {
        boolean  equalOrNot = true;
        if(array1.length == array2.length)
        {
            for (int i  = 0; i < array1.length; i++)
            {
                if(array1[i] != array2[i])
                {
                    equalOrNot = false;}
            }
        }
        if  (equalOrNot) {
            System.out.println( " Array1 and Array2 are equal.");
        } else
        {
            System.out.println( " Array1 and Array2  are not equal.");
        }
    }

    public static void  main(String[] args)
    {
        int[] array1 =  {22, 15, 16, 8, 11};
        int[] array2 =  {22, 5, 16, 8, 11};

        equalityCheck(array1,  array2);

    }
}





















