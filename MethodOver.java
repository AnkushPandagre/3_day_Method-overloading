class Addition{
   void add(){
   int a = 10,  b= 20;
   System.out.println(a+b);
   }
   void add(int a){
    int b= 30;
   System.out.println(a+b);
   }
   void add(int a,int b){
    // int b= 30;
   System.out.println(a+b);
   }
   void add(float a){
    float b= 30.3f;
   System.out.println(a+b);
   }
   void add(float a , float b){
    // float b= 30.3f;
   System.out.println(a+b);
   }
   void add(int a , float b){
    // float b= 30.3f;
   System.out.println(a+b);
   }

   void add(float a ,int b){
    // float b= 30.3f;
   System.out.println(a+b);
   }
   
   void add(int a ,float b ,double c){
    // float b= 30.3f;
   System.out.println(a+b+c);
   }


}
class MethodOver{
    public static void main(String[] args) {
        Addition a = new Addition();
        int x = 30,y=20;
        float p = 10.20f, q= 20.20f;
        double i = 222.22, j= 333.33;

        a.add();
        a.add(x);
        a.add(x,y);
        a.add(p);
        a.add(p,q);
        a.add(x,q);
        a.add(p,y);
        a.add(x,p,i);


    }
}