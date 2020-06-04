package com.nsu.cse373.spring2020.ID1712145;

import java.io.*; 
import java.util.*; 


     // Ref --> https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
	  

	class SP2020_CSE373_Final_Q2_1712145 
	{ 
	    private int V;   // No. of vertices 
	  
	    // Array  of lists for Adjacency List Representation 
	    private LinkedList<Integer> adj[]; 
	  
	    // Constructor 
	    SP2020_CSE373_Final_Q2_1712145(int v) 
	    { 
	        V = v; 
	        adj = new LinkedList[v]; 
	        for (int i=0; i<v; ++i) 
	            adj[i] = new LinkedList(); 
	    } 
	  
	    //Function to add an edge into the graph 
	    void addEdge(int v, int w) 
	    { 
	        adj[v].add(w);  // Add w to v's list. 
	    } 
	  
	    // A function used by DFS 
	    void DFSUtil(int v,boolean visited[]) 
	    { 
	        // Mark the current node as visited and print it 
	        visited[v] = true; 
	        System.out.print(v+" "); 
	  
	        // Recur for all the vertices adjacent to this vertex 
	        Iterator<Integer> i = adj[v].listIterator(); 
	        while (i.hasNext()) 
	        { 
	            int n = i.next(); 
	            if (!visited[n]) 
	                DFSUtil(n, visited); 
	        } 
	    } 
	  
	    // The function to do DFS traversal. It uses recursive DFSUtil() 
	    void DFS(int v) 
	    { 
	        // Mark all the vertices as not visited(set as 
	        // false by default in java) 
	        boolean visited[] = new boolean[V]; 
	  
	        // Call the recursive helper function to print DFS traversal 
	        DFSUtil(v, visited); 
	    } 
	  
	    public static void main(String args[]) throws IOException
	    { 
	    	System.out.print("15 31 \n");
	    	System.out.println("Vertices : \n { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, \n  10, 11, 12, 13, 14 }");
	    	System.out.println("Edges : \n { (0, 1), (0, 2), (1, 3), (2, 3), (1, 6),\n"
	    			+ "(1, 3), (6, 3), (2, 3), (3, 7), (2, 7),\n"
	    			+ "(6, 4), (3, 4), (3, 5), (5, 7), (4, 5),\n"
	    			+ "(4, 9), (6, 9), (9, 10), (4, 10), (5, 10),\n"
	    			+ "(5, 11), (10, 11), (7, 11), (9, 10), (10, 11),\n"
	    			+ "(10, 12), (10, 13), (9, 14), (11, 14), (1, 14),\n"
	    			+ "(2, 14) }");
	    	System.out.print("Enter the source vertex: ");
	        Scanner input = new Scanner(System.in);
	        int a = input.nextInt();
	    	
	    	try {
	        BufferedReader inFile;
	         inFile = new BufferedReader(new FileReader("C:/Users/hp/eclipse-workspace/Final_Assignment/src/SP2020_CSE373_Final_Q2_1234567/FinalQ1Input.txt"));
	         File file = new File("C:/Users/hp/eclipse-workspace/Final_Assignment/src/SP2020_CSE373_Final_Q2_1234567/FinalQ1Input.txt");
	         Scanner fIn = new Scanner(file);
	         fIn.nextLine(); //skipping the first line!
	        	        
	     
	     
	         while (fIn.hasNext())
	         {
	            // System.out.print(fIn.next());
	             System.out.print(" Visited Vertex:  ");
	             System.out.print(fIn.nextInt());
	             System.out.print(" Parents:  ");
	             System.out.println(fIn.nextBigInteger());
	         }
	         fIn.close();
	    	
	      
	         
	         
	         Map<Integer, String> nodesList = new HashMap<>();
	         SP2020_CSE373_Final_Q2_1712145 g = new SP2020_CSE373_Final_Q2_1712145(15);
	       

	 	         ArrayList edges = new ArrayList();

	 	            for (int i = 0; i < 15; i++) {
	 	                nodesList.put(i, fIn.nextLine());
	 	            }
	 	            String number = null;
	 	            
	 	            
	 	         //  SP2020_CSE373_Final_Q2_1712145 g = null;
				//   g.addEdge(15, 31);
	       
	    	}
	    	catch (NoSuchElementException e) {
	            System.out.println(" ");
	    	}
	    	
	    	
	    } 
	} 