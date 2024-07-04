public class Main {
    public static void main(String[] args) {
        int account = 100;
        int add = 5000;
        if (add < 1000) {
            int summ = account + add;
            System.out.println(summ);
        } else {
            int bonus = add / 100;
            System.out.println(account + add + bonus);
            System.out.println(bonus);
        }

    }
}