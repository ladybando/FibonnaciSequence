import java.util.Random;

public class Fellow extends Person {

    float percentComplete;

    public Fellow(String lastname, String firstname, String emailAddr, float percentComplete) {
        super(lastname, firstname, emailAddr);
        this.percentComplete = percentComplete;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public float getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(float percentComplete) {
        this.percentComplete = percentComplete;
    }

    public Fellow(String lastname, String firstname, String emailAddr) {
        super(lastname, firstname, emailAddr);
        this.percentComplete = new Random().nextFloat() * 100;
    }

    public void show() {
        System.out.println("Last name: " + this.lastname +
                "  First name:  " + this.firstname +
                "  Email: " + this.emailAddr +
                "  Percent Complete: " + this.percentComplete);
    }

    public void showf() {
        System.out.printf("Last name: %s  First name: %s  Email: %s  Percent Complete: %5.2f%%\n",  // %% prints a '%'
                this.lastname,
                this.firstname,
                this.emailAddr,
                this.percentComplete
        );
    }

    public static void main(String[] v) {
        // Run some tests to make sure things are working
        Fellow f = new Fellow("greco", "frank", "fgreco@google.com", 90.0F);
        //f.show();
        f.showf();

        Fellow c = new Fellow("chang", "caren", "caren@google.com");
        //c.show();
        c.showf();
    }
}

