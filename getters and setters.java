package com.company;
class Person{
    private int age;
    public void SetAge(int x){
        if(x>100){
            System.out.println("INVALID AGE REJECTED");
        }
        else{
            age=x;
        }

    }
    public int GetAge(){
        return age;
    }
}
class bankAccount{
    private int balance;
    public void setBalance(int x){
        balance=x;
    }
    public void getBalance(){
        System.out.println(balance);
    }
    public void deposiyAmount(int x){
        balance +=x;
    }
    public void withdrawAmount(int x){
        if(balance<x){
            System.out.println("insufficient balance remaining balance: "+balance);
        }
        else{
            balance -=x;
        }
    }
}
class Employee{
    private int salary;
    public void setSalary(int x){
        if(x<=0){
            System.out.println("invalid salary");
        }
        else{
            salary=x;
        }
    }
    public int getSalary(){
        return salary;
    }
}

class Car{
    private int speed;
    public void setSpeed(int x){
        speed=x;

    }
    public int getSpeed(){
        return speed;
    }
}
class student{
    private String name;
    public void setname(String x){
        name=x;

    }
    public void getname(){
        System.out.println("NAME IS:"+name);
    }
}
class myEmployee{
    private int id;
    private String name;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int x){
        id=x;
    }
    public int getId(){
        return id;
    }

}



public class accessModifiers {
   public static void main(String[] args) {
        myEmployee ow=new myEmployee();
        ow.setName("owais");
        System.out.println(ow.getName());
        ow.setId(192);
        System.out.println(ow.getId());


        student s1=new student();
        s1.setname("owais");
        s1.getname();

        Car c1=new Car();
        c1.setSpeed(80);
        System.out.println(c1.getSpeed());

        Employee e1=new Employee();
        e1.setSalary(1000);
        System.out.println(e1.getSalary());

        bankAccount ba=new bankAccount();
        ba.setBalance(1000);
        ba.getBalance();
        ba.deposiyAmount(1000);
        ba.getBalance();
        ba.withdrawAmount(5000);

       Person b1=new Person();
       b1.SetAge(106);
       b1.SetAge(16);
       System.out.println(b1.GetAge());

    }
}
