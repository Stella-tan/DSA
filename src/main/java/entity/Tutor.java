/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author dfsdfds fddsfd
 */
public class Tutor {
   /*
    Tutor Management Subsystem
Add a new tutor
Remove a tutor
Find tutor
Amend tutor details
List all tutors
Filter tutors based on criteria
Generate relevant reports

    */
    private String tutorID;
    private String name;
    private String IC;
    
    public Tutor()
    {
        
    }
    
    public Tutor(String tutorID,String name, String IC)
    {
        this.tutorID= tutorID;
        this.name=name;
        this.IC=IC;
    }
    
}
