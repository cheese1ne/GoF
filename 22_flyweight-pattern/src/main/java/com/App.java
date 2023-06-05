package com;

import com.flyweight_pattern.simple.Flyweight;
import com.flyweight_pattern.simple.FlyweightFactory;
import com.flyweight_pattern.simple.flyweight.UnsharedConcreteFlyweight;
import com.flyweight_pattern.website.User;
import com.flyweight_pattern.website.Website;
import com.flyweight_pattern.website.WebsiteFactory;

/**
 * 享元模式：运用共享技术有效地支持大量细粒度的对象
 *
 * java.lang.String使用了享元模式
 * String str = "str";
 * String str = "str";
 *
 * Spring Bean的Scope属性为singleton的实例就是享元对象
 *
 * 适用场景：
 *  1.适用于应用程序中使用了大量的对象，且这些对象造成了很大的存储开销时
 *  2.对象的大多数状态可以是外部状态，删除对象的外部状态可以用相对较少的共享对象取代很多组对象
 *
 * 例如：围棋等棋类中包含大量的棋子对象，颜色为棋子的内部状态，外部状态为棋子所在的位置(坐标方位)
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
//        simple();
        website();
    }


    /**
     * 享元模式一个简单的例子
     */
    private static void simple() {
        int extrinsicstate = 22;
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight x = factory.getFlyweight("X");
        x.operation(--extrinsicstate);

        Flyweight y = factory.getFlyweight("Y");
        y.operation(--extrinsicstate);

        Flyweight z = factory.getFlyweight("Z");
        z.operation(--extrinsicstate);

        Flyweight unshared = new UnsharedConcreteFlyweight();
        unshared.operation(--extrinsicstate);

    }

    /**
     * 网站共享代码
     */
    private static void website() {
        WebsiteFactory factory = new WebsiteFactory();
        Website fx = factory.getWebsiteCategory("产品展示");
        fx.use(new User("小菜"));
        // 共享上方生成的产品展示对象，不再实例化
        Website fy = factory.getWebsiteCategory("产品展示");
        fy.use(new User("大鸟"));
        Website fz = factory.getWebsiteCategory("产品展示");
        fz.use(new User("娇娇"));

        Website fl = factory.getWebsiteCategory("博客");
        fl.use(new User("老顽童"));
        // 共享上方生成的博客对象，不再实例化
        Website fm = factory.getWebsiteCategory("博客");
        fm.use(new User("桃谷六仙"));
        Website fn = factory.getWebsiteCategory("博客");
        fn.use(new User("南海鳄神"));

        // 统计实例化个数
        System.out.println("网站分类总数为：" + factory.getWebsiteCount());
    }
}
