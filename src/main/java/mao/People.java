package mao;

/**
 * Project name(项目名称)：JDK_14_Records
 * Package(包名): mao
 * Class(类名): People
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/9
 * Time(创建时间)： 17:27
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class People
{
    private String name;
    private int age;

    public People(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o;

        if (getAge() != people.getAge()) return false;
        return getName() != null ? getName().equals(people.getName()) : people.getName() == null;
    }

    @Override
    public int hashCode()
    {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString()
    {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
