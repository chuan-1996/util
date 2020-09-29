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
public class getCatalan {

    public static int get(int n) {
        int s = 1;
        for(int i = n+1; i <=n+n;i++){
        	s *=i;
        	s /=i-n;
        }
        s /=n+1;
        return s;
    }

}
