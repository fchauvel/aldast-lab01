/*
 * This file is part of NTNU's IDATA2302 Lab01.
 *
 * Copyright (C) NTNU 2022
 * All rights reserved.
 *
 */
package no.ntnu.idata2302.lab01.search;



import java.util.ArrayList;
import java.util.List;



public class MySearch implements Search {

    private List<String> entries;

    public MySearch(List<String> entries) {
        this.entries = new ArrayList<String>(entries);
    }


    @Override
    public List<String> run(String givenFragment) {
        // TO DO: Provide an implementation
        return new ArrayList<String>();
    }

}
