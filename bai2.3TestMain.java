public class TestMain {
    public static void main(String[] args) {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(a1);

        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println(b1);

        b1.setPrice(9.9);
        b1.setQty(99);
        System.out.println("Tên sách: " + b1.getName());
        System.out.println("Tên tác giả: " + b1.getAuthorName());
    }
}
