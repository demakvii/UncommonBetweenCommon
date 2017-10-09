package com.mayur.main;

import java.io.IOException;
import java.util.Scanner;

public class CandidateCode1 {

	  public static int nochange_bits(String input1,int input2,int input3)
	    {
		    //Write code here
		
		  if(input2==0||input3==0)
			  return -1;
		  String doubleFlipBitResult = returnFlipBit(returnFlipBit(input1,input2),input3);
		 
		  return returnChangeBitCount(input1,doubleFlipBitResult);
	    }
	  public static String returnFlipBit(String input1,int inputCharNValueIdx){
		  String result = "";
		  char getIntAtIdx = input1.charAt(inputCharNValueIdx);
		  for(int i  = 0 ;i< inputCharNValueIdx;i++){
			  if(input1.charAt(i)==getIntAtIdx){
				  if(input1.charAt(i)=='1')
					  result = result + "0";
				  else
					  result = result + "1";
			  }
			  else
				  result =  result +  input1.charAt(i);
			 }
		  result =  result + input1.substring(inputCharNValueIdx);
		  return result;
	  }
	  public static int returnChangeBitCount(String input,String result){
		  int counter=0;
		  for(int i =0; i< input.length();i++){
			  if(input.charAt(i)==result.charAt(i))
				  counter++;
		  }
		  
		  return counter;
	  }
	  
	  public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        int output = 0;
	        String ip1 = in.nextLine().trim();
	        int ip2 = Integer.parseInt(in.nextLine().trim());
	        int ip3 = Integer.parseInt(in.nextLine().trim());
	        output = nochange_bits(ip1,ip2,ip3);
	        System.out.println(String.valueOf(output));
	    }
}
