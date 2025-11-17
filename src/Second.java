class sample{
    public void display(int a,int b,int c){
        int display=a*b*c;
        System.out.println("Display:"+display);

    }

}
public class Second {
    public static void main (String args[]){
        int a=10,b=5,c=2;
        sample ob =new sample();
        ob.display(a,b,c);

    }
}
