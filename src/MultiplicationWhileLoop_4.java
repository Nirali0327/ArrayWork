// printing multiplication table using do while loop
public class MultiplicationWhileLoop_4 {
    public static void main(String[] args)
    {
        int[][] arrMultipleTable = new int[3][3];
        int row = 1, column = 1;
        for(int a = 0; a < arrMultipleTable.length; a++)
        {
            for(int b = 0; b < arrMultipleTable[a].length; b++)
            {
                arrMultipleTable[a][b] = row * column;
                column = column + 1;
            }
            row = row + 1;
            column = 1;
        }
        for(int a = 0; a < arrMultipleTable.length; a++)
        {
            for(int b = 0; b < arrMultipleTable[a].length; b++)
            {
                System.out.print(" " + arrMultipleTable[a][b] + "\t| ");
            }
            System.out.print("\n");
        }
    }
}


