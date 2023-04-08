package com.company.google;


public class MnmSlice {
    public static void main(String args[]) {

        System.out.println("count: " + MnmSlice.solution("abccbaabccba"));
    }

    public static int solution(String x) {
        int count = 1;
        for (int i = 0; i <= (x.length()); i++) {

            char[] firstSliceChar = new char[i];
            x.getChars(0, i, firstSliceChar, 0);

            char[] secondSliceChar = new char[i];
            int j = i;
            int k = i + i;
            x.getChars(j, k, secondSliceChar, 0);

            String firstSlice = new String(firstSliceChar);
            String secondSlice = new String(secondSliceChar);
            if (firstSlice.length() > 0 && firstSlice.equals(secondSlice)) {
                int countTemp = 0, index = 0;
                while ((index = x.indexOf(firstSlice, index)) != -1) {
                    countTemp++;
                    index++;
                }
                if (firstSliceChar.length * countTemp == x.length()) {
                    count = countTemp;
                }
            }
            if (k == x.length() || k == x.length() - 1)
                break;
        }
        return count;
    }
    }