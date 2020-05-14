package com.chuan.commons;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

/*
      <!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.4</version>
        </dependency>
 */
public class isEmpty {

    public static Boolean isObjectNotEmpty(Object obj) {
        String str = ObjectUtils.identityToString(obj);
        return StringUtils.isNotBlank(str);
    }

}
