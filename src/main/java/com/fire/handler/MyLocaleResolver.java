package com.fire.handler;

import com.alibaba.druid.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 *  TODO MyLocaleResolver 定义国际化解析器
 *
 * @author: Bruce
 * @date: 2020/3/23
 */

public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        // 获取默认的国际化解析器
        Locale locale = Locale.getDefault();
        // 获取请求参数
        String language = httpServletRequest.getParameter("language");

        if (!StringUtils.isEmpty(language)) {
            String[] split = language.split("_");
            locale = new Locale(split[0],split[1]);
        }

        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
