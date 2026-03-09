public class Student {
    String studentName;
    boolean logStatus;

    public Student (String studentName, boolean logStatus){
        this.studentName = studentName;
        this.logStatus = logStatus;
    }

    public void login (){
        logStatus = true;
        System.out.println(studentName + " logged in.");
    }

    public String getName(){
        return studentName;
    }

    public boolean isLogStatus() {
        return logStatus;
    }
}