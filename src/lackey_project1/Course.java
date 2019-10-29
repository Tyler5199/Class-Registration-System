package lackey_project1;

public abstract class Course 
{
    public String course_name;
    public String crn;
    public String course_num;
    public String section_number;
    public String credits;
    public String course_type;
    public String instructor;
    
    public Course(String Course_Name,String CRN, String Course_Num, String Section_Num,String con_creds,String courseType, String Instructor)
    {
        this.course_name = Course_Name;
        this.crn = CRN;
        this.course_num = Course_Num;
        this.section_number = Section_Num;
        this.credits = con_creds;
        this.course_type = courseType;
        this.instructor = Instructor;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getCourse_num() {
        return course_num;
    }

    public void setCourse_num(String course_num) {
        this.course_num = course_num;
    }

    public String getSection_number() {
        return section_number;
    }

    public void setSection_number(String section_number) {
        this.section_number = section_number;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }
    
    public abstract boolean conflictsWith(Course newCourse);
    
    public String toString()
    {
        
        return (course_name + " " + crn + " " + course_num + " " + section_number + " " + credits + " " + course_type + " " + instructor);
    }
}
