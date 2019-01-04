package com.yyz.jmockit.demo1;

import javax.annotation.Resource;

public class OrderService2_4_4 {
    // 邮件服务类，用于向某用户发邮件。
    MailService2_4_2 mailService;

    // 用户身份校验类，用于校验某个用户是不是合法用户
    @Resource
    UserCheckService2_4_3 userCheckService;

    // 构造函数
    public OrderService2_4_4(MailService2_4_2 mailService) {
        this.mailService = mailService;
    }

    /**
     * 下订单
     *
     * @param buyerId
     *            买家ID
     * @param itemId
     *            商品id
     * @return 返回 下订单是否成功
     */
    public boolean submitOrder(long buyerId, long itemId) {
        // 先校验用户身份
        if (!userCheckService.check(buyerId)) {
            // 用户身份不合法
            return false;
        }
        // 下单逻辑代码，
        // 省略...
        // 下单完成，给买家发邮件
        if (!this.mailService.sendMail(buyerId, "下单成功")) {
            // 邮件发送成功
            return false;
        }
        return true;
    }
}
