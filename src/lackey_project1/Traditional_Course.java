package lackey_project1;

public class Traditional_Course extends Course
{
    public String starting_time;
    public String ending_time;
    public String days_of_week;
    public String location;
    

    
    
    public Traditional_Course(String course_name,String crn,String course_num,String section_num, String credits, String course_type, String instructor, String start_time, String end_time, String day_week, String place)
    {
        super(course_name,crn,course_num,section_num,credits, course_type, instructor);
        this.starting_time = start_time;
        this.ending_time = end_time;
        this.days_of_week = day_week;
        this.location = place;
    }
    
    public String getStarting_time() {
        return starting_time;
    }

    public void setStarting_time(String starting_time) {
        this.starting_time = starting_time;
    }

    public String getEnding_time() {
        return ending_time;
    }

    public void setEnding_time(String ending_time) {
        this.ending_time = ending_time;
    }

    public String getDays_of_week() {
        return days_of_week;
    }

    public void setDays_of_week(String days_of_week) {
        this.days_of_week = days_of_week;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
    
    public boolean conflictsWith(Course newCourse)
    {
        boolean conflicts = false;
        
        Traditional_Course newTrad = (Traditional_Course) newCourse;
        
        String a_days = this.days_of_week;
        String a_start = this.starting_time;
        String a_end = this.ending_time;
        
        
        
        String b_days = newTrad.getDays_of_week();
        String b_start = newTrad.getStarting_time();
        String b_end = newTrad.getEnding_time();
        
        if (a_days.equals(b_days))
        {
            if ((a_start.equals(b_start)) || (a_start.equals(b_end)))
            {
                conflicts = true;
            }
            
            else if((b_start.equals(a_start)) || (b_start.equals(b_end)))
            {
                conflicts = true;
            }
        }
        
        else
        {
           conflicts = false; 
        }
        
        
        
        
        
        return conflicts;
    }

    
    public String toString()
    {
        
        return (course_name + " " + crn + " " + course_num + " " + section_number + " " + credits + " " + course_type + " " + instructor + " " + starting_time + " " + ending_time + " " + days_of_week + " " + location);
    }
    
}
