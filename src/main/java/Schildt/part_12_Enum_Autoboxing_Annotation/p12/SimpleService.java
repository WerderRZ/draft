package Schildt.part_12_Enum_Autoboxing_Annotation.p12;

@Service(name = "SimpleServiceName")
public class SimpleService {

    public SimpleService(String textMessage) {
        System.out.println("Create Simple Service: " + textMessage);
    }

//    public SimpleService() {
//
//    }


    @Init
    public void initService() {
        System.out.println("it's init service");
    }

    public void otherMethod() {
        System.out.println("it's other method");
    }
}
