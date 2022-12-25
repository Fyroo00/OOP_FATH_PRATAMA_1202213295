public class Waiter implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int coffeePrice = 25000;

    public Waiter(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }



    @Override
    public void run() {
        // call getCoffee method and pending it to 5000 ms
        while (true) {
            getCoffee();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Nomor Customer: " + this.customerID);
        System.out.println("Nomor pesanan: " + this.orderQty);
        System.out.println("Total harga: " + this.orderQty * coffeePrice);
        System.out.println("==========================================================");
    }
    // create synchronized method getCoffee

    public void getCoffee() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Pelayan: Makanan siap untuk diantarkan");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);

            // check if value of getNomorMakanan form Restaurant class is equal to orderQty
            // if same, call method orderInfo() to print order info and exit the program
            if (Restaurant.getNomorMakanan() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("pelayan: Meminta dapur untuk membuat makanan lagi\n");

        }
    }
}
