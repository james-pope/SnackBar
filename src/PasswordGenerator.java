public class PasswordGenerator {
    private int length;
    private String firstChar;
    private static int count = 0;
    public PasswordGenerator(int l, String str){
        length = l;
        firstChar = str;
    }
    public PasswordGenerator(int l){
        length = l;
        firstChar = "A";
    }
    public int pwCount(){
        return count;
    }
    public String pwGen(){
        String pw = firstChar + ".";
        for(int i = 0; i < length; i++){
            int x = (int)(Math.random() * 10);
            pw += x;
        }
        count++;
        return pw;
    }
    public static void main(String[] args){
        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwCount());
    }
}