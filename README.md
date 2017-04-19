# mockito简单教程入门
## 假如依赖
```xml

<!-- https://mvnrepository.com/artifact/org.mockito/mockito-all -->
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-all</artifactId>
            <version>1.8.4</version>
        </dependency>

<!-- https://mvnrepository.com/artifact/junit/junit -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>

```
## java 代码 （待完成） 
```java
public class TestJava {

    @Test
    public void testMock(){

        //模拟创建一个List对象
        List mockList = mock(List.class);

        //使用mock对象
        mockList.add("one");
        mockList.clear();

        //验证add("one")和clear()行为是否发生
        verify(mockList).add("one");
        verify(mockList).clear();


    }


    @Test
    public void with_arguments(){

        Comparable comparable = mock(Comparable.class);

        // 预设根据不同的参数返回不同的结果
        when(comparable.compareTo("Test")).thenReturn(1);
        when(comparable.compareTo("Omg")).thenReturn(2);
        assertEquals(1,comparable.compareTo("Test"));
        assertEquals(2,comparable.compareTo("Omg"));

        // 对于没有预设的情况会返回默认值
        assertEquals(0, comparable.compareTo("Not stub"));


    }
}

```