package ooophomework;

public abstract class AbstractPhone {

    public String [] phoneBrand = {"iphone", "Motorola", "Sumsung", "Huawei"};

    public void phonelist() {
        System.out.println("phonelist functionality --- from AbstractPhone");
        System.out.println(phoneBrand [2]);
    }

    public void phonebrand() {
        System.out.println(phoneBrand [0]);

    }
}
