class Printer{
    public void print(){
        System.out.println("用普通打印机打印东西");
    }
}
class BlackPrinter extends  Printer{
    public void print(){
        System.out.println("用黑白打印机打印东西");
    }

}
class ColorPrinter extends  Printer{
    public void print(){
        System.out.println("用彩色打印机打印东西");
    }
}
public class dd51 {
    public static void main(String[]args){
        Printer p1 = new Printer();
        Printer p2 = new BlackPrinter();
        Printer p3 = new ColorPrinter();
        p1.print();
        p2.print();
        p3.print();
    }
}
