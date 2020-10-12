package com.company;

import java.util.Collections;
import java.util.Deque;

public class Game {
    private int counter = 0;
    private int minD1, minD2, min;
    private int maxD1, maxD2, max;

    public void GetMaxMin(Deque<Integer> D1, Deque<Integer> D2)
    {
        minD1 = Collections.min(D1);
        minD2 = Collections.min(D2);
        maxD1 = Collections.max(D1);
        maxD2 = Collections.max(D2);

        if(minD1 < minD2)
        {
            min = minD1;
        }
        else if(minD2 < minD1)
        {
            min = minD2;
        }

        if(maxD1 > maxD2)
        {
            max = maxD1;
        }
        else if (maxD2 > maxD1)
        {
            max = maxD2;
        }

        TheGame(D1, D2);
    }

    public int TheGame(Deque<Integer> D1, Deque<Integer> D2)
    {
        if(D1.isEmpty()) {
            System.out.println("second " + counter);
            return 0;
        }
        else if(D2.isEmpty()) {
            System.out.println("first " + counter);
            return 0;
        }

        if(D1.getLast() > D2.getLast() && (D1.getLast() != max || D2.getLast() != min))
        {
            D1.addFirst(D2.getLast());
            D1.addFirst(D1.getLast());
            D1.removeLast();
            D2.removeLast();
            if(counter != 106) {
                counter++;
                TheGame(D1,D2);
            }
            else
            {
                System.out.println(counter);
                return 0;
            }
        }
        else if(D1.getLast() > D2.getLast() && D1.getLast() == max && D2.getLast() == min)
        {
            D2.addFirst(D1.getLast());
            D2.addFirst(D2.getLast());
            D2.removeLast();
            D1.removeLast();
            if(counter != 106) {
                counter++;
                TheGame(D1,D2);
            }
            else
            {
                System.out.println(counter);
                return 0;
            }
        }

        else if(D2.getLast() > D1.getLast() && (D2.getLast() != max || D1.getLast() != min))
        {
            D2.addFirst(D1.getLast());
            D2.addFirst(D1.getLast());
            D2.removeLast();
            D1.removeLast();
            if(counter != 106) {
                counter++;
                TheGame(D1,D2);
            }
            else
            {
                System.out.println(counter);
                return 0;
            }
        }

        else if(D2.getLast() > D1.getLast() && D2.getLast() == max && D1.getLast() == min)
        {
            D1.addFirst(D2.getLast());
            D1.addFirst(D1.getLast());
            D1.removeLast();
            D2.removeLast();
            if(counter != 106) {
                counter++;
                TheGame(D1,D2);
            }
            else
            {
                System.out.println(counter);
                return 0;
            }
        }

        return 0;
    }
}