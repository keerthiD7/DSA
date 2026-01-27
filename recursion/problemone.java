public class problemone {
    static int count=0;
    static void recfunction()
    {
        if(count==3)
        {
            return;
        }
        System.out.println(count);
        count++;
        recfunction();
    }
    public static void main(String[] args) {
        recfunction();   
    }
}
