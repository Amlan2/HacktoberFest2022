package com.company;
class Employee
{
    private int id;
    private String name;

    public void set_id(int i)
    {
        id=i;
    }
    public int get_id()
    {
        return id;
    }
    public void set_name(String n)
    {
        name=n;
    }
    public String get_name()
    {
        return name;
    }
}
public class Getters_Setters {
    public static void main(String[] args) {
        Employee em=new Employee();
        //System.out.println(em.id+" "+em.name);
        em.set_id(3);
        System.out.println("The id is "+em.get_id());
        em.set_name("lohan");
        System.out.println("The name is "+em.get_name());
    }
}
