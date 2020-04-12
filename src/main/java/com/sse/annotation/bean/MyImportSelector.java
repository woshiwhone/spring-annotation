package com.sse.annotation.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author yf.xiang
 * @date 2020-04-12 15:47
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // TODO Auto-generated method stub
        //importingClassMetadata
        //方法不要返回null值
        return new String[]{"com.sse.annotation.bean.Blue","com.sse.annotation.bean.Yellow"};
    }
}
