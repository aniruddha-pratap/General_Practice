package Strings;

import java.util.*;
public class TimeProblem {

	public static String maxTime(int[] intArr){
	    int first = -1;
	    int second = -1;
	    int third = -1;
	    int fourth = -1;
	    int ctr = 0;
	    String s = "";
	    for(int i=0;i<intArr.length-1;i++){
	    	if(intArr[i]<=intArr[i+1]){
	    		int temp=intArr[i];
	    		intArr[i] = intArr[i+1];
	    		intArr[i+1]=temp;
	    	}
	    }
	   	    
	    for(int i = 0;i<intArr.length;i++){
	    	if(intArr[i]>first && intArr[i]<=2){
	    		first = intArr[i];
	    		intArr[i]=-2;
	    		break;
	    	}
	    }
	    
	    for(int i = 0;i<intArr.length;i++){
	    	if(first == 2){
	    		if(intArr[i]>second && intArr[i]<=3){
		    		second = intArr[i];
		    		intArr[i]=-2;
		    		break;
	    		}else{
	    			ctr++;
	    		}
	    	}else{
	    		if(intArr[i]>second){
	    			second = intArr[i];
	    		}
	    	}
	    }
	    
	    if(ctr == 4){
	    	return "Invalid Number";
	    }
	    
	    ctr=0;
	    
	    for(int i = 0;i<intArr.length;i++){
	    	if(intArr[i]>third && intArr[i]<=5){
	    		third = intArr[i];
	    		intArr[i]=-2;
	    		break;
	    	}else{
	    		ctr++;
	    	}
	    }
	    
	    if(ctr == 4){
	    	return "Invalid Number";
	    }
	    
	    for(int i=0;i<intArr.length;i++){
	    	if(intArr[i] != -2){
	    		fourth = intArr[i];
	    	}
	    }
	    
	    System.out.println(intArr[0]);
	    System.out.println(intArr[1]);
	    System.out.println(intArr[2]);
	    System.out.println(intArr[3]);
	    	    
	    StringBuilder sb = new StringBuilder(5);
	    sb.append(first);
	    sb.append(second);
	    sb.append(':');
	    sb.append(third);
	    sb.append(fourth);

	    return sb.toString();
	}
	
	public static void main(String []args){
		int n []={1,9,9,2};
		System.out.println(TimeProblem.maxTime(n));
	}
}
