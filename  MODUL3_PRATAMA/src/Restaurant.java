public class Restaurant implements Runnable {

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int NomorMakanan = 1;

    @Override
    public void run() {
        while (true) {
            makeCoffee();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getNomorMakanan() {
        return NomorMakanan;
    }

    public void makeCoffee() {
        synchronized(Restaurant.lock) {
            // check if waitingForPickup is true so call method lock.wait() to lock for thread
            // so process not to continue before waiter deliver coffee Menunggu pelayan untuk mengantarkan
            if (this.waitingForPickup) {
                try {
                    System.out.println("Dapur: Menunggu pelayan untuk mengantarkan makanan");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            // to inform another thread that another coffee is ready to deliver
            waitingForPickup = true;
            System.out.println("Dapur:  Membuat makanan nomor " + NomorMakanan++);
            Restaurant.lock.notifyAll();
            System.out.println("Dapur: pelayan harap mengambil makanan\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}
