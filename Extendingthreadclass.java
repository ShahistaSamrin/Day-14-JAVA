class a extends Thread{
    public void r()
    {
        System.out.println("Hello i'm thread");
    }
}
class Extendingthreadclass{
    public static void main(String args[]){
        a g=new a();
        g.r();
        g.start();
    }
}