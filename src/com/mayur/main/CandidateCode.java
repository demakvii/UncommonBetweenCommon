package com.mayur.main;

import java.io.IOException;
import java.util.Scanner;

public class CandidateCode {

	 @SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        String output;
	        int ip1_size = 0;
	        ip1_size = Integer.parseInt(in.nextLine().trim());
	        int[] ip1 = new int[ip1_size];
	        int ip1_item;
	        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
	            ip1_item = Integer.parseInt(in.nextLine().trim());
	            ip1[ip1_i] = ip1_item;
	        }
	        int ip2_size = 0;
	        ip2_size = Integer.parseInt(in.nextLine().trim());
	        int[] ip2 = new int[ip2_size];
	        int ip2_item;
	        for(int ip2_i = 0; ip2_i < ip2_size; ip2_i++) {
	            ip2_item = Integer.parseInt(in.nextLine().trim());
	            ip2[ip2_i] = ip2_item;
	        }
	        output = uncommonBetweenCommon(ip1,ip2);
	        System.out.println(String.valueOf(output));
	    }
	 
	 public static String uncommonBetweenCommon(int[] input1,int[] input2)
	    {
		 String commonInInputOne =  commonFromOnListToOther(input1, input2);
		 String commonInInputTwo =  commonFromOnListToOther(input2, input1);
		 String finalResult = commonInInputOne+commonInInputTwo;
		 finalResult =  finalResult.substring(0, finalResult.length()-1);
		 return finalResult;
		 
	    }

	 public static String commonFromOnListToOther(int[] input1,int[] input2){
		 String result = "";
		 for(int i = 0 ; i< input1.length ; i++ ) {
			 int count = 0;
			 for(int j = 0; j < input2.length ; j++){
				 if( input1[i] == input2[j] ) {
					 count++;
				 }
				
			 }
			 
			 if(count<1){
				result = result + input1[i] + "$"; 
			 }
		 }
		 return result;
	 }
}
