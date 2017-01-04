/**
 * Created by shengxiaopeng on 2017/1/4.
 *
 * 由于不确定这个类是否有不带参数的构造函数，
 * 所以不能用classz.newInstance()来实例化，
 * 然后再用instanceof来判断是否等于于某个接口类。。。有什么办法吗？
 *
 *
              Class<?> theClass = Class.forName("...");
             if (MyInterface.class.isAssignableFrom(theClass)) {
             // theClass 实现了 MyInterface
             // ...
             } else {
             // theClass 没有实现 MyInterface
             // ...
             }
 *
 *
 */
public class Test1 implements MyInterface {
    public static void main(String[] args) {
        boolean assignableFrom = MyInterface.class.isAssignableFrom(Test1.class);
        System.out.println(assignableFrom);

        boolean assignableFrom1 = Comparable.class.isAssignableFrom(Test1.class);
        System.out.println(assignableFrom1);

    }
}


interface MyInterface{

}
