package Chap_07;

import Chap_07.Camara.Camara;
import Chap_07.Camara.FactoryCam;
import Chap_07.Camara.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person: 사람
        // class Student extends person : 학생 ( 학생은 사람이다. Student is a Person)
        // class Teacher extends Person : 선생님( 선생님으 사람이다. Teacher is a Person)

        Camara camara = new Camara();
        Camara factoryCam = new FactoryCam();
        Camara speedCam = new SpeedCam(); // 부모 클래스를 붙여서 확인할수 있다

        camara.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("-----------------");

        Camara[] camaras = new Camara[3]; // 0, 1, 2
        camaras[0] = new Camara();
        camaras[1] = new FactoryCam();
        camaras[2] = new SpeedCam();

        for (Camara cam:camaras) {
            cam.showMainFeature();
        }
        System.out.println("------------------");

        if (camara instanceof  Camara){
            System.out.println("카메라 입니다!");
        }
        if (factoryCam instanceof  FactoryCam){
            ((FactoryCam)factoryCam).detectFire();
        }
        if (speedCam instanceof SpeedCam){
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam) .recognizeLicensePlate();
        }

        Object[] objs = new Object[3];
        objs[1] = new Camara();
        objs[2] = new FactoryCam();
        objs[3] = new SpeedCam();
    }
}
