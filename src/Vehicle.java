public class Vehicle {
    String name;

    int benz;

    int speed;

    boolean Plane;


    public class Lada  {
    }



        public interface Flyable {
            abstract void fly();

            abstract void landing();
        }

        public class Plane extends Vehicle {
            Flyable sc = new Flyable() {
                @Override
                public void fly() {
                    System.out.println("Машина взлетела !");
                }

                @Override
                public void landing() {
                    System.out.println("...Машина плавно села...");
                }
            };
            public interface Driving {
                abstract void Drive();

                abstract void Stop();
            }
            public class Lada extends Vehicle {
                Driving sc = new Driving() {
                    @Override
                    public void Drive() {
                        System.out.println("Машина плавно поехала ");
                    }

                    @Override
                    public void Stop() {
                        System.out.println("...Машина плавно остановилсь...");
                    }


                };
            }
    }
}



