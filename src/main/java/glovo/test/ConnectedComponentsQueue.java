package glovo.test;

import java.util.*;

/**
 * Non working version!!
 * The idea is to use a stack instead of recursion!!!
 */
public class ConnectedComponentsQueue {

    public static void main(String[] args) {

        int[][] A = new int[3][3];

        A[0][0] = 5; A[0][1] = 4; A[0][2] = 1;
        A[1][0] = 4; A[1][1] = 4; A[1][2] = 4;
        A[2][0] = 3; A[2][1] = 3; A[2][2] = 0;

        //////////////////////////////////////////////
//        A[0][0] = 5;
//        A[0][1] = 4;
//        A[0][2] = 4;
//        A[1][0] = 4;
//        A[1][1] = 3;
//        A[1][2] = 4;
//        A[2][0] = 3;
//        A[2][1] = 2;
//        A[2][2] = 4;
//        A[3][0] = 2;
//        A[3][1] = 2;
//        A[3][2] = 2;
//        A[4][0] = 3;
//        A[4][1] = 3;
//        A[4][2] = 4;
//        A[5][0] = 1;
//        A[5][1] = 4;
//        A[5][2] = 4;
//        A[6][0] = 4;
//        A[6][1] = 1;
//        A[6][2] = 1;

//        int[][] A = {{5, 4, 4}, {4, 3, 4}, {3, 2, 4}, {2, 2, 2}, {3, 3, 4}, {1, 4, 4}, {4, 1, 1}};
//        { [5, 4, 4], [4, 3, 4], [3, 2, 4], [2, 2, 2], [3, 3, 4], [1, 4, 4], [4, 1, 1]}

        int countries = getCountries(A);

        System.out.println("Countries: " + countries);

    }

    static class Point {
        int i;
        int j;
        int value;

        public Point(int i, int j, int value) {
            this.i = i;
            this.j = j;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return i == point.i &&
                    j == point.j &&
                    value == point.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j, value);
        }
    }

    private static int getCountries(int[][] A) {

        int countries = 0;
        int row = 0, col = 0;
        Point current;
        List<Point> visited = new ArrayList<Point>();
//        Stack<Point> stack = new Stack<Point>();
        Queue<Point> queue = new ArrayDeque<>();
        Point point = null;

         // Well traverse the matrix a row at a time
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {

                current = new Point(i, j, A[i][j]);
                // Only NON visited regions
                if (!visited.contains(current)) {

                    queue.add(current);
//                    visited.add(current);

                    // Deep first search, we add neighbours nodes,
                    while (!queue.isEmpty()) {
                        current = queue.poll();
                        visited.add(current);

                        row = current.i; col = current.j;
                        if (row > 0 && (A[row - 1][col] == current.value)
                                && !visited.contains(new Point(row - 1, col, A[row - 1][col]))) {
                            point = new Point(row - 1, col, A[row - 1][col]);
                            queue.add(point);
                        }
                        if (col > 0 && A[row][col - 1] == current.value
                                && !visited.contains(new Point(row, col - 1, A[row][col - 1]))) {
                            point = new Point(row, col - 1, A[row][col - 1]);
                            queue.add(point);
                        }
                        if (row < A.length-1 && (A[row + 1][col] == current.value)
                                && !visited.contains(new Point(row + 1, col, A[row + 1][col]))) {
                            point = new Point(row + 1, col, A[row + 1][col]);
                            queue.add(point);
                        }
                        if (col < A[row].length-1 && (A[row][col + 1] == current.value)
                                && !visited.contains(new Point(row, col + 1, A[row][col + 1]))) {
                            point = new Point(row, col + 1, A[row][col + 1]);
                            queue.add(point);
                        }
                    }
                    countries++;
                }
            }

        }

        return countries;
    }


}


