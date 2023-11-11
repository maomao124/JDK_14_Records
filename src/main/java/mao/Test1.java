package mao;

/**
 * Project name(项目名称)：JDK_14_Records
 * Package(包名): mao
 * Class(类名): Test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/9
 * Time(创建时间)： 17:26
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test1
{
    public static void main(String[] args)
    {
        People2 people2 = new People2("张三",17);
        System.out.println(people2);
        System.out.println(people2.name());
        System.out.println(people2.age());
        System.out.println(people2.hashCode());
        System.out.println(people2.equals(new People2("张三",18)));
        System.out.println(people2.equals(new People2("张三2",17)));
        System.out.println(people2.equals(new People2("张三",17)));
    }
}
