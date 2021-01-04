public class Patient {

    private String firstName;
    private String lastName;
    private String mName;
    private String address;
    private int phone;
    private String diagnosis;
    private int id;
    private int card;

    public Patient(String firstName, String lastName, String mName, String address, String diagnosis,
                   int phone, int id, int card) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.mName = mName;
        this.address = address;
        this.phone = phone;
        this.diagnosis = diagnosis;
        this.id = id;
        this.card = card;
    }

    public Patient() {
        this.firstName = "";
        this.lastName = "";
        this.mName = "";
        this.address = "";
        this.phone = 0;
        this.diagnosis = "";
        this.id = 0;
        this.card = 0;
    }

    public void Show() {
        System.out.println("LName:  " + this.getLastName() + " Name:  "+ this.getFirstName() + " MName:  "
                + this.getmName() + " |   Address: " + this.getAddress() + " |   Phone: "
                + this.getPhone() + " | Diagnosis: "+this.getDiagnosis() + " |  Id: "
                + this.getId() + " |  #Card: " + this.getCard());
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getmName() {
        return mName;
    }
    public String getAddress() {
        return address;
    }
    public int getPhone() {
        return phone;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    public int getId() { return id; }
    public int getCard() {
        return card;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public void setId(int id) { this.id = id; }
    public void setCard(int card) {
        this.card = card;
    }
}