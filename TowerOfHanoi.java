public class TowerOfHanoi {
    public void m(int n,char s,char a,char d){
        if(n==1){
            System.out.println("disk "+n+" move from "+s+" to "+d);
        }
        else{
            m(n-1,s,d,a);
            System.out.println("disk "+n+" move from "+s+" to "+d);
            m(n-1,a,s,d);
        }
    }

    public static void main(String[] args) {
        TowerOfHanoi t=new TowerOfHanoi();
        t.m(2,'A','B','C');
    }
}
