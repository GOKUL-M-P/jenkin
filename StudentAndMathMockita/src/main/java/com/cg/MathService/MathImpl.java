package com.cg.MathService;

public class MathImpl implements MathCalc 
{

	public long doubleLong(long num) {
		// TODO Auto-generated method stub
		return 2*num;
	}

	public long tripleLong(long num) {
		// TODO Auto-generated method stub
		return 3*num;
	}

	public long addition(long... nums) {
		int sum = 0;
        for (long a : nums) sum += a;
        return sum;
	}

	

}
