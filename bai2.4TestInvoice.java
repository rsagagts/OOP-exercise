public class TestInvoice {
    public static void main(String[] args) {
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        Invoice inv1 = new Invoice(101, c1, 888.8);

        System.out.println(inv1);
        inv1.setAmount(999.9);
        System.out.println("Số tiền sau giảm giá: " + inv1.getAmountAfterDiscount());
    }
}
