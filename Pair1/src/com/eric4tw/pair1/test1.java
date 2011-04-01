package com.eric4tw.pair1;


/**
 * *********************************************************************
 * <p/>
 * Copyright (c) 1999-2007 Ericsson AB, Sweden.
 * All rights reserved.
 * The Copyright to the computer program(s) herein is the property of
 * Ericsson AB, Sweden.
 * The program(s) may be used and/or copied with the written permission
 * from Ericsson AB or in accordance with the terms and conditions 
 * stipulated in the agreement/contract under which the program(s) 
 * have been supplied.
 * <p/>
 * ********************************************************************
 */

/**
 * public class test1{ } JOB = runs the test
 * 
 * @author ekhadhe
 * @date Mar 31, 2011
 */
public class test1
{
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
       Order aorder = new Order("Milk", 10.0, 2);
       System.out.println(aorder.getDescription());
    }
    
}
