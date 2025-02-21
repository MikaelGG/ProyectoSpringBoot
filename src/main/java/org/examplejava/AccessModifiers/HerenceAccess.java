package org.examplejava.AccessModifiers;

public class HerenceAccess extends AccessLevel {

    AccessLevel encap = new AccessLevel();

    public void setData() {
        try {
            encap.setName("Mikael");
            encap.setAge(21);
            encap.setPassword("asdqwdwad");
            encap.setCC(100921082);
            System.out.println(encap.getName() + " " + encap.getAge() + " " + encap.getPassword() + " " + encap.getCC());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addAccess() {
        super.addAccess("Mikael", "MIKAEL1234123", 21, 10892222);
    }

    public static void main(String[] args) {

        try {
            HerenceAccess aa = new HerenceAccess();
            aa.setData();
            aa.addAccess();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
