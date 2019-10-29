package lackey_project1;

import java.util.ArrayList;
import java.util.Scanner;

public class Register extends CourseList
{
    public ArrayList <Course> Registercourse_list;
    public ArrayList<Course> trial = new ArrayList();
    
    public String RegisterInput;
    public String register_crn;
    
    public Register(ArrayList list)
    {
        this.Registercourse_list = list;
        
    }
    
    public void AddClass()
    {
        System.out.println("Enter CRN number: ");
        Scanner in = new Scanner(System.in);
        this.RegisterInput = in.nextLine();
        
        
        for (Course c : Registercourse_list)
        {
            register_crn = c.getCrn();
            boolean conflicts = false;
            
            if (this.RegisterInput.equals(register_crn))
            {
                
                Course newCourse = c;
                for (Course d : trial)
                {
                    if (d.conflictsWith(newCourse))
                    {
                                conflicts = true;
                                
                    }
                }
                
                if (!conflicts)
                {
                   this.trial.add(newCourse);
                   
                }
                
                else
                {
                    System.out.println("ERROR: Either the course was not found, or it conflicts with your current schedule!");
                }
               
            }
            
        }
        
    }
    
    public void viewTrial()
    {
        for (Course c : trial)
        {
            System.out.println(c.toString());
        }
    }
   
}
