package com.cg.student.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.cg.student.MarkList;
import com.cg.student.Student;

class StudentTestCase {

MarkList marklist=mock(MarkList.class);
	
	Student stud;
	
	@BeforeEach
	 public void SetUp()
	 {
		stud = new Student();
	 }
	
	@Test
	@DisplayName("Average")
	public void testAverage()
	{
		int expected = 75;
		when(marklist.mark(Mockito.anyInt(),Mockito.anyInt())).thenReturn(expected);
		int actual=marklist.mark(Mockito.anyInt(),Mockito.anyInt());
		assertEquals(expected,actual);
		verify(marklist).mark(Mockito.anyInt(),Mockito.anyInt());
	 
	}
	
	@Test
	@DisplayName("Main")
	public void testAvg()
	{
		  int expected = 75;
		  int actual=stud.mark(75, 75);
		  //when(marklist.mark(75,75)).thenReturn(expected);
		  assertEquals(expected,actual);
		  //verify(marklist).mark(75,75);
	}

}
