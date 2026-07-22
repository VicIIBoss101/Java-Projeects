import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Patient {
    private int patienId, daysSpent, patientRoom, nightReg;
    private String patientName, patientStatus, roomType;
    private LocalDateTime regTime;

    // ======================== Obj cons (Overloaded) ========================
    // public Patient(int patienId, String patientName, String paitentStatus, int patientRoom, int daysSpent, int num) {
    //     this.patienId = patienId;
    //     this.patientName = patientName;
    //     this.patientStatus = paitentStatus;
    //     this.patientRoom = patientRoom;
    //     this.daysSpent = daysSpent;
    //     this.regTime = LocalDateTime.now();
    // }

    public Patient(int patientId, String patientName, String roomType, int roomNum, int night) {
        this.patientName = patientName;
        this.patienId = patientId;
        this.roomType = roomType;
        this.nightReg = night;
        this.patientRoom = roomNum;
        this.patientStatus = "unkonwn";
        this.regTime = LocalDateTime.now();
    }

    // ======================== Stters ========================
    public void setRoomAndNights(String roomType, int nights) {
        this.roomType = roomType;
        this.nightReg = nights;
        this.regTime = LocalDateTime.now();
    }

    public void setName(String name) {
        if (name == null)
            this.patientName = "unkonwn";
        else
            this.patientName = name;
    }

    public void setID(int id) {

        this.patienId = id;
    }

    // ======================== Getters ========================
    public int getPationtId() {
        return patienId;
    }

    public int getDaysSpent() {
        return daysSpent;
    }

    public int getRegNights() {
        return nightReg;
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