public class HelloWorld {
    private int i;
    private String s;

    // hotfix for bug #1234 made by Alice
    public HelloWorld(String s) {
        this.s = s;
    }

    public HelloWorld() {
        i = 0;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

}