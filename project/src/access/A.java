package access;

public class A {
    private int i;
    protected String str;
    int[] arr;

    

    public A(int i, String str) {
        this.i = i;
        this.str = str;
        this.arr = new int[i];
    }



    public int getI() {
        return i;
    }



    public String getStr() {
        return str;
    }



    public int[] getArr() {
        return arr;
    }



    public void setI(int i) {
        this.i = i;
    }



    public void setStr(String str) {
        this.str = str;
    }



    public void setArr(int[] arr) {
        this.arr = arr;
    }

    
}
