/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Mafe
 */
public class Graph {
    
    private ArrayList<Vertex>vertices;
    private boolean isWeighted;
    private boolean IsDirected;

    public Graph(boolean isWeighted, boolean IsDirected) {
        this.vertices = new ArrayList<Vertex>();
        this.isWeighted = isWeighted;
        this.IsDirected = IsDirected;
    }
    
    
    public Vertex addVertex(String data){
       Vertex newVertex = new Vertex(data); 
       this.vertices.add(newVertex);
       return newVertex;
    }
    
    public void addEdge(Vertex vertex1, Vertex vertex2,Integer weight){
        if (!this.isWeighted){
            weight = null;
        }
        vertex1.addEdge(vertex2, weight);
        if(!this.IsDirected){
            vertex2.addEdge(vertex1, weight);
        }
    } 
    public void removeEdge(Vertex vertex1, Vertex vertex2){
        vertex1.removeEdge(vertex2);
        
        if (!this.IsDirected){
            vertex2.removeEdge(vertex1);
        }
    }
    
    public void removeVertex(Vertex vertex){
        this.vertices.remove(vertex);
    }
    
    public ArrayList<Vertex>getVertices(){
        return this.vertices;
    }
    
    public boolean isWeighted(){
        return this.isWeighted;
    }
    
    public boolean isDirected(){
        return this.IsDirected;
    }
    
    public Vertex getVertexByValue(String value){
        for (Vertex v:this.vertices){
            if(v.getData()==value){
                return v;
            }
        }
        return null;
    }
    
    public void print(){
        for (Vertex v:this.vertices){
            v.print(isWeighted);
        }
    }
}
