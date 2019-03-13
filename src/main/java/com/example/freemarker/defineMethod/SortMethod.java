package com.example.freemarker.defineMethod;

import freemarker.template.SimpleSequence;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *  自定义排序模板
 */
public class SortMethod implements TemplateMethodModelEx {
    @Override
    public Object exec(List list) throws TemplateModelException {
        //必须使用freemarker的list类型来接收参数后转化成list
        SimpleSequence simpleSequence= (SimpleSequence) list.get(0);
        List<BigDecimal> lists=simpleSequence.toList();
        Collections.sort(lists, new Comparator<BigDecimal>() {

            @Override
            public int compare(BigDecimal o1, BigDecimal o2) {
                return o1.intValue() - o2.intValue();
            }
        });
        return lists;
    }
}
