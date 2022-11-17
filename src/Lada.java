public class Lada {

    int benz;
    int speed;
    boolean fly;

    String Drive;

    String Stop;

    String vid;

    String model;

    Lada(String model,String vid,String Drive,String Stop) {
        this.model = model;
        this.vid = vid;
        this.Drive = Drive;
        this.Stop = Stop;
    }
    public void getModel() {
        System.out.println(model);
    }
    public void getVid() {
        System.out.println(vid);
    }
    public void getDrive() {
        System.out.println(Drive);
    }
    public void getStop() {
        System.out.println(Stop);
    }
}
