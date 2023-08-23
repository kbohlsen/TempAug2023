public class Couple
{
    private Person p1,p2;
    //--------------------------------------------------------------------------------------
    public Couple()
    {
        p1 = new Person();
        p2 = new Person();
    }
    //--------------------------------------------------------------------------------------
    public void addData(int option, String newName, int newAge)
    {
        if (option==1) setData1(p1,newName,newAge);
        else           setData1(p2,newName,newAge);

    }

    private void setData1(Person p, String name, int age)
    {
        p.setName(name);
        p.setAge(age);
    }
    //--------------------------------------------------------------------------------------    
    public String test()
    {
        System.out.println("Test method ages are " + p1.getAge() + "and" + p2.getAge());

        if (p1.getAge() < p2.getAge()) return("GOOD FOR "+p2.getName()+"!");
        else                           return("GOOD FOR "+p1.getName()+"!");
    }

    /* j. Add a method in Couple class called printCouple(). The method should return a 
    String with the name and age of each person. Call the method in AgencyInterface. */

    public String printCouple()
    {
        
        
        
        String outputLine = p1.getName() + " is " + p1.getAge() + " old";
        outputLine += p2.getName() + " is " + p2.getAge() + " old";   
        
        outputLine
        
        return(outputLine);

    }
    
}