package ru.Ag;

public class Arc {
    private int vertexStart;
    private int vertexEnd;
    private int weight;

    public void setValues(int vertexStart, int vertexEnd, int weight) {
        this.vertexStart = vertexStart;
        this.vertexEnd = vertexEnd;
        this.weight = weight;
    }

    public int getVertexStart() {
        return vertexStart;
    }

    public int getVertexEnd() {
        return vertexEnd;
    }

    public int getWeight() {
        return weight;
    }
}


