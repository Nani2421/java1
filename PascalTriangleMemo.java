import java.util.HashMap;
import java.util.Map;

public class PascalTriangleMemo
{
    public static void printPas(int rows)
    {
        Map<String, Integer> cache= new HashMap<>();

        for (int row = 0; row < rows; row++)
        {
            for (int col = 0; col <= row; col++)
            {
                int value = calcPas(row, col, cache);
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int calcPas(int row, int col, Map<String, Integer> cache)
    {
        String key = row + "_" + col;

        if (col == 0 || col == row)
        {
            return 1;
        }

        if (cache.containsKey(key))
        {
            return cache.get(key);
        }

        int value = calcPas(row - 1, col - 1, cache) + calcPas(row - 1, col,cache);
        cache.put(key, value);

        return value;
    }

    public static void main(String[] args)
    {
        int rows = 5;
        printPas(rows);
    }
}