package PersewaanCD;

public class TesterArray {
    public static void main(String[] args) {
        Product[] prod = new Product[2];
        CD[] c = new CD[4];
        DVD[] d = new DVD[3];
        System.out.println("Prod[0]: \n");
        prod[0] = new Product();
        prod[0].print();
        System.out.println();
        System.out.println("CD[3]: ");
        c[3] = new CD("Bruno Collection", 1, 10, 100.5, "Bruno Earth", 3, "Top Bruno Hits");
        c[3].print();
        System.out.println("DVD[2]: ");
        d[2] = new DVD("Djadoel", 4, 50, 300.5, 5, "Top Classic", "Sonny Entertains");
        d[2].print();
        System.out.println("Prod[1]: \n");
        prod[1] = new Product("cjar", 1, 3, 40.5);
        prod[1].print();
    }
}
