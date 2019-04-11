package ooophomework;

public class WorkingPhone extends AbstractPhone implements InterfacePhone1, InterfacePhone2 {

    public void phonelist(){
        System.out.println("phonelist functionality --- from WorkingPhone");
    }

    @Override
    public void phonebrand() {
        System.out.println(phoneBrand [1]);
    }

    @Override
    public void phonecolor(){

    }

    @Override
    public void phonesize(){

    }


    public void phoneprice(){
        System.out.println("phoneprice functionality --- from InterfacePhone1");
    }

    @Override
    public void phoneuser(){
        System.out.println("phoneuser functionality --- from InterfacePhone2");
    }
}
