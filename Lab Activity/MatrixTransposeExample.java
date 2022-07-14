/*
 * author rahul prasad
 */
package com.example1;
public class MatrixTransposeExample
{  
		public static void main(String args[]){  
		//creating a matrix  
		int og[][]={{7,4,0},{6,4,3},{1,3,7}};    
		    
		//creating another matrix to store transpose of a matrix  
		int transpose[][]=new int[3][3];  //3 rows and 3 columns  
		    
		// transpose a matrix  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		transpose[i][j]=og[j][i];  
		}    
		}    
		  
		System.out.println("Printing Matrix without transpose:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(og[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
		System.out.println("Printing Matrix After Transpose:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(transpose[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
		}}

