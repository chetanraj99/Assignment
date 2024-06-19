package designpatterns;

public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        // Check access control or other conditions before granting access to the real object
        if (checkAccess()) {
            if (realSubject == null) {
                realSubject = new RealSubject();
            }
            realSubject.request();
        } else {
            System.out.println("Proxy: Access denied.");
        }
    }

    private boolean checkAccess() {
        // Simulate access control logic
        return false;
    }
}
