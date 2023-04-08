package com.company.google;

import java.util.*;

public class Solution {
    public static int solution(int src, int dest) {

        int count = 0;
        List<Axis> knightMoves = getKnightMoves();
        Axis sourceAxis = getCoordination(src);

        int node = src;

        Set<Axis> nodes = new HashSet<>();
        Set<Axis> visited = new HashSet<>();
        nodes.add(sourceAxis);
        while (dest != node) {
            count = count + 1;
            Set<Axis> newLayered = new HashSet<>();
            for (Axis axisValue : nodes) {
                visited.add(axisValue);
                for (Axis axis : knightMoves) {
                    Axis newAxis = new Axis();
                    newAxis.setX(axisValue.getX() + axis.getX());
                    newAxis.setY(axisValue.getY() + axis.getY());
                    if (newAxis.getX() > 7 || newAxis.getX() < 0 || newAxis.getY() > 7 || newAxis.getY() < 0)
                        continue;
                    node = getValue(newAxis);
                    if (dest == node)
                        break;
                    else if (node >= 0 && node <= 63) {
                        newLayered.add(newAxis);
                    }
                }
            }
            nodes = newLayered;
            nodes.removeAll(visited);
        }


        return count;    }

    private static List<Axis> getKnightMoves() {
        List<Axis> knightMoves = new ArrayList<>();
        // All possible moves of a knight
        int X[] = {1, 2, -1, -2};
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X.length; j++) {
                if ((X[i] + X[j]) % 2 != 0) {
                    Axis axis = new Axis();
                    axis.setX(X[i]);
                    axis.setY(X[j]);
                    knightMoves.add(axis);
                }
            }
        }
        return knightMoves;
    }

    private static Axis getCoordination(Integer value) {
        int x = value % 8;
        int y = value / 8;
        Axis axis = new Axis();
        axis.setX(x);
        axis.setY(y);
        return axis;
    }

    private static int getValue(Axis axis) {
        return (axis.getY() * 8) + (axis.getX());
    }


    static class Axis {

        Integer x;
        Integer y;
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Axis axis = (Axis) o;
            return Objects.equals(x, axis.x) && Objects.equals(y, axis.y);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        public void setX(Integer x) {
            this.x = x;
        }

        public void setY(Integer y) {
            this.y = y;
        }

        public Integer getX() {
            return x;
        }

        public Integer getY() {
            return y;
        }
    }

}