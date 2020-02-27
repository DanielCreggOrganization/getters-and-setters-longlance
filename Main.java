public class Main {
    // Main method
    public static void main(String[] args) {
        Person personObj1 = new Person();

        personObj1.setfirstName("Fred");
            System.out.println(personObj1.getfirstName());

        personObj1.setmiddleName("Wilfred");
            System.out.println(personObj1.getmiddleName());

        personObj1 = new Person();
            personObj1.setuserName("theRedRhino");//11 characters

            System.out.println(personObj1.getuserName());
    }
}
