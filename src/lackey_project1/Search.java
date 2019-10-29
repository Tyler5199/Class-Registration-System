package lackey_project1;
import java.util.Scanner;
import java.util.ArrayList;



public class Search extends CourseList
{
    public ArrayList<Course> course_list;
    public Search(ArrayList<Course> list)
    {
        this.course_list = list;
    }
    
    public void printWords()
    {
        System.out.println("Enter course number in the format SSNNN (for example, CS 201): ");
        Scanner searchIn = new Scanner(System.in);
        String searchInput = searchIn.nextLine();
        
        
        
        
        
        for (Course c : course_list)
        {
            String numCourse = c.getCourse_num();

            if (numCourse.equals(searchInput))
            {
                System.out.println(c.toString());
            }

        }

    }   

}
