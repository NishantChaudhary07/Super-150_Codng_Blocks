
import java.util.*;


class Product{
    private String productname;
    private int productid;
    private double productprice;

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getProductprice() {
        return productprice;
    }

    public void setProductprice(double productprice) {
        this.productprice = productprice;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }
}
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList lst=new ArrayList();
        System.out.println("Enter no.of Products:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            Product obj=new Product();
            System.out.println("Product "+i);
            System.out.println("Enter Product name:");
            sc.nextLine();
            obj.setProductname(sc.nextLine());
            System.out.println("Enter Product id:");
            obj.setProductid(sc.nextInt());
            System.out.println("Enter Product Price:");
            obj.setProductprice(sc.nextDouble());
            lst.add(obj);
        }
        int size= lst.size();
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                Product obj1=(Product)lst.get(i);
                Product obj2=(Product)lst.get(j);
                if(obj1.getProductprice()<obj2.getProductprice()){
                    lst.remove(i);
                    lst.add(i,obj2);
                    lst.remove(j);
                    lst.add(j,obj1);
                }
            }
        }

        for(int i=0;i<lst.size();i++){
            Product obj=(Product)lst.get(i);
            System.out.println(obj.getProductid()+" "+obj.getProductname()+" "+obj.getProductprice());
        }
    }
}