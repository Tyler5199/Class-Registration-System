package lackey_project1;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CourseList
{
    public String line;
    public String courseName;
    public String crn;
    public String courseNum;
    public String sectionNum;
    public String creds;
    public String start_time;
    public String end_time;
    public String days;
    public String location;
    public String course_type;
    public String instructor;
    
    public ArrayList<Course> trial;
    
    
    public ArrayList<Course> courses = new ArrayList();
    
    public void createList()
    {
      
        try 
        {


            Scanner in = new Scanner(Paths.get("project1input.csv"), "UTF-8");

            while(in.hasNextLine())
            {
                line = in.nextLine();
                ArrayList<String> key = new ArrayList(Arrays.asList(line.split("\t")));

                if (key.get(5).equals("World Wide Web"))
                {
                   courseName = key.get(0);
                   crn = key.get(1);
                   courseNum = key.get(2);
                   sectionNum = key.get(3);
                   creds = key.get(4);
                   course_type = key.get(5);
                   instructor = key.get(6);

                   courses.add(new Online_Class(courseName, crn, courseNum, sectionNum, creds, course_type, instructor));


                }

                else
                {
                    courseName = key.get(0);
                    crn = key.get(1);
                    courseNum = key.get(2);
                    sectionNum = key.get(3);
                    creds = key.get(4);
                    start_time = key.get(5);
                    end_time = key.get(6);
                    days = key.get(7);
                    location = key.get(8);
                    course_type = key.get(9);
                    instructor = key.get(10);

                    courses.add(new Traditional_Course(courseName, crn, courseNum, sectionNum, creds, start_time, end_time, days, location, course_type, instructor));
                }


            }
            
        }

        catch (IOException ex)
        {
            System.err.println(ex.toString());
        }
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getSectionNum() {
        return sectionNum;
    }

    public void setSectionNum(String sectionNum) {
        this.sectionNum = sectionNum;
    }

    public String getCreds() {
        return creds;
    }

    public void setCreds(String creds) {
        this.creds = creds;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCourse_type() {
        return course_type;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    
    
    

}
