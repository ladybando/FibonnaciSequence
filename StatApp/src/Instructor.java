public class Instructor extends Person{
    String officeLocation;
    public Instructor(String lastname, String firstname, String emailAddr, String officeLocation) {
        super(lastname, firstname, emailAddr);
        this.officeLocation = officeLocation;
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

        public String getOfficeLocation() {
            return officeLocation;
        }

        public void setOfficeLocation(String officeLocation) {
            this.officeLocation = officeLocation;
        }

        public void show() {
            System.out.println("Last name: " + this.lastname +
                    "  First name: " + this.firstname +
                    "  Email: " + this.emailAddr +
                    "  Office Location: " + this.officeLocation);
        }


        public static void main(String[] args) {
            // run a quick test to make sure the constructor works.

            Instructor ins = new Instructor("greco", "frank", "fgreco@google.com", "new york");
            ins.show();
        }
}
