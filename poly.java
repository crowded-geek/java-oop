class poly {
    String a = "Hello";

    public static void main(String args[]){
        inherited in = new inherited();
        in.main(new String[1]);
    }
}
class inherited extends poly {
    String a = "XD XD";

    public static void main(String args[]) {
        poly i = new inherited();
        System.out.println(i.a);
    }
}