// write a programme to enter any string and count total number of 'a' in that string
public class StringCount_3 {
    public static void main(String[] args)
    {
        int m = 0;
        String St = "I want to learn automation";
        char letter = 'a';
        for (int i = 0; i < St.length(); i++)
        {
            if (St.charAt(i) == letter) // ---- inbuilt St.charAt(i) method to count character in string'.
                m++;
        }

        System.out.println("Total number of "+letter+ " is " + m + "  in String  " + St);
    }
}


