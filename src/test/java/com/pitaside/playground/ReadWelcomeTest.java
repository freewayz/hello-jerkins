package com.pitaside.playground;

import org.junit.Assert;
import org.junit.Test;



public class ReadWelcomeTest{
    @Test
    public void testWelcomeMessage(){
        final ReadWelcome welcomeReader = new ReadWelcomeImpl();
        final String realMessage = welcomeReader.getWelcomeMessage();
        
        final String expectedMessage = "Jerkin testing is working" ;
        
        Assert.assertEquals("Get text from implementations ", expectedMessage, realMessage);
    }
    
}