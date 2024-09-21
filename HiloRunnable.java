public class HiloRunnable implements Runnable{
    private String corredor;
    private int nokm;
    public HiloRunnable(String corredor, int nokm){
        this.corredor = corredor;
        this.nokm = nokm;

    }
    public void run(){
        for (int i=1; i <= nokm; i++){
            System.out.println(corredor + " alcanzo " + i + " km recorridos ");
            try{
                Thread.sleep(1500);
            }catch(Exception err){
                System.out.println(err);
            }
        }
    }

    public static void main(String[] tesji){
        Thread corredor1 = new Thread(new HiloRunnable("jehiel",10));
        Thread corredor2 = new Thread(new HiloRunnable("fabiola",10));
        Thread corredor3 = new Thread(new HiloRunnable("josue",10));

        corredor1.start();
        corredor2.start();
        corredor3.start();
    }
}
