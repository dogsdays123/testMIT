package com.test;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class codetest {
    public static void main(String[] args) {
//        test1 s = new test1();
//        System.out.println(s.test2(6, 4, 2, 5));
        t1 t = new t1();
        int[] m = {0, 1, 2, 3, 4, 5};
        int[] n = {4, 1, 2};
        System.out.println(Arrays.toString(t.t2(m, n)));
    }
}

class test1 {
    int test2(int... a) {
        int count;
        int answer = 0;
        int another;
        int dbs;
        int lower = 10;
        int[] coco = {10, 20};
        first:
        for (int i = 0; i < a.length; i++) {
            count = 0;
            another = 0;
            dbs = 0;
            lower = Math.min(a[i], lower);
            for (int j = 0; j < 4; j++) {
                if (a[i] == a[j]) {
                    count++;
                    dbs = j;
                } else {
                    another = a[j];
                }
            }
            switch (count) {
                case 4:
                    answer = 1111 * a[i];
                    break first;
                case 2:
                    for (int k = 0; k < 4; k++) {
                        if ((i == k) || (dbs == k)) {
                            continue;
                        } else {
                            if (coco[0] == 10) {
                                coco[0] = k;
                            } else {
                                coco[1] = k;
                            }
                        }
                    }
                    if (a[coco[0]] == a[coco[1]]) {
                        answer = (a[i] + a[coco[0]]) * Math.abs(a[i] - a[coco[0]]);
                    } else {
                        answer = a[coco[0]] * a[coco[1]];
                    }
                    break first;
                case 3:
                    answer = (10 * a[i] + another) * (10 * a[i] + another);
                    break first;
                default:
                    System.out.println("아이" + i + "카운트" + count);
                    if (i == 3 && count == 1) {answer = lower;}
                    break;
            }
        }
        return answer;
    }
}

class t1 {
    int[] t2(int[] arr, int[] query) {
        List<Integer> alist = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {alist.add(arr[i]);}
        for(int i = 0; i < query.length; i++) {
            if(i%2 == 0){
                alist.remove(arr[query[i] + 1]);
            }
            else{
                alist.remove(arr[query[i] - 1]);
            }
        }
        int[] answer = new int[alist.size()];
        for(int i = 0; i < alist.size(); i++) {
            answer[i] = alist.get(i);
        }
        return answer;
    }
}