/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 * 
 *
 * @author Mafe
 */
public class Vertex {
 
    private String data;
    private ArrayList<Edge>edges;

    public String getData() {
        return data;
    }
    
    public Vertex(String inputData){
        this.data = inputData;
        this.edges = new ArrayList<Edge>();
    }
    
    public void addEdge(Vertex endVertex, Integer weight){
        this.edges.add(new Edge(this, endVertex, weight));
    }
    
    public void removeEdge(Vertex endVertex){
        this.edges.removeIf(edge -> edge.getEnd().equals(endVertex));
    }
    public ArrayList<Edge>getEdges(){
        return this.edges;
    }

    void print(boolean weighted) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

    
    

