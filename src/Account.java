
public class Account {
    private String AccountID;
    private String userName;
    private String passWord;
    private String phnum;

    public Account(String AccountID, String userName, String passWord, String phnum) {
        this.AccountID = AccountID;
        this.userName = userName;
        this.passWord = passWord;
        this.phnum = phnum;
    }

    public String getphnum () {
        return phnum;
    }

    public String getAccountID() {
        return AccountID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setAccountID(String accountID) {
        AccountID = accountID;
    }

    public void setphnum (String balance) {
        this.phnum = balance;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountID='" + AccountID + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", balance=" + phnum +
                '}';
    }
}
