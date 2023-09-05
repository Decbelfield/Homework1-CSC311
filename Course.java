/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author Declan Belfield
 *
 */
public class Course {

    /**
     * creating variables
     */
    private int Id;
    private String name;
    private String code;

    /**
     * Default Constructor
     */
    public Course(){
        Id = 0;
        name = "";
        code = "";
    }

    /**
     * created loaded constructor for giving values to the variables besides defaulted values
     * @param id
     * @param name
     * @param code
     */
    public Course(int id, String name, String code) {
        this.Id = id;
        this.name = name;
        this.code = code;
    }

    public void displayCourseInfo() {
        System.out.println("Course ID: " + Id);
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
    }
    /**
     *
     * Getters and Setters for the Variables
     */
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
