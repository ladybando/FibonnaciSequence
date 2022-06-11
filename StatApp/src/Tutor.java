import java.util.ArrayList;
public class Tutor  extends Person{
    String lastname;
    String firstname;
    String emailAddr;
    ArrayList<Fellow> team;

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

    public ArrayList<Fellow> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Fellow> team) {
        this.team = team;
    }

    public void setTeamMember(Fellow f) {
        team.add(f);
    }

    public void displayTeam() {
        System.out.println("TEAM MEMBERS ");
        for (Fellow f : team) {
            System.out.println(f.lastname + ":" + f.firstname + ":" + f.emailAddr + ":" + f.percentComplete);
        }
    }

    public float calcAvg() {
        float sum = 0;

        for (Fellow f : team) {
            sum += f.getPercentComplete();
        }

        return sum / team.size();
    }

        public Tutor(String lastname, String firstname, String emailAddr) {
            super(lastname, firstname, emailAddr);
            this.team = new ArrayList<Fellow>();
        }

    public void show() {
        System.out.println("Last name: " + this.lastname +
                "  First name: " + this.firstname +
                "  Email: " + this.emailAddr);
    }

    public static void main(String[] v) {
        Tutor ama = new Tutor("ama", "ama's lastname", "ama@google.com");
        ama.show();

        Fellow f;
        f = new Fellow("smith", "mary", "marysmith@gmail.com", 50.0F);
        ama.setTeamMember(f);

        f = new Fellow("king", "albert", "albertking@gmail.com");
        ama.setTeamMember(f);

        ama.displayTeam();
    }

}
