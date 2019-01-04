package com.yyz.jmockit.demo1;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;
import org.junit.Assert;
import org.junit.Test;

//JMockit的程序结构
public class ProgramConstructureTest1_1 {

//    // 这是一个测试属性
//    @Mocked
//    HelloJMockit helloJMockit;
//
//    @Test
//    public void test1() {
//        // 录制(Record)
//        new Expectations() {
//            {
//                helloJMockit.sayHello();
//                // 期待上述调用的返回是"hello,david"，而不是返回"hello,JMockit"
//                result = "hello,david";
//            }
//        };
//        // 重放(Replay)
//        System.out.println("***");
//        String msg = helloJMockit.sayHello();
//        System.out.println("Replay::"+msg);
//        Assert.assertTrue(msg.equals("hello,david"));
//        // 验证(Verification)
//        new Verifications() {
//            {
//                helloJMockit.sayHello();
//
//                times = 1;
//            }
//        };
//    }

    @Test
    public void test2(@Mocked HelloJMockit helloJMockit /* 这是一个测试参数 */) {
        // 录制(Record)
        new Expectations() {
            {
                helloJMockit.sayHello();
                // 期待上述调用的返回是"hello,david"，而不是返回"hello,JMockit"
                result = "hello,david";
            }
        };
        // 重放(Replay)
        String msg = helloJMockit.sayHello();
        Assert.assertTrue(msg.equals("hello,david"));
        Assert.assertEquals("hello,david",helloJMockit.sayHello());
        System.out.println("mywWUA71T1YsFh7sT7qGujYsFhPC5H0huAbqrauGTdq9TZ0qnauJp1YdujfLn16YPvcYmWbLnj7-Fh_qFRcdFRwKFRn3FRuDFRcLFRFDFRfvFRDLFRc3FRcvFRndFRndFRn1FRuaFh_s5iNaPiNDfiNjraNAwaNaPzNawaNDPBNKPzNaraNaPBNjPiNjPiNjnzNAfBuonHY-fWR-wDD-f16-wbf-fWT-fbf-wjm-fHT-fW6-fWm-fYm-fWR-fYf-fWnhp1cqFRcYFRuKFRnsFRNDFRcdFRwKFRn3FRuDFRcLFRFDFRfvFRDLFRc3FRcvFh_15iNaPiNDfiNjraNAwaNaPzNawaNDPBNKPzNaraNaPBNariNKfBNjfBNawiNjPiNjPiNjnzNAfBu_IyVG5HDhUyPsUHYknjmzPW6hTHdWTvw8mh7GuZNxmLKzFMFB5H0hTMnqniu1uyk_ugFxpyfqniu1pyfqnyRLnAc4mWfYP1n3PjTduau1IA-b5HRhIjdYTAP_pyPouyf1gv9WFMwb5HnYrjmsnjchIAd15HDdPjmdrjTzPjchIZRqIHnYrjmsnjchIHdCIZwsTzR1fiRzwBRzwhF_UvT-nbNWTvw8FHF7UhNYFMmqniuG5yn4rAf1PH7B".length());
        // 验证(Verification)
        new Verifications() {
            {
                helloJMockit.sayHello();
                // 验证helloJMockit.sayHello()这个方法调用了1次
                //times = 1;
            }
        };


    }
}