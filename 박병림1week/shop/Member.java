package shop;

public abstract class Member {
    String id;
    String pw;
    String name;
    String tel;
    Member(String id, String pw, String name, String tel){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.tel = tel;
    }

    public void prt() {
        System.out.println("ID : " + this.id);
        System.out.println("Password : " + this.pw);
        System.out.println("Name : " + this.name);
        System.out.println("Telephone : " + this.tel);
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw; }
    public String getName() {
        return name; }
    public void setName(String name) {
        this.name = name; }
    public String getTel() {
        return tel; }
    public void setTel(String tel) {
        this.tel = tel; }
}