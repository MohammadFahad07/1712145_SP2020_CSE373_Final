package com.nsu.cse373.spring2020.ID1712145;

import java.io.*; 
import java.util.*; 

//  Reference -->> https://www.geeksforgeeks.org/minimum-cost-to-reach-the-top-of-the-floor-by-climbing-stairs/

public class SP2020_CSE373_Final_Q6_1712145
	{ 
	// function to find  
	// the minimum cost 
	// to reach N-th floor 
	static int minimumCost(int cost[],  
	                       int n) 
	{ 
	    // declare an array 
	    int dp[] = new int[n]; 
	  
	    // base case 
	    if (n == 1) 
	        return cost[0]; 
	  
	    // initially to  
	    // climb till 0-th 
	    // or 1th stair 
	    dp[0] = cost[0]; 
	    dp[1] = cost[1]; 
	  
	    // iterate for finding the cost 
	    for (int i = 2; i < n; i++) 
	    { 
	        dp[i] = Math.min(dp[i - 1],  
	                         dp[i - 2]) + cost[i]; 
	    } 
	  
	    // return the minimum 
	    return Math.min(dp[n - 2],  
	                    dp[n - 1]); 
	} 
	  
	// Driver Code 
	public static void main(String args[])  throws IOException
	{ 
		
		 System.out.println("Reading file: SP2020_CSE373_FinalQ6_1712145.txt");
		 FileReader fr=new FileReader("C:/Users/hp/eclipse-workspace/CSE373_Final/src/com/nsu/cse373/spring2020/ID1712145/SP2020_CSE373_FinalQ6_1712145.txt");    
         int i;    
         while((i=fr.read())!=-1)    
         System.out.print((char)i);    
         fr.close();  
         System.out.println("Converting it to formatted output using Java printf\nRock face map:");
         
		
	    /*int a[] = { 16, 19, 10, 12, 18 }; 
	    int n = a.length; 
	    System.out.print(minimumCost(a, n)); */
	} 
	}