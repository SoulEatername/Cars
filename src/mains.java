public class mains {
    public static void main(String[] args) {
       Lada b = new Lada("Лада","Калина Кросс","...Машина плавно прехала...",
               "...Машина приехала и плавно остановилась...");

       b.getModel();
       b.getVid();
       b.getDrive();
       b.getStop();

        System.out.println(" ");

       Hummer c = new Hummer("Hummer","Model X","Машина выехала в отед запчастей",
               "...Машина плавно остановилась...");
       c.getModel();
       c.getVid();
       c.getDrive();
       c.getStop();

       c.getStop();

        }
    }
