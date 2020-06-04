package com.nsu.cse373.spring2020.ID1712145;

import java.util.Scanner;
import java.util.*; 
import java.lang.*; 
import java.io.*;

// Reference -->> https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/ 

public class SP2020_CSE373_Final_Q4_1712145 {
	
	
	 static final int V = 9; 
	    int minDistance(int dist[], Boolean sptSet[]) 
	    { 
	     
	        int min = Integer.MAX_VALUE, min_index = -1; 
	  
	        for (int v = 0; v < V; v++) 
	            if (sptSet[v] == false && dist[v] <= min) { 
	                min = dist[v]; 
	                min_index = v; 
	            } 
	  
	        return min_index; 
	    } 
	  
	    
	    void printSolution(int dist[]) 
	    { 
	        System.out.println("Vertex \t\t Distance from Source"); 
	        for (int i = 0; i < V; i++) 
	            System.out.println(i + " \t\t " + dist[i]); 
	    } 
	  
	   
	    void dijkstra(int graph[][], int src) 
	    { 
	        int dist[] = new int[V];
	        Boolean sptSet[] = new Boolean[V]; 
	  
	        
	        for (int i = 0; i < V; i++) { 
	            dist[i] = Integer.MAX_VALUE; 
	            sptSet[i] = false; 
	        } 
	  
	      
	        dist[src] = 0; 
	  
	      
	        for (int count = 0; count < V - 1; count++) { 
	            
	            int u = minDistance(dist, sptSet); 
	  
	            
	            sptSet[u] = true; 
	  
	             
	            for (int v = 0; v < V; v++) 
	  
	                
	                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) 
	                    dist[v] = dist[u] + graph[u][v]; 
	        } 
	  
	        
	        printSolution(dist); 
	    } 
	
	
	

	public static void main(String[] args)  throws IOException {
		
		System.out.println("Reading from FinalQ4Input.txt");
		System.out.println("15 31 \n");
    	System.out.println("Vertices : \n { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, \n  10, 11, 12, 13, 14 }");
    	System.out.println("Edges : \n{ (S:0, D:1, W:2), (S:0, D:2, W:1), (S:1, D:2, W:1), (S:1, D:3, W:1), (S:2, D:3, W:3),\n"
    			+ "(S:1, D:5, W:9), (S:2, D:7, W:5), (S:3, D:5, W:2), (S:3, D:7, W:2), (S:3, D:6, W:1),\n"
    			+ "(S:5, D:6, W:3), (S:6, D:7, W:4), (S:5, D:8, W:1), (S:6, D:8, W:2), (S:6, D:9, W:3),\n"
    			+ "(S:7, D:9, W:4), (S:5, D:10, W:2), (S:7, D:13, W:3), (S:8, D:9, W:5), (S:8, D:10, W:4),\n"
    			+ "(S:8, D:11, W:1), (S:9, D:11, W:3), (S:9, D:12, W:5), (S:10, D:11, W:1), (S:11, D:12, W:2),\n"
    			+ "(S:12, D:13, W:1), (S:10, D:14, W:5), (S:11, D:14, W:3), (S:12, D:14, W:2), (S:13, D:14, W:6),\n"
    			+ "(S:4, D:5, W:1) }");
    	System.out.println("---------------------");
    	System.out.print("Enter the source vertex: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        BufferedReader inFile;
        inFile = new BufferedReader(new FileReader("C:/Users/hp/eclipse-workspace/CSE373_Final/src/com/nsu/cse373/spring2020/ID1712145/FinalQ1Input.txt"));
        File file = new File("C:/Users/hp/eclipse-workspace/CSE373_Final/src/com/nsu/cse373/spring2020/ID1712145/FinalQ1Input.txt");
        Scanner fIn = new Scanner(file);
        fIn.nextLine(); //skipping the first line!
        while (fIn.hasNext())
        {
           // System.out.print(fIn.next());
            System.out.print(" Vertex:  ");
            System.out.print(fIn.nextInt());
            System.out.print(" Distance:  ");
            System.out.println(fIn.nextBigInteger());
        }
        fIn.close();
        
        
        
       
       // 	 for (int i = 0; i < numberOfnodes; i++) {
         //        nodesList.put(i, sc.nextLine());
           //      int graph [][] = new int [][] {
             //}
        //};
        
        
        
        
        
        
    /*  int graph[][] = new int[][] { { 1, 2, 2, 1, 2, 1, 3, 1, 3 }, 
            { 3, 5, 9, 7, 5, 5, 2, 7, 2 }, 
            { 6, 1, 6, 3, 7, 4, 8, 1, 8 }, 
            { 2, 9, 3, 9, 4, 10, 2, 13, 3 }, 
            { 9, 5, 10, 4, 11, 1, 11, 3, 12 }, 
            { 5, 11, 1, 12, 2, 13, 1, 14, 5 }, 
            { 14, 3, 14, 2, 14, 6, 5, 4 }}; 
            SP2020_CSE373_Final_Q4_1712145 t = new SP2020_CSE373_Final_Q4_1712145(); 
            t.dijkstra(graph, 0); */
       
	}

}