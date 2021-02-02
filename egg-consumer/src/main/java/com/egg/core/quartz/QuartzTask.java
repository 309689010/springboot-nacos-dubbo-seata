package com.egg.core.quartz;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author TengZhongBin
 * @since 2019/05/17
 */
@Service
@EnableScheduling
@Slf4j
public class QuartzTask {

    /** 测试从0分开始每1分钟执行1次 */
    @Scheduled(cron = "0 0/1 * * * *")
    public void testTask() {
        long mb = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
        long total = runtime.totalMemory() / mb;
        long max = runtime.maxMemory() / mb;
        long free = runtime.freeMemory() / mb;
        log.info("最大内存: {}m; 已分配内存: {}m; 已分配内存中的剩余空间: {}m; 最大可用内存: {}m.", max, total, free, max - total + free);
    }
}
