package com.company;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> Q1 = new ArrayDeque<>();
        Deque<Integer> Q2 = new ArrayDeque<>();

        Scanner nums = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            Q1.add(nums.nextInt());
        }

        for (int i = 0; i < 5; i++)
        {
            Q2.add(nums.nextInt());
        }

        Game CardGame = new Game();
        CardGame.GetMaxMin(Q1,Q2);
    }
}