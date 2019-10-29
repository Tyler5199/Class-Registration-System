package lackey_project1;

import java.util.Scanner;

public class MainScreen
{
    public boolean search = false;
    public boolean register = false;
    public boolean view = false;
    public boolean quit = false;
    public boolean mainScreen = true;
    
    public void printWords()
    {
        System.out.println("\n1) Search Courses\n2) Register for Course\n3) View Trial Schedule\n4) Quit\n\nYour Choice?: ");
        Scanner userIn = new Scanner(System.in);
        String userInput = userIn.nextLine();
     
        switch(userInput)
        {
            case "1":
                this.search = true;
                break;
                
            case "2":
                this.register = true;
                break;
                
            case "3":
                this.view = true;
                break;
                
            case "4":
                this.quit = true;
                this.mainScreen = false;
                break;
                
            default:
                System.out.println("ERROR: Invalid Input!");
            
            
        }
        
        
        
    }

    public boolean isSearch() {
        return search;
    }

    public void setSearch(boolean search) {
        this.search = search;
    }

    public boolean isRegister() {
        return register;
    }

    public void setRegister(boolean register) {
        this.register = register;
    }

    public boolean isView() {
        return view;
    }

    public void setView(boolean view) {
        this.view = view;
    }

    public boolean isQuit() {
        return quit;
    }

    public void setQuit(boolean quit) {
        this.quit = quit;
    }

    public boolean isMainScreen() {
        return mainScreen;
    }

    public void setMainScreen(boolean mainScreen) {
        this.mainScreen = mainScreen;
    }
    
}
