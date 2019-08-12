package org.ougen.smdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.AntPathMatcher;

@RunWith(JUnit4.class)

public class SmdemoApplicationTests {
    private AntPathMatcher antPathMatcher = new AntPathMatcher();
    @Test
    public void contextLoads() {
        assert antPathMatcher.match("/aa/{id}/mm","/aa/ss/mm"):"匹配错误";
    }

}
