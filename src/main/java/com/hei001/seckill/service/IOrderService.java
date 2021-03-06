package com.hei001.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hei001.seckill.pojo.Order;
import com.hei001.seckill.pojo.OrderInfo;
import com.hei001.seckill.pojo.User;
import com.hei001.seckill.vo.GoodsVo;
import com.hei001.seckill.vo.OrderDetailVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author HEI001
 * @since 2022-02-28
 */
public interface IOrderService extends IService<Order> {
    /**
     *
     * 秒杀商品
     * @param user
     * @param goodsVo
     * @return
     */
    OrderInfo seckill(User user, GoodsVo goodsVo);

    /**
     * 获取秒杀结果
     * @param user
     * @param goodsId
     * @return
     */
    Long getResult(User user, Long goodsId);

    /**
     * 获取秒杀地址
     * @param user
     * @param goosId
     * @return
     */
    String createPath(User user, Long goosId);

    /**
     * 校验秒杀地址
     * @param user
     * @param goodsId
     * @return
     */
    boolean checkPath(User user, Long goodsId, String path);

    /**
     * 校验验证码
     * @param user
     * @param goodsId
     * @param captcha
     * @return
     */
    boolean checkCaptcha(User user, Long goodsId, String captcha);

}
