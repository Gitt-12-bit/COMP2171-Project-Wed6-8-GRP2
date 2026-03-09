public class BookingSystem {

    public static void bookSession(Student student, Session session) {

        // Check conflicts
        if (!student.loggedIn) {
            System.out.println("Error: Student must log in first.");
            return;
        }

        // Verify availability
        if (!session.isAvailable()) {
            System.out.println("Slot unavailable. Choose another.");
            return;
        }

        // Create session
        session.book(student.getName());

        // Confirmation
        System.out.println("Session booked successfully for " + student.getName());
        System.out.println("Confirmation email sent.");
    }
}