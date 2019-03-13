package com.example.freemarker.defineMethod;

import freemarker.core.Environment;
import freemarker.template.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@Service
public class MyTagDirective implements TemplateDirectiveModel {
    /**
     *
     * @param environment 表示模板处理期间的运行时环境。该对象会存储模板创建的临时变量集、模板设置的值、对数据模型根的引用等等，通常用它来输出相关内容，如Writer out = env.getOut()。
     * @param map 传递给自定义标签的参数(如果有的话)。其中map的key是自定义标签的参数名，value值是TemplateModel实例【1】。
     * @param templateModels
     * @param templateDirectiveBody
     * @throws TemplateException
     * @throws IOException
     */
    @Override
    public void execute(Environment environment, Map map, TemplateModel[] templateModels, TemplateDirectiveBody templateDirectiveBody) throws TemplateException, IOException {

    }

}
