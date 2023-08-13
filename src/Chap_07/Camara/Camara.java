package Chap_07.Camara;

public class Camara { // 부모 클래스
    public String name;

    public Camara() {
        this("카메라");
    }
    protected Camara(String name){
        this.name = name;
    }
    public void takePicture(){
        System.out.println(this.name + ": 사진을 촬영합닌다");
        // 사진 촬영

    }
    public void recodeVideo(){
        System.out.println(this.name + ": 동영상을 녹화합니다");
        // 동영상 녹화
    }
    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능: " +
                "사진 촬영 , 동영상 녹화");
    }
}