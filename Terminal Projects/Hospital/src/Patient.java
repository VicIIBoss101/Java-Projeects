import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Patient {
    private int patienId, daysSpent, patientRoom;
    private String patientName, patientStatus;
    private LocalDateTime regTime;

    public Patient(int patienId, String patientName, String paitentStatus, int patientRoom, int daysSpent) {
        this.patienId = patienId;
        this.patientName = patientName;
        this.patientStatus = paitentStatus;
        this.patientRoom = patientRoom;
        this.daysSpent = daysSpent;
        this.regTime = LocalDateTime.now();
    }
    // ===================================
    public int getPationtId() {
        return patienId;
    }

    public int getDaysSpent() {
        return daysSpent;
    }

    public String getPationtName() {
        return patientName;
    }

    public String getPationtStatus() {
        return patientStatus;
    }

    public int getPationtRoom() {
        return patientRoom;
    }
    public LocalDateTime getRegTime() {
        return regTime;
    }
    public String getFRegTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm a");
        return regTime.format(formatter);
    }
}