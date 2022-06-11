public class StatApp {

    public static void main(String[] args) {

        Fellow f1, f2, f3;      // note, these are really unnecessary

        Tutor ama = new Tutor("marfo", "ama", "marfoama43@gmail.com");
        f1 = new Fellow("smith", "mary", "marysmith@gmail.com", 45.0F);
        f2 = new Fellow("jones", "john", "bigman@gmail.com");
        f3 = new Fellow("dylan", "bob", "bob@gmail.com", 10.0F);
        ama.setTeamMember(f1);         // Add each Fellow to the tutor's list of Fellows
        ama.setTeamMember(f2);
        ama.setTeamMember(f3);
        System.out.println("Ama Team: " + ama.calcAvg());

        //.....
        Tutor javid = new Tutor("mitchell", "javid", "javidt@google.com");
        f1 = new Fellow("smith", "mary", "marysmith@gmail.com");
        f2 = new Fellow("jones", "john", "bigman@gmail.com");
        f3 = new Fellow("jackson", "ana", "aj@gmail.com", 95.0F);
        javid.setTeamMember(f1);     // Add each Fellow to the tutor's list of Fellows
        javid.setTeamMember(f2);
        javid.setTeamMember(f3);
        System.out.println("Javid Team: " + javid.calcAvg());

        //....
        Tutor amani = new Tutor("muller", "amani", "amani@google.com");
        f1 = new Fellow("smith", "mary", "marysmith@gmail.com");
        f2 = new Fellow("jones", "john", "bigman@gmail.com");
        f3 = new Fellow("jackson", "ana", "aj@gmail.com");
        amani.setTeamMember(f1);    // Add each Fellow to the tutor's list of Fellows
        amani.setTeamMember(f2);
        amani.setTeamMember(f3);
        System.out.println("Amani Team: " + amani.calcAvg());

       /*
       // f1, f2 and f3 were really not necessary.  You could have shortened to this:
       Tutor amani = new Tutor("muller", "amani", "amani@google.com");
       amani.setTeamMember(new Fellow("smith", "mary", "marysmith@gmail.com"));
       amani.setTeamMember(new Fellow("jones", "john", "bigman@gmail.com"));
       amani.setTeamMember(new Fellow("jackson", "ana", "aj@gmail.com");

       System.out.println("Amani Team: " + amani.calcAvg());
        */
    }

}
