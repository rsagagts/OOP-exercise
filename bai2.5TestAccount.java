public class TestAccount {
    public static void main(String[] args) {
        Customer c1 = new Customer(101, "Nguyen Van A", 10);
        Account acc1 = new Account(1, c1, 500.0);

        System.out.println(acc1);
        acc1.deposit(150.0);
        System.out.println("Sau khi gửi tiền: " + acc1);
        acc1.withdraw(200.0);
        System.out.println("Sau khi rút tiền: " + acc1);
    }
}
