package com.cg.student;

public class Student implements MarkList {
	//public MarkList marklist;
	public int noOfSub=2;
	
//	public Student(MarkList marklist)
//	{
//		
//		this.marklist = marklist;
//	}

	public int mark(int i,int j)
	{
		return (i+j)/noOfSub;
		
//		Integer e =  marklist.mark(i, j);
//		return e;
	}

}
