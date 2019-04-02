package parser;


import java.io.IOException;
import java.util.ArrayList;

import help.Edge;
import help.IndexMinPQ;
import help.Stack;

/**
 * 1. https://algs4.cs.princeton.edu/code/edu/princeton/cs/algs4/DijkstraSP.java.html
 * 
 * @author pbj
 *
 */
public class ShortestPath {
	private double[] distTo;
	private Edge[] edgeTo;
	private IndexMinPQ<Double> pq;
	
	/**
	 * Method to Initialize the ShortestPath Object
	 * @param G - Graph - Graph built from adjacency list 
	 * @param s - int - Source Node
	 */
	public ShortestPath(Graph G, int s){
		distTo = new double[G.V()];
		edgeTo = new Edge[G.V()];
		
		for (int v = 0; v < G.V(); v++) {
			distTo[v] = Double.POSITIVE_INFINITY;
		}
		distTo[s] = 0.0;
		pq = new IndexMinPQ<Double>(G.V());
		pq.insert(s, distTo[s]);
		while (!pq.isEmpty()) {
			int v= pq.delMin();
			for (Edge e : G.adj(v)) {
				relax(e);
			}
		}
		
	}
	
	/**
	 * Relaxs the given edge
	 * @param e - Edge - Edge of the Graph
	 */
	private void relax(Edge e) {
		int v = e.either();
		int w = e.other(v);
		if (distTo[w] > distTo[v] + e.weight()) {
			distTo[w] = distTo[v] + e.weight();
			edgeTo[w] = e;
			if (pq.contains(w)) {
				pq.decreaseKey(w, distTo[w]);
			}
			else {
				pq.insert(w, distTo[w]);
			}	
		}
		
	}
	
	
	/**
	 * Checks if there is a pathTo the given id
	 * @param v - int - Id of the City
	 * @return boolean - checks if there is some value in distTo[v]
	 */
	public boolean hasPathTo(int v) {
		return distTo[v] < Double.POSITIVE_INFINITY;
	}
	
	/**
	 * Returns the distance To the city based on city id
	 * @param v - int - Id of the City
	 * @return double - Distance to the city based on the city id
	 */
	public double distTo(int v) {
		return distTo[v];
	}
	
	/**
	 * Computes the pathTo a given id
	 * @param v -  int - Id of the City
	 * @return Iterable<Integer> - Contains the pathTo from source node to every other node
	 */
	public Iterable<Edge> pathTo(int v){
		if (!hasPathTo(v)) {
			return null;
		}
		Stack<Edge> path = new Stack<Edge>();
		for (Edge e = edgeTo[v] ; e != null; e=edgeTo[e.either()]) {
			path.push(e);
		}
		return path;
	}
	
	/**
	 * Main function used for testing 
	 * References:
	 * 1.https://algs4.cs.princeton.edu/code/edu/princeton/cs/algs4/DijkstraSP.java.html
	 */
	public static void main(String[] args) throws IOException {
		Graph G = new Graph();
		int s = 0;
		ShortestPath sp = new ShortestPath(G, s);
		
//		for (int v = 0; v < G.V(); v++) {
		for (int v = 0; v < 1000; v++) {
			if (sp.hasPathTo(v)) {
				
				System.out.printf("%d to %d (%.2f)", s, v, sp.distTo(v));
//				System.out.printf("%s to %s (%.2f)", cityList.get(s).getName(), cityList.get(v).getName(), sp.distTo(v));
				
				for (Edge e : sp.pathTo(v)) {	
					System.out.print(e + " ");
				}
				System.out.println();
			}
			else {
				System.out.printf("%d to %d no shortestPath\n",s,v);
			}
		}
		
		
		
	}
	
	
	
}
