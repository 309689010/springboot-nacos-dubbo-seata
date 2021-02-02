package com.egg.core.test;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Lombok {
    private String userId;
    private String userName;

    public static void inLog() {
        log.info("***************** Hello World *****************");
    }
}
