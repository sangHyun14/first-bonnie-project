package Chap_07;

import Chap_07.Camara.FactoryCam;
import Chap_07.Camara.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recodeVideo();
        System.out.println("----------");
        speedCam.takePicture();
    }
}
