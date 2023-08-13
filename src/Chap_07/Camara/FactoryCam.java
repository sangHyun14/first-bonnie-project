package Chap_07.Camara;
// FactoryCam is a Camara ( IS - A)
public class FactoryCam extends Camara{ // 자식 클래스

    public FactoryCam() {
        //this.name = "공장 카메라";
        super("공장 카메라");
    }
    public void recodeVideo(){
       super.recodeVideo();
        detectFire();
    }
    public void detectFire(){
        System.out.println("화재를 감지합니다.");
    }
    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능: " +
                "화재 감지");
    }
}
