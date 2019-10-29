package lackey_project1;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;



public class Lackey_Project1
{

    public static void main(String[] args)
    {
        
        boolean main = true;
        
        
        
        CourseList courselist = new CourseList();
        courselist.createList();
        
        Register registerObj = new Register(courselist.getCourses());
        
        while(main)
        {
            MainScreen screen = new MainScreen();

            screen.printWords();

            boolean search = screen.isSearch();
            boolean register = screen.isRegister();
            boolean view = screen.isView();
            boolean quit = screen.isQuit();

            if (search)
            {
                Search searchObj = new Search(courselist.getCourses());
                searchObj.printWords();

            }

            else if (register)
            {
                
                registerObj.AddClass();

            }

            else if (view)
            {
                
                registerObj.viewTrial();

            }

            else if (quit)
            {
                main = screen.isMainScreen();
            }

        }

        if (!main)
        {
            System.out.println("Thanks for using the Student Registration System!");
            System.exit(0);
        }
        
        

    } 
    

}

