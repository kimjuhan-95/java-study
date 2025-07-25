package exercise03.prob05;

public class Account {
    private String accountNo;  // 계좌 번호
    private int balance;       // 잔고

    // 생성자
    public Account(String accountNo) {
        this.accountNo = accountNo;
        this.balance = 0;  // 초기 잔고는 0
        System.out.println(accountNo + " 계좌가 개설 되었습니다.");
    }

    // 입금
    public void save(int amount) {
        balance += amount;
        System.out.println(accountNo + " 계좌에 " + amount + "만원이 입금 되었습니다.");
    }

    // 출금
    public void deposit(int amount) {
        balance -= amount;
        System.out.println(accountNo + " 계좌에 " + amount + "만원이 출금 되었습니다.");
    }

    // 잔고 getter
    public int getBalance() {
        return balance;
    }

    // 잔고 setter
    public void setBalance(int amount) {
        this.balance = amount;
    }

    // 계좌번호 getter
    public String getAccountNo() {
        return accountNo;
    }

    // 계좌번호 setter (선택사항: 원하면 제거 가능)
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
}
