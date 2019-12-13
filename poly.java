class poly{
    double area(int l, int b){
        return l*b;
    }
    double area(int r){
        return Math.PI*r*r;
    }
    public static void main(String args[]){
        poly a = new poly();
        System.out.println(a.area(4, 5));
        System.out.println(a.area(4));
    }
}