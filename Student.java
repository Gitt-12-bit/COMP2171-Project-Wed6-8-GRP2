public class Student {
    String Name;
    boolean logStatus;

    public Student (String Name){
        this.name = Name;
        this.logStatus = logStatus;
    }

    public void login (){
        loggedIn = true;
        System.out.println(Name + " logged in.");
    }

    public String getName(){
        return Name;
    }
}