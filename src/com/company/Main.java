package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	    Scanner in = new Scanner(new File("input10.txt"));
        String firstLine = in.nextLine();
        int n = Integer.parseInt(firstLine.split(" ")[0]);
        int k = Integer.parseInt(firstLine.split(" ")[1]);
        List <Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(in.next()));
        }
        System.out.println(pairs(k, arr));
    }

    public static int pairs(int k, List<Integer> arr) {
        Collections.sort(arr);
        int i, j, count = 0;
        for (i = arr.size() - 1; i >= 0; i--) {
            for (j = i - 1; j >= 0; j--) {
                if (arr.get(i) - arr.get(j) > k) {
                    break;
                } else if (arr.get(i) - arr.get(j) == k) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
