package com.github.jspang582.jdk.string;

import org.junit.Test;

/**
 * 字符串测试
 * <pre>
 *     现在我们知道intern方法就是将字符串保存到常量池中，在保存字符串到常量池的过程中会先查看常量池中是否已经存在相等的字符串，如果存在则直接使用该字符串。
 *  所以我们在写业务代码的时候，应该尽量使用字符串常量池中的字符串，比如使用String s = "1";比使用new String("1");更节省内存。我们也可以使用String s  = *   一个String类型的对象.intern();方法来间接的使用字符串常量，这种做法通常用在你接收到一个String类型的对象而又想节省内存的情况下，当然你完全可以String s  = *一个String类型的对象;但是这么用可能会因为变量s的引用而影响String类型对象的垃圾回收。所以我们可以使用intern方法进行优化，但是需要注意的是intern能节省内存，但是会影响*运行速度，因为该方法需要去常量池中查询是否存在某字符串。
 * </pre>
 *
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/10/19 16:06
 * @see <link>https://www.yuque.com/renyong-jmovm/ds/ffbz0p</link>
 */
public class StringTest {

    /**
     * 相等
     */
    @Test
    public void test() {
        String s1 = "123";
        String s2 = new String("123");
        System.out.println(s1 == s2); // false
    }

    /**
     * String.intern()
     * <pre>
     * 对于new String("1")，会生成两个对象，一个是String类型对象，它将存储在Java Heap中，另一个是字符串常量对象"1"，它将存储在字符串常量池中。
     * s.intern()方法首先会去字符串常量池中查找是否存在字符串常量对象"1"，如果存在则返回该对象的地址，如果不存在则在字符串常量池中生成为一个"1"字符串常量对象，并返回该对    * 象的地址。
     * </pre>
     */
    @Test
    public void testIntern1() {
        String s = new String("1");
        String s1 = s.intern();
        System.out.println(s == s1); // false
    }

    /**
     * s1 == s2为true，表示变量s2是直接指向的字符串常量
     */
    @Test
    public void testIntern2() {
        String s = new String("1");
        String s1 = s.intern();
        String s2 = "1";
        System.out.println(s == s1); // false
        System.out.println(s1 == s2); // true
    }

    /**
     * <pre>
     *     s == t为false，这个很明显,变量s和变量t指向的是不同的两个String类型的对象。
     *     s.intern() == t.intern()为true，因为intern方法返回的是字符串常量池中的同一个"1"对象，所以为true。
     * </pre>
     */
    @Test
    public void testIntern3() {
        String s = new String("1");
        String t = new String("1");
        String s1 = s.intern();
        String s2 = "1";
        System.out.println(s == s1); // false
        System.out.println(s1 == s2); // true
        System.out.println(s == t);   // false
        System.out.println(s.intern() == t.intern());   // true
    }

    /**
     * <pre>
     *     变量x为两个String类型的对象相加，因为x != s3，所以x肯定不是指向的字符串常量，实际上x就是一个String类型的对象，调用x.intern()方法将返回"11"对应的字符串常     *     量，所以x.intern() == s3.intern()为true。
     * </pre>
     */
    @Test
    public void testIntern4() {
        String s = new String("1");
        String t = new String("1");
        String x = new String("1") + new String("1");
        String s1 = s.intern();
        String s2 = "1";
        String s3 = "11";
        System.out.println(s == s1); // false
        System.out.println(s1 == s2); // true
        System.out.println(s == t); // false
        System.out.println(s.intern() == t.intern()); // true
        System.out.println(x == s3);  // fasle
        System.out.println(x.intern() == s3.intern());  // true
    }

    /**
     * <pre>
     *     x == s3为false表示x指向String类型对象，s3指向字符串常量;
     *    x1 == s3为false表示x1指向String类型对象，s3指向字符串常量;
     *    x2 == s3为true表示x2指向字符串常量，s3指向字符串常量;
     * </pre>
     */
    @Test
    public void testIntern5() {
        String x = new String("1") + new String("1");
        String x1 = new String("1") + "1";
        String x2 = "1" + "1";
        String s3 = "11";

        System.out.println(x == s3);  // false
        System.out.println(x1 == s3);  // false
        System.out.println(x2 == s3); // true
    }

}
