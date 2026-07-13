package com.my.javapractise.memory;

public class MemoryManagement {
    public static void main(String[] args) {
     int primitives=10;
     String stringliteral="Hello World";
     Person person=new Person();
     MemoryManagement memoryManagement=new MemoryManagement();
     memoryManagement.memoryManagementTest(person);
    }

    private void memoryManagementTest(Person personObj){
      Person personObj1=personObj;
      /*personObj1.setName("Gaurav");
      personObj1.setAge(30);
      System.out.println("Person Name: "+personObj.getName());
      System.out.println("Person Age: "+personObj.getAge());*/
      String stringliteral="Hello World";
      String stringliteral1=new String("Hello World");
    }

    private void memoryManagement(){
        // Stack Memory
        int a=10;
        int b=20;
        int c=a+b;

        // Heap Memory
        String str1=new String("Hello");
        String str2=new String("World");
    }
}
