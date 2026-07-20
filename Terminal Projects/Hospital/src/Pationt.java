public class Pationt {
    private int pationId, daysSpent, pationtRoom;
    private String pationtName, pationtStatus;

    public Pationt(int pationId, String pationtName, String paitontStatus, int pationtRoom, int daysSpent) {
        this.pationId = pationId;
        this.pationtName = pationtName;
        this.pationtStatus = paitontStatus;
        this.pationtRoom = pationtRoom;
        this.daysSpent = daysSpent;
    }

    public void setPaiontId() {
    }

    public void setPationtName() {
    }

    public void setPationtStatus() {
    }

    public void setPationtRoom() {
    }

    public void setDaysSpent() {
    }

    // ===================================
    public int getPationtId() {
        return pationId;
    }

    public int getDaysSpent() {
        return daysSpent;
    }

    public String getPationtName() {
        return pationtName;
    }

    public String getPationtStatus() {
        return pationtStatus;
    }

    public int getPationtRoom() {
        return pationtRoom;
    }

}
