public class PascalTriangle
{
    public static void main(String[] args)
    {
        int rows = 4;

        int[][] pas = new int[rows][];
        for (int i = 0; i < rows; i++)
        {
            pas[i] = new int[i + 1];
            pas[i][0] = 1;

            for (int j = 1; j < i; j++)
            {
                pas[i][j] = pas[i - 1][j - 1] + pas[i - 1][j];
            }

            pas[i][i] = 1;
        }

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(pas[i][j] + " ");
            }
            System.out.println();
        }
    }
}