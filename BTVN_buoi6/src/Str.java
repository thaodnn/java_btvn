public class Str {
    String a = "You only live once, but if you do it right, once is enough";
    public void kiemtrakitu() {
        int lengtha = a.length();
        int x = 0;
        int count = 0;
        for (int i = 0; i < lengtha; i++) {
            if (a.charAt(i) == 'o') {
                System.out.println("Vị trí kí tự o " + i);
                x = x + 1;
            } else if (a.charAt(i) != ' '||a.charAt(i) !='\t'||a.charAt(i) !='\n'){
                count = count + 1;
            }
        }
        System.out.println("Số lần kí tự o xuất hiện: " + x);
        System.out.println("Số kí tự của chuỗi" + count);
    }
}
