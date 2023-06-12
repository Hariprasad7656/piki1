package org.example;

public class Employe {

    private String name;
    private String age;
    private int id;

    public Employe(){

    }
    public Employe(String name, String age, int id){
        this.name=name;
        this.age=age;
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(String age){
        this.age=age;
    }
    public String getAge(){
        return this.age;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }

    public String toString(){
        return name+" "+age+" "+id;
    }

}
