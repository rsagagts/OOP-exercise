public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Nguyen Van A", "Da Nang");
        System.out.println(p1);

        Student s1 = new Student("Tran Thi B", "Quang Nam", "Information Technology", 2026, 1500.0);
        System.out.println(s1);

        Staff st1 = new Staff("Le Van C", "Hue", "VKU", 2000.0);
        System.out.println(st1);
    }
}
