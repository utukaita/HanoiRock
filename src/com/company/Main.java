package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            System.out.println(hanoi(i, 1, 2, 3));
        }
    }
    public static int hanoi(int n, int from, int to, int intermediate){
        if (n==1)
            return 1;
        else
            return(hanoi(n-1, from, intermediate, to) + hanoi(1, from, to, intermediate) + hanoi(n-1, intermediate, to, from));

    }
}
