package com.jd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test1(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("链接成功...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
