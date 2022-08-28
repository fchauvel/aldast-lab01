/*
 * This file is part of NTNU's IDATA2302 Lab01.
 *
 * Copyright (C) NTNU 2022
 * All rights reserved.
 *
 */
package no.ntnu.idata2302.lab01;


import java.util.ArrayList;
import java.util.List;


public class Pair {

    /**
     * Find all the pairs of natural numbers {x,y} such that x + y = n
     */
    public static List<Pair> findAllPairs(int n) {
        var pairs = new ArrayList<Pair>();
        // TODO: Implement this function
        return pairs;
    }

    private final int left;
    private final int right;

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Pair)) return false;
        var asPair = (Pair) other;
        return ((asPair.left == left &&  asPair.right == right)
                || (asPair.right == left && asPair.left == right));
    }

    @Override
    public int hashCode() {
        if (left < right) {
            return left + 17 * right;
        } else {
            return right + 17 * left;
        }
    }


}
