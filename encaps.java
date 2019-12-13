class encaps{
    private int a = 234;
    int b = 1230;
    public static void main(String args[]){
        getter a = new getter();
        a.main(new String[0]);
    }
}
class getter{
    public static void main(String args[]){
        encaps en = new encaps();
        System.out.println(en.b);
    }
}