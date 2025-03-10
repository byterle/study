package designPatterns.singleton;

/**
 * 内部类单例模式
 * JVM内部的机制能够保证当一个类被加载的时候,这个类的加载过程是线程互斥的
 * 这样当我们第一次调用getInstance的时候,JVM能够帮我们保证instance只被创建一次
 * 并且会保证把赋值给instance的内存初始化完毕
 */
public class InnerClassSingleton {
    private InnerClassSingleton() {}

    private static class InnerClassSingletonFactory {
        private static InnerClassSingleton uniqueSingleton = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassSingletonFactory.uniqueSingleton;
    }
}
