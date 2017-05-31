/**
 * 
 */
package com.saumac.hello;

/**
 * @author svyas013
 *
 */
public class Print100_Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTo100();

	}
	
	public static void printTo100(){
	    int[] array = new int[101];
	    try{
	    	System.out.println("EKDA OKDA"+array[1]);
	        printToArrayLimit(array, 1);
	    }catch(ArrayIndexOutOfBoundsException e){
	    }
	}
	public static void printToArrayLimit(int[] array, int index){
	    array[index] = array[index-1]+1;
	    System.out.println(array[index]);
	    printToArrayLimit(array, index+1);
	}

}
