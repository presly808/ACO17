package avdieiev.week3.TravelAgency.model;

public class Request {
    private String clientName;
    private String clientPhone;
    private int idTour;
    private MyDate dateRequest;

    public Request( int idTour, String clientName, String clientPhone, MyDate dateRequest) {
        this.clientName = clientName;
        this.clientPhone = clientPhone;
        this.idTour = idTour;
        this.dateRequest = dateRequest;
    }

    public MyDate getDateRequest() {
        return dateRequest;
    }

    public int getIdTour() {
        return idTour;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    public void setDateRequest(MyDate dateRequest) {
        this.dateRequest = dateRequest;
    }

    public String getClientName() {
        return clientName;
    }
}
