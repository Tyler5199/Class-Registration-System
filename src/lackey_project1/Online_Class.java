package lackey_project1;

public class Online_Class extends Course
{
    
    public Online_Class(String course_name,String crn,String course_num,String section_num, String credits, String course_type, String instructor)
    {
        super(course_name,crn,course_num,section_num,credits, course_type, instructor);
        
    }
    
    
    @Override
    public boolean conflictsWith(Course newCourse)
    {
        
        return false;
    }
    
    
    
}
