package com.yyz.jmockit.demo1;

// 用户身份校验
public interface UserCheckService2_4_3 {

    /**
     * 校验某个用户是否是合法用户
     *
     * @param userId
     *            用户ID
     * @return 合法的就返回true,否则返回false
     */
    public boolean check(long userId);
}//订单服务类 ,用于下订单