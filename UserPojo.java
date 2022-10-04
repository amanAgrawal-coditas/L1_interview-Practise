package simDisplay;

public class UserPojo {
    private String name, email, address, sim_type;
    private int balance, aadharNumber;
    private long phoneNumber,validity;

    public long getValidity() {
        return validity;
    }

    public void setValidity(long validity) {
        this.validity = validity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSim_type() {
        return sim_type;
    }

    public void setSim_type(String sim_type) {
        this.sim_type = sim_type;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(int aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public long setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }
    public long getPhoneNumber()
    {
        return phoneNumber;
    }



    {

        this.name = name;
        this.email = email;
        this.address = address;
        this.sim_type = sim_type;
        this.balance = balance;
        this.aadharNumber = aadharNumber;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "NewConnection{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", sim_type='" + sim_type + '\'' +
                ", balance=" + balance +
                ", aadharNumber=" + aadharNumber +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}