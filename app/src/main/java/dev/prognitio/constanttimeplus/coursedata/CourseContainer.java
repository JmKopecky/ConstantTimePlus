package dev.prognitio.constanttimeplus.coursedata;

import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class CourseContainer {

    private ArrayList<Course> courses;

    public CourseContainer() {
        courses = new ArrayList<>();
    }






    //take the average of the output of gpaContributions() across all courses
    public double averageGPAContributions() {
        double sumContributions = 0;
        for (Course course : courses) {
            sumContributions += course.calculateGPAContribution();
        }
        return sumContributions / courses.size();
    }







    //getter and setter methods

    public ArrayList<Course> getCourses() {
        return courses;
    }

    //try to add a course to the list, return false if anything goes wrong
    public boolean addCourse(Course toAdd) {
        try {
            courses.add(toAdd);
        } catch (Exception e) {
            return false;
        }
        return true;
    }





    //serialization using GSON (for storing data to user device)

    public String toString() {
        return new GsonBuilder().create().toJson(this);
    }

    public static CourseContainer fromString(String str) {
        return new GsonBuilder().create().fromJson(str, CourseContainer.class);
    }
}
