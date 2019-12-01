public class EuclidNOD {

    public int nod(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else if (a > b) {
            return nod(a % b, b);
        } else {
            return nod(b % a, a);
        }
    }

    public static void main(String[] args) {
        System.out.println(new EuclidNOD().nod(24,36));
    }

}
