package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    class Solution {

        class Node {
            int i;
            int j;

            public Node(int i, int j) {
                this.i = i;
                this.j = j;
            }
        }

        public int numIslandsQueueSlowVersion(char[][] grid) {
            if (grid[0].length == 0) {
                return 0;
            }

            boolean[][] visited = new boolean[grid.length][grid[0].length];

            int numberOfIslands = 0;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (foundIsland(i, j, grid, visited)) {
                        numberOfIslands++;
                    }
                }
            }
            return numberOfIslands;
        }

        public boolean foundIsland(int i, int j, char[][] grid, boolean[][] visited) {
            Queue<Node> nodes = new LinkedList<Node>();
            boolean island = false;
            if (grid[i][j] == '0' || visited[i][j]) {
                return false;
            }
            island = true;
            nodes.add(new Node(i, j));
            visited[i][j] = true;
            while (!nodes.isEmpty()) {
                Node current = nodes.remove();
                if (canMove(current.i - 1, current.j, grid, visited)) { // up
                    island = true;
                    nodes.add(new Node(current.i - 1, current.j));
                }
                if (canMove(current.i, current.j + 1, grid, visited)) { // rigth
                    island = true;
                    nodes.add(new Node(current.i, current.j + 1));
                }
                if (canMove(current.i + 1, current.j, grid, visited)) { // down
                    island = true;
                    nodes.add(new Node(current.i + 1, current.j));
                }
                if (canMove(current.i, current.j - 1, grid, visited)) { // left
                    island = true;
                    nodes.add(new Node(current.i, current.j - 1));
                }
            }
            return island;
        }

        public boolean canMove(int i, int j, char[][] grid, boolean[][] visited) {
            if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0' || visited[i][j]) {
                return false;
            }
            visited[i][j] = true;
            return true;
        }


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