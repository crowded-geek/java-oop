class encaps{
    private int a = 234;
    private int b = 1230;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String args[]){
        getter a = new getter();
        a.main(new String[0]);
    }
}
class getter{
    public static void main(String args[]){
        encaps en = new encaps();
        System.out.println("A-> "+en.getA());
        System.out.println("B-> "+en.getB());
        en.setA(4);
        System.out.println("A-> "+en.getA());
        en.setB(23);
        System.out.println("B-> "+en.getB());
    }
}