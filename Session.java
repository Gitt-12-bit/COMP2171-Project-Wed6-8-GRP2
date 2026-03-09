public class Session {

    String timeSlot;
    boolean available;
    String studentName;

    public Session(String timeSlot) {
        this.timeSlot = timeSlot;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void book(String studentName) {
        this.studentName = studentName;
        this.available = false;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public String getStudentName() {
        return studentName;
    }

}