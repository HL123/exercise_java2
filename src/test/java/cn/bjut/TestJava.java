package cn.bjut;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by huanglei on 17/4/19.
 */
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
