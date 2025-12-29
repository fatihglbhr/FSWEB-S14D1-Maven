package com.workintech.developers;

public class HRManager extends Employee{
    private String[] juniorDevelopers = new String[10];
    private String[] midDevelopers = new String[10];
    private String[] seniorDevelopers = new String[10];


    public HRManager(long id, String name,int salary){
        super(id, name, salary);
    }


    @Override
    public void work(){
        System.out.println("HRManager starts to working");
        setSalary(15000);
    }

    public void addEmployee(String name, int index){

    }
}
