class inherit {
    String a = "Hello";
    String b = "World";

    void func() {
        System.out.println("Something");
    }
    public static void main(String args[]){
        inherited in = new inherited();
        in.main(new String[1]);
    }
}
class inherited extends inherit {
    String c = "XD XD";

    public static void main(String args[]) {
        inherited i = new inherited();
        System.out.println(i.a);
        System.out.println(i.b);
        System.out.println(i.c);
        i.func();
    }
}