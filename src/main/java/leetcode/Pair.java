package leetcode;

import java.util.Objects;

public class Pair<Left,Right> {

    private final Left left;
    private final Right right;

    public Pair(Left left,Right right){
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(left, pair.left) && Objects.equals(right, pair.right);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    public Left getLeft() {
        return left;
    }

    public Right getRight() {
        return right;
    }
}
