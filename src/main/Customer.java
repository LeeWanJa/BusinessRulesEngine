package main;

public class Customer {
    private String name;
    private String position;

    public  Customer(String name, String position){
        this.name = name;
        this.position = position;
    }

    public String  getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPosition(String position){
        this.position = position;
    }
}
