package week4.task1;

public class HoaQua{
    private String origin, shape;

    public HoaQua() {
        origin = "Vietnam";
        shape = "sphere";
    }

    //TODO: getters & setters
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getShape() {
        return shape;
    }
    public void setShape(String shape) {
        this.shape = shape;
    }

    public boolean isHealthy(){
        return true;
    }

    public static void main(String[] args){
        HoaQua hoaQua = new HoaQua();
        Cam cam = new Cam();
        Tao tao = new Tao();
        CamSanh camSanh = new CamSanh();
        CamThanhPhong camThanhPhong = new CamThanhPhong();

        System.out.println(hoaQua.isHealthy());
        cam.setOrigin("Heaven");
        tao.setOrigin("TheWitch");
        camSanh.setTaste("excellent");
        System.out.println(camSanh.isForExporting());
        camThanhPhong.setProduction(250);
        System.out.println(camThanhPhong.isForExporting());

    }
}