/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalendarDatePackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author grant
 */
public class CalendarDateTest {
    
    CalendarDate fauxLeapYearDate;
    CalendarDate leapYearDate;
    CalendarDate startOfYearDate;
    CalendarDate startOfMonthDate;
    CalendarDate endOfYearDate;
    CalendarDate endOfMonthDate;
    CalendarDate tomorrowDate;
    CalendarDate yesterdayDate;
    CalendarDate testDate;
    CalendarDate lastWeekDate;
    CalendarDate nextWeekDate;
    
    
    public CalendarDateTest() {
        setUp();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        // note format of CalendarDate is:     day  month year
         testDate            = new CalendarDate( 18,  4, 2017 );  // Today
         yesterdayDate       = new CalendarDate( 17,  4, 2017 );  // March 26, 2014
         tomorrowDate        = new CalendarDate( 19,  4, 2017 );  // April 19, 2017
         endOfMonthDate      = new CalendarDate( 30,  4, 2013 );  // April 30, 2013
         endOfYearDate       = new CalendarDate( 31, 12, 2012 );  // December 31, 2012
         startOfMonthDate    = new CalendarDate(  1,  9, 2013 );  // September 1, 2013
         startOfYearDate     = new CalendarDate(  1,  1, 2013 );  // January 1, 2013
         leapYearDate        = new CalendarDate( 29,  2, 2012 );  // February 29, 2012
         fauxLeapYearDate    = new CalendarDate( 28,  2, 1900 );  // February 28, 1900
         lastWeekDate        = new CalendarDate( 11,  4, 2017 );  // April 11, 2017
         nextWeekDate        = new CalendarDate( 25,  4, 2017 );  // April 11, 2017
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void CalendarDate(){
        System.out.println("Today");
        CalendarDate instance = new CalendarDate();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals( "today", instance, testDate ); 
    }
    
    /**
     * Test of tomorrow method, of class CalendarDate.
     */
    @Test
    public void testTomorrow() {
        System.out.println("tomorrow");
        CalendarDate instance = new CalendarDate();
        instance.tomorrow();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals( "tomorrow", instance, tomorrowDate );
        //fail("The test case is a prototype.");
    }

    /**
     * Test of yesterday method, of class CalendarDate.
     */
    @Test
    public void testYesterday() {
        System.out.println("yesterday");
        CalendarDate instance = new CalendarDate();
        instance.yesterday();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals( "yesterday", instance, yesterdayDate );
    }

    /**
     * Test of lastWeek method, of class CalendarDate.
     */
    @Test
    public void testLastWeek() {
        System.out.println("lastWeek");
        CalendarDate instance = new CalendarDate();
        instance.lastWeek();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals( "last week", instance, lastWeekDate);
    }

    /**
     * Test of nextWeek method, of class CalendarDate.
     */
    @Test
    public void testNextWeek() {
        System.out.println("nextWeek");
        CalendarDate instance = new CalendarDate();
        instance.nextWeek();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals( "next week", instance, nextWeekDate);
    }

    /**
     * Test of isWeekend method, of class CalendarDate.
     */
    @Test
    public void testIsWeekend() {
        System.out.println("isWeekend");
        CalendarDate instance = new CalendarDate();
        boolean expResult = false;
        boolean result = instance.isWeekend();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDayOfWeek method, of class CalendarDate.
     */
    @Test
    public void testGetDayOfWeek() {
        System.out.println("getDayOfWeek");
        CalendarDate instance = new CalendarDate();
        String expResult = "Tuesday";
        String result = instance.getDayOfWeek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
}
