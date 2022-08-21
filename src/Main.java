public class Main {
    public static void main(String[] args) {
        int account = 300;
        int accountCharge = 1100;
        int gift;
        int newAccount;
        if (accountCharge > 1000) {
            gift = accountCharge / 100;
            newAccount = account + accountCharge + gift;
        } else {
            gift = 0;
            newAccount = account + accountCharge;
        }
        System.out.println("Итоговый счет " + newAccount + " Количество бонусных рублей " + gift);
    }
}
