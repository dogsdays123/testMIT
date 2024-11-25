package com.test;

import java.util.Arrays;
import java.util.Scanner;

import com.test.*;

import static java.lang.Integer.*;
import static java.lang.Math.random;
import static java.lang.System.out;

public class importtest {
    public static void main(String[] args) {
        int[] a = {10, 6, -6, 7, 5};
        int go1 = 5500;
        int go2 = 500;
        out.println(solution(go1, go2, a));
    }
    public static int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){

            if(i==0){total_usage = usage;}
            if(change[i] < 0){usage = total_usage * change[i] / 100;}
            else{usage = total_usage * change[i] / 100;}

            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}
