public class ThreadTest implements Runnable{
    @Override
    public void run(){
        for(int i = 1;i<=5;i++){
            System.out.println(i);
            //Thread.sleep moze baciti InterruptedException pa ga moramo staviti u try Catch
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
