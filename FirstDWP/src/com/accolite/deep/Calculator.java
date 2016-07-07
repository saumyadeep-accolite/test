/****************************************************************************
* Copyright (c) 2016 by Accolite.com. All rights reserved
*
* Created date :: Jul 7, 2016
*
*  @author :: Saumyadeep Tarafdar
* ***************************************************************************
*/
package com.accolite.deep;

public interface Calculator {
	
	public Integer add(Integer a,Integer b);
	public Integer sub(Integer a,Integer b);
	public Long    mul(Integer a,Integer b);
	public Integer div(Integer a,Integer b) throws ArithmeticException;
	
}
