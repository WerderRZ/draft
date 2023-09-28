package Schildt.part_12_Enum_Autoboxing_Annotation.p12;

@Service(name = "LazyServiceName")
public class LazyService {
    @Init
    public void lazyInit() throws Exception {
        System.out.println("it's lazy init");
    }
}
