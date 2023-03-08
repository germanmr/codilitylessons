package leetcode;

public class NumberOfIslands {
    class Solution {

        public int numIslands(char[][] grid) {

            boolean[][] visited = new boolean[grid.length][grid[0].length];

            int numberOfIslands = 0;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    boolean islandFound = visitNode(grid, visited, i, j);
                    if (islandFound) {
                        numberOfIslands++;
                    }
                }
            }

            return numberOfIslands;
        }

        public boolean visitNode(char[][] grid, boolean[][] visited, int i, int j) {
            if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] || grid[i][j] == '0') {
                return false;
            }
            visited[i][j] = true; // marking this cell as visited
            // move in all four directions
            visitNode(grid, visited, i - 1, j); // up
            visitNode(grid, visited, i, j + 1); // rigth
            visitNode(grid, visited, i + 1, j); // down
            visitNode(grid, visited, i, j - 1); // left
            return true;
        }
    }

}