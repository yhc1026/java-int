public class JDKVersionChecker {

    public static void main(String[] args) {
        // 获取并打印JDK版本
        String jdkVersion = System.getProperty("java.version");
        System.out.println("JDK版本为: " + jdkVersion);

        // 额外：获取Java运行时的详细信息
        String javaVendor = System.getProperty("java.vendor");
        String javaVmName = System.getProperty("java.vm.name");
        String javaVmVersion = System.getProperty("java.vm.version");

        System.out.println("Java供应商: " + javaVendor);
        System.out.println("Java虚拟机名称: " + javaVmName);
        System.out.println("Java虚拟机版本: " + javaVmVersion);
    }
}
