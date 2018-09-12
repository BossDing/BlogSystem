package com.duan.blogos.api.blog;

import com.duan.blogos.api.BaseCheckController;
import com.duan.blogos.service.manager.properties.AudienceProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created on 2017/12/26.
 * 该家族中的结果数据是依附于博文的，博主无效登录即可获取
 *
 * @author DuanJiaNing
 */
public class BaseBlogController extends BaseCheckController {

    @Autowired
    protected AudienceProperties audienceProperties;

}
