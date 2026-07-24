import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Patient {
    static private int idCount = 0;
    private int patienId, patientRoom, daysSpent;
    private String patientName,roomType;
    private LocalDateTime regTime;

    public Patient( String patientName, String roomType, int roomNum) {
        this.patientName = patientName;
        this.patienId = setID();
        this.roomType = roomType;
        this.patientRoom = roomNum;
        this.regTime = LocalDateTime.now();
    }

    // ======================== Stters ========================

    public void setDaySpent(int daySpent){
        this.daysSpent = daySpent;
    }
    public int setID() {
        int sID = this.idCount + 1;
        this.idCount ++;
        return sID;
    }

    // ======================== Getters ========================
    public int getPatientId() {
        return patienId;
    }
    public int getDaysSpent(){
        return daysSpent;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getPatientRoom() {
        return patientRoom;
    }

    public String getRoomtype(){
        return roomType;
    }

    public LocalDateTime getRegTime() {
        return regTime;
    }

    public String getFRegTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm a");
        return regTime.format(formatter);
    }
}