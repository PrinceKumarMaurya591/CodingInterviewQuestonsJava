package org.example.ImmutableClassAndSingletonClass;

public class SingletonClass {
    private static SingletonClass instance;
    

    private SingletonClass() {
    
    }
    
    public static SingletonClass getInstance() {
    if(instance==null) {
    instance=new SingletonClass();
    }
    return instance;
    }

    public void showMessage() {
        System.out.println("Hello from SingletonClass!");
    }

    public static void main(String[] args) {
        SingletonClass singleton = SingletonClass.getInstance();
        singleton.showMessage();
    }
}
