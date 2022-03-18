package com.example.sqliteprac.Modal;

public class Toy {
    private int id;
    private String toy;
    private String type;

    public Toy(String toy, String type) {
        this.toy = toy;
        this.type = type;
    }

    public Toy(int id, String toy, String type) {
        this.id = id;
        this.toy = toy;
        this.type = type;
    }


    public Toy() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
