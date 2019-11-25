package com.pavan;

import com.pavan.addition.Addition;
import com.pavan.subtraction.Subtraction;
import com.pavan.multi.Multi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Addition adt=new  Addition();
    int result=adt.addinter(10, 20);
    System.out.println("addtion of two number are:"+result);
    
     
	Subtraction sb= new Subtraction();
	  int resutl2=sb.sub(20,10);
		
		System.out.println("subtraction of two number are:"+resutl2);
	
	
		
		int result3=Multi.multiplay(10,20);
		System.out.println("multipication of two numbers are:"+result3);
}
}
