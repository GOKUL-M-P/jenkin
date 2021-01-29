package com.cg.math.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.cg.MathService.MathCalc;
import com.cg.MathService.MathImpl;



class MathTestCase {

	 @Mock
	    MathCalc mathService;
	
	
	 
	    @InjectMocks
	    MathImpl mathServiceImpl = new MathImpl();
	 
		
	    @BeforeEach
	    public void setup() {
	    	MockitoAnnotations.initMocks(this);
	    }
	
	  
	    @Test
	    public void test_doubleLong_Pass() {
	        long expected = 20;
	        Mockito.when(mathService.doubleLong(Mockito.anyLong())).thenReturn(expected);
	 
	        long actual = mathService.doubleLong(Mockito.anyLong());
	        assertEquals(expected, actual);
	    }
	 
	    @Test
	    public void test_doubleLong_Inject() {
	        long expected = 20;
	        //this method is actually called
	        long actual = mathServiceImpl.doubleLong(10);
	 
	        assertEquals(expected, actual);
	    }


}
