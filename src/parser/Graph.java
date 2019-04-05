package parser;

import java.io.IOException;
import java.util.ArrayList;

import help.Bag;
import help.Edge;

public class Graph {
	private Bag<Edge>[] adjacencyList;
	private final int V;
	private int E;
	
	public Graph() throws IOException {
		ArrayList<CrimeADT> crimeList = Parser.csvParser(); 
		this.V = crimeList.size();
		this.E = crimeList.size();
		adjacencyList = (Bag<Edge>[]) new Bag[E];
		for (int e = 0; e < E; e++) {
			adjacencyList[e] = new Bag<Edge>();
		}
		for (int i=2; i < crimeList.size(); i = i + 2) {
			int v = crimeList.get(i-2).getNodeId();
			int w = crimeList.get(i).getNodeId();
			double weight = 1.0;
			Edge e = new Edge(v,w,weight);
			addEdge(e);
		}
		
		for (int i=2; i < crimeList.size(); i = i + 2) {
			int v = crimeList.get(i-1).getNodeId();
			int w = crimeList.get(i).getNodeId();
			double weight = 1.0;
			Edge e = new Edge(v,w,weight);
			addEdge(e);
		}
		
		
	}
	
	/**
	 * Getter Method - Returns the Vertices of the Graph
	 * @return int - Vertices of the Graph
	 */
	public int V() {
		return V;
	}
	
	/**
	 * Getter Method - Returns the Edges of the Graph
	 * @return int - Edges of the Graph
	 */
	public int E() {
		return E;
	}
	
	/**
	 * Getter Method- Returns the adjacencyList of a node
	 * @param v - Id of the city object
	 * @return Iterable<Edge> - Contains the Edges the node is connected to
	 */
	public Iterable<Edge> adj(int v){
		return adjacencyList[v];
	}
	
	/**
	 * Adds the Edge to the adjacencyList
	 * @param e - Edge - Contains the id of two cities and edge weight between them
	 */
	public void addEdge(Edge e) {
		int v = e.either();
		adjacencyList[v].add(e);
	}
	
	/**
	 * Returns the Formatted String of the Graph Object
	 */
	public String toString() {
		try {
			ArrayList<CrimeADT> crimeList = Parser.csvParser();
	        StringBuilder s = new StringBuilder();
	        s.append(V + " " + E + "\n");
	        for (int v = 0; v < 1000; v++) {
	            s.append(v + ": ");
	            for (Edge e : adjacencyList[v]) {
	                s.append(e + "  ");
	            }
	            s.append("\n");
	        }
	        return s.toString();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return null;
    }
	
	public static void main(String[] args) throws IOException {
		Graph G = new Graph();
		System.out.println(G);
	}
	
	
	
}
