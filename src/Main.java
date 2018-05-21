public class Main {

    public static void main(String[] args) {

        User u = new User("Carlo", "Leonardi", -12);

        User u2 = new User("Pippo", "Baudo", 74);

        Theatre t1 = new Theatre(10, 20);

        Theatre t2 = new Theatre(20, 10);

        t1.assignPlace(u2, 0);
        t1.assignPlace(u, 1);

        t2.assignPlace(u, 8);
        t2.assignPlace(u2, 9);

        System.out.println(t2.getArchive());
        System.out.println(t2.getProfit());

        //u.setAge(24);
        //System.out.println(u.getAge());
        //u.setAge(-10);
        //System.out.println(u.getAge());
    }
}
