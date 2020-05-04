package kd.javaPractice;

public class TestPackage {

    public int getTestInt() {
        return testInt;
    }

    public void setTestInt(int testInt) {
        this.testInt = testInt;
    }

    public int testInt;

    public TestPackage()
    {
        setTestInt(3);
        System.out.println("In TestPackage class constructor");
    }
}
