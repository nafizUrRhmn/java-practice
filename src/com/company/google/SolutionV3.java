package com.company.google;

public class SolutionV3 {

    public static void main(String args[]) {
        System.out.println(solution(7, 31));
    }

    public static int solution(int src, int dest) {
        int sourceX = getX(src);
        int sourceY = getY(src);
        int destinationX = getX(dest);
        int destinationY = getY(dest);
        int x = sourceX;
        int y = sourceY;
        int count = 0;
        System.out.println("Count : "+ count + " (x,y): (" + x+ "," + y+")");

        while (destinationX != x || destinationY != y) {
            count++;
            int xDeviation = destinationX - x;
            int yDeviation = destinationY - y;

            int fixValue = fixedValue(x, y, xDeviation, yDeviation, destinationX, destinationY, count);
            if (fixValue > 0) {
                count = fixValue;
                break;
            }
            if (Math.abs(xDeviation) >= Math.abs(yDeviation)) {
                int tempX = x + (2 * (xDeviation == 0 ? 1 : (xDeviation / Math.abs(xDeviation))));
                if (tempX == destinationX) {
                    int supTemp = x + (2 * (xDeviation > 0 ? -1 : 1));
                    x = (supTemp>=0 && supTemp<=7) ? supTemp : tempX ;
                } else {
                    x = tempX;
                }
                int tempY = y + (1 * (yDeviation == 0 ? 1 : (yDeviation / Math.abs(yDeviation))));
                if (tempY == destinationY) {
                    int supTemp = y + (1 * (yDeviation > 0 ? -1 : 1));
                    y = (supTemp>=0 && supTemp<=7) ? supTemp : tempY ;
                } else {
                    y = tempY;
                }
            } else {
                int tempX = x + (1 * (xDeviation == 0 ? 1 : (xDeviation / Math.abs(xDeviation))));
                if (tempX == destinationX) {
                    int supTemp = x + (1 * (xDeviation > 0 ? -1 : 1));
                    x = (supTemp>=0 && supTemp<=7) ? supTemp : tempX ;
                } else {
                    x = tempX;
                }
                int tempY = y + (2 * (yDeviation == 0 ? 1 : (yDeviation / Math.abs(yDeviation))));
                if (tempY == destinationY) {
                    int supTemp = y + (2 * yDeviation > 0 ? -1 : 1);
                    y = (supTemp>=0 && supTemp<=7) ? supTemp : tempY ;
                } else {
                    y = tempY;
                }
            }
            System.out.println("Count : "+ count + " (x,y): (" + x+ "," + y+")");
        }
        System.out.println("Count : "+ count + " (x,y): (" + destinationX+ "," + destinationY+")");

        return count;
    }

    private static int getX(int value) {
        return value % 8;
    }

    private static int getY(int value) {
        return value / 8;
    }

    private static int fixedValue(int x, int y, int xDeviation, int yDeviation, int destinationX,
                                  int destinationY, int count) {
        if ((Math.abs(xDeviation) == 1 && Math.abs(yDeviation) == 2) ||
                (Math.abs(xDeviation) == 2 && Math.abs(yDeviation) == 1)) {
            x = x + xDeviation;
            y = y + yDeviation;
            return count;
        } else if ((Math.abs(xDeviation) == 2 && Math.abs(yDeviation) == 0) ||
                (Math.abs(xDeviation) == 0 && Math.abs(yDeviation) == 2)) {
            count = count + 1;
            System.out.println("Count : "+ count + " (x,y): (" + x+ "," + y+")");
            return count;
        } else if (((x != 0 && y != 0) && (x != 7 && y != 7)) && (destinationX != 0 && destinationY != 0)
                && (destinationX != 7 && destinationY != 7) && (Math.abs(xDeviation) == Math.abs(1)
                && Math.abs(yDeviation) == Math.abs(1))
        ) {
            count = count + 1;
            System.out.println("Count : "+ count + " (x,y): (" + x+ "," + y+")");
            return count;
        } else if ((Math.abs(xDeviation) == 1 && Math.abs(yDeviation) == 0) ||
                (Math.abs(xDeviation) == 0 && Math.abs(yDeviation) == 1)) {
            count = count + 2;
            System.out.println("Count : "+ count + " (x,y): (" + x+ "," + y+")");
            return count;
        }
        else if ((Math.abs(xDeviation) == 3 && Math.abs(yDeviation) == 0) ||
                (Math.abs(xDeviation) == 0 && Math.abs(yDeviation) == 3)) {
            count = count + 2;
            System.out.println("Count : "+ count + " (x,y): (" + x+ "," + y+")");
            return count;
        }else if ((Math.abs(xDeviation) == 5 && Math.abs(yDeviation) == 0) ||
                (Math.abs(xDeviation) == 0 && Math.abs(yDeviation) == 5)) {
            count = count + 2;
            System.out.println("Count : "+ count + " (x,y): (" + x+ "," + y+")");
            return count;
        }

        else if ((Math.abs(xDeviation) == 2 && Math.abs(yDeviation) == 2)
        ) {
            if(count ==1)
            count = count + 3;
            else count = count+1;
            System.out.println("Count : "+ count + " (x,y): (" + x+ "," + y+")");
            return count;
        }
        return -1;
    }
}
