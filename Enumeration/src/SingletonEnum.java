public class SingletonEnum {
     enum Singleton{
        INSTACE;
        public int sum(int a ,int b)
        {
            return a+b;
        }
    }

    public static void main(String[] args) {
        Singleton.INSTACE.sum(1,2);
    }
}
