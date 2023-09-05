
package com.mycompany.csc229_assignment01;
/**
 *
 * @author Declan Belfield
 */
public class Driver extends Course {
    public static void main(String[] args) {

        {
            /**
             * Pulls objects from the Course class into the driver class for further use
             */
            Course id;
            Course name;
            Course code;

            /**
             * Changes the Course over to CSC 311 from the default params
             */


            Course course = new Course(31100, "Advanced Programming", "CSC311");
            /**
             * Displays the changes made and the new class id,name,and code
             */
            course.displayCourseInfo();
        }
    }
}
