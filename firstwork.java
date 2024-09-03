public class firstwork{
    int a=30;
    static int b=45;
    public static void aimy(){
        System.out.println("the static variable is equal to"+b);
    }

    public void neph(){
        System.out.println("the instance variable is equal to"+a);

    }

    public static void maria(){ 
        int c=35;
        System.out.println("the local variable is equal to"+c);
    }

    public static void main(String[]args){
        firstwork God = new firstwork();
        aimy();
        God.neph();
        maria();

    }
}