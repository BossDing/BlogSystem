package com.duan.blogos.service.service.common;

/**
 * Created on 2018/9/14.
 *
 * @author DuanJiaNing
 */
public interface OnlineService {

    /**
     * 获得登录博主id，未登录返回-1
     */
    int getLoginBloggerId(String token);

}