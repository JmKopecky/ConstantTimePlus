package dev.prognitio.constanttimeplus.coursedata;

public class Course {

    private int grade;
    private String className;
    private String teacher;
    private double gpaLevel;
    private int semester;


    public Course() {
        //no provided data, use defaults.
        grade = -1;
        className = "COURSE_DEFAULT";
        teacher = "TEACHER_DEFAULT";
        gpaLevel = -1;
        semester = 0;
    }

    public Course(int grade, String className, String teacher, double gpaLevel, int semester) {
        this.grade = grade;
        this.className = className;
        this.teacher = teacher;
        this.gpaLevel = gpaLevel;
        this.semester = semester;
    }


    //using the standard formula for gpa based on grade, return the gpa contribution
    //if the student is failing, return 0
    //if default data is being used return -1;
    public double calculateGPAContribution() {
        if (grade >= 70) {
            return gpaLevel - 0.1 * (100-grade);
        } else if (grade >= 0){
            return 0;
        } else {
            return -1;
        }
    }

    //getter and setter for grade
    public void setGrade(int newGrade) {
        this.grade = newGrade;
    }
    public int getGrade() {
        return grade;
    }

    //getter and setter for className
    public void setClassName(String newClassName) {
        this.className = newClassName;
    }
    public String getClassName() {
        return className;
    }

    //getter and setter for teacher
    public void setTeacher(String newTeacher) {
        this.teacher = newTeacher;
    }
    public String getTeacher() {
        return teacher;
    }

    //getter and setter for gpaLevel
    public void setGpaLevel(double newGpaLevel) {
        this.gpaLevel = newGpaLevel;
    }
    public double getGpaLevel() {
        return gpaLevel;
    }

    //getter and setter for semester
    public void setSemester(int newSemester) {
        this.semester = newSemester;
    }
    public int getSemester() {
        return semester;
    }

}
