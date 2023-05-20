public class PascalTriangleRecur
{
    public static void printPas(int rows)
    {
        for (int row = 0; row < rows; row++)
        {
            for (int col = 0; col <= row; col++)
            {
                System.out.print(calcPas(row, col) + " ");
            }
            System.out.println();
        }
    }

    public static int calcPas(int row, int col)
    {
        if (col == 0 || col == row)
        {
            return 1;
        }
        else
        {
            return calcPas(row - 1, col - 1) + calcPas(row - 1, col);
        }
    }
    public static void main(String[] args)
    {
        int rows = 5;
        printPas(rows);
    }
}