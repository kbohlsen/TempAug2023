// CODE VERSION IS STUDENT MARKING - NOT KGB VERSION

import java.util.*;

public class AgencyInterface 
{ 
    private void run() 
    {
        Scanner console = new Scanner(System.in);
        Couple c = new Couple();
        int      age,end;
        String   name;

        do {
            System.out.print("first person: "); 
            System.out.print("name: ");
            name = console.next();
            age = 0;
            age = inputAge();
            c.addData(1,name,age);

            System.out.print("second person: "); 
            System.out.print("name: "); 
            name = console.next();

            age = inputAge();

            c.addData(2,name,age);

            System.out.println("********************");
            System.out.println(c.test());           
            System.out.println("********************");
            System.out.print("Quit? (0)yes (1)no: "); 
            end = console.nextInt();
        }
        while (end!=0);
    }

    public static void main(String[] args)
    {
        AgencyInterface agency = new AgencyInterface ();
        agency.run();
    }
    
    //* Method added for lab Q1h
    public int inputAge()
    {
        Scanner console1 = new Scanner(System.in);
        int newAge = 0;
        
        
        System.out.print("Please enter your age");
        newAge = console1.nextInt();

        while (newAge < 18)
        {
            System.out.print("Sorry your age must be 18 or over. Please enter a suitable age\n");
            newAge = console1.nextInt();

        }
        return (newAge);
    }   
}   
