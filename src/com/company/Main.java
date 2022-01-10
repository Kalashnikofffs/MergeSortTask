package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here


    }

    public static int[] mySort(int[] a, int p, int r) {
        if (p < r) {
            int q = p + (r - p) / 2;
            ;
            mySort(a, p, q);
            mySort(a, q + 1, r);
            return merge(a, p, r, q);

        }
        return a;
    }

    private static int[] merge(int[] a, int p, int r, int q) {

        int n1 = q - p + 1;
        int n2 = r - q;

        int[] left = new int[n1];
        int[] right = new int[n2];


        for (int i = 0; i < n1; ++i) {
            left[i] = a[p + i];
        }
        for (int j = 0; j < n2; ++j) {
            right[j] = a[q + 1 + j];
        }


        int i = 0, j = 0;


        int k = p;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
        return a;
    }
}
