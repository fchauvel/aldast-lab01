/*
 * This file is part of NTNU's IDATA2302 Lab01.
 *
 * Copyright (C) NTNU 2022
 * All rights reserved.
 *
 */
package no.ntnu.idata2302.lab01.search;



import java.util.List;



public interface Search {

    public abstract List<String> run(String givenFragment);

}
