package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.company.Main.mySort;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

int[] a  = {5,2,4,6,1,3,2,6};
    @Test
    void test() {
        System.out.println(Arrays.toString(mySort(a, 0, a.length-1)));
    }
}