import java.util.ArrayList;

public class HospitalManage {

    private ArrayList<Patient> patientList = new ArrayList<>();
    private ArrayList<Integer> vipRooms = new ArrayList<>();
    private ArrayList<Integer> regularRooms = new ArrayList<>();


    public HospitalManage() {
        for (int i = 1; i <= 10; i++) {
            vipRooms.add(i);
            regularRooms.add(i);
        }
    }

    // ======================== Getters ========================
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public ArrayList<Integer> getRoomsByType(String roomType) {
        return roomType.equalsIgnoreCase("vip") ? vipRooms : roomType.equalsIgnoreCase("regular") ? regularRooms : null;
    }

    // ======================== Search / register / delete ========================
    public Patient searchById(int id) {
        for (Patient p : patientList) {
            if (p.getPatientId() == id) {
                return p;
            }
        }
        return null;
    }

    public Patient searchByRoomNum(int rNUm) {
        for (Patient p : patientList) {
            if (p.getPatientRoom() == rNUm) {
                return p;
            }
        }
        return null;
    }

    public Patient deletePatient(Patient p) {
        if (p.getRoomtype().equalsIgnoreCase("vip")) {
            vipRooms.addLast(p.getPatientRoom());
        } else if (p.getRoomtype().equalsIgnoreCase("regular")) {
            regularRooms.addLast(p.getPatientRoom());
        }
        patientList.remove(p);
        return null;
    }
}