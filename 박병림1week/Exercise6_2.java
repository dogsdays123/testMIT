public class Exercise6_2 {
    public static void main(String[] args) {
        Studentzz st = new Studentzz("홍길동", 1, 1, 100, 60, 76);

        String str = st.info();
        System.out.println(str);
    }
}

class Studentzz {
    String name;
    int[] a = new int[5];

    Studentzz(String b, int ...c) {
        name = b;
        for(int i = 0; i < a.length; i++)
        {
            a[i] = c[i];
        }
    }

    String info() {
        String strr = "";
        String strr3 = "";
        String[] strr2 = {"56", "23", "12"};
        for(int i = 0; i < a.length; i++){
            strr += a[i] + ",";
        }
        for(int i = 0; i < strr2.length; i++){
            if(i == strr2.length - 1){
                strr3 += strr2[i] + "";
                break;
            }
            strr3 += strr2[i] + ",";
        }
        return strr + strr3;
    }
}

