package glovo.test;

/**
 * Version que funciona queda solo el codigo que necesito!
 */
public class Countries {

    //
    public static void main(String[] args) {

        int M[][] = new int[][]{
                {5, 5, 0, 0, 0},
                {0, 5, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {6, 0, 8, 0, 8}};

        int countries = getCountries(M);
        System.out.println("Number of countries: " + countries);

    }

    private static int getCountries(int M[][]) {
        // Make a bool array to mark visited cells. 
        // Initially all cells are unvisited 
        boolean visited[][] = new boolean[M.length][M[0].length];

        // Initialize count as 0 and travese through the all cells of given matrix
        int count = 0;
        for (int i = 0; i < M.length; ++i)
            for (int j = 0; j < M[0].length; ++j)
                if (!visited[i][j]) {
                    // visited yet, then new island found, Visit all 
                    // cells in this island and increment island count
                    // Deep first search for the non visited region!!
                    findNeighbours(M, i, j, visited);
                    ++count;
                }

        return count;
    }

    private static void findNeighbours(int M[][], int row, int col, boolean visited[][]) {

        // Mark this region as visited
        visited[row][col] = true;

        // We all only consider four neighbours
        int current = M[row][col];
        if (row > 0 && !visited[row - 1][col] && M[row - 1][col] == current)
            findNeighbours(M, row - 1, col, visited);
        if (col > 0 && !visited[row][col - 1] && M[row][col - 1] == current)
            findNeighbours(M, row, col - 1, visited);
        if (row < M.length - 1 && !visited[row + 1][col] && M[row + 1][col] == current)
            findNeighbours(M, row + 1, col, visited);
        if (col < M[row].length - 1 && !visited[row][col + 1] && M[row][col + 1] == current)
            findNeighbours(M, row, col + 1, visited);

    }

}