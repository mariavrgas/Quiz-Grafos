/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafe
 */
public class Edge {
    
    private Vertex start;
    private Vertex end;
    private Integer weight;

    public Edge(Vertex start, Vertex end, Integer weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    } 
    

    public Vertex getStart() {
        return start;
    }

    public Vertex getEnd() {
        return end;
    }

    public Integer getWeight() {
        return weight;
    }
    
}
