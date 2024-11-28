public class methodParameter {
    public static void main(String[] args) {
        System.out.print("Hasil pemanggilan method jumlah: ");
        System.out.println(jumlah(10));
        System.out.println("Hallo " + nama("Hafizh"));
    }

    public static int jumlah(int a) {
        return a;
    }

    public static String nama(String user) {
        return user;
    }
}

// referensi variabel dalam method passByReference dan passByValue