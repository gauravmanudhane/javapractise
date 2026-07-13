package com.my.javapractise.map;

public class Employee {

    private int id;
    private String name;
    //private String department;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        //this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    /*public String getDepartment() {
        return department;
    }*/

     @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
               // ", department='" + department + '\'' +
                '}';
    }

    //override only equals()
    /*@Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return this.id == e.id && this.name.equals(e.name);
    }*/

    // Only hashCode overridden
    @Override
    public int hashCode() {
        return id;  // simple hash based on id
    }

}
