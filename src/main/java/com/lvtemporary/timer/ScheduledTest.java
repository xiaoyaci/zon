package com.lvtemporary.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author : hjq
 * @description
 * @date : 2020/6/2
 */
@Component
public class ScheduledTest {

    //    @Scheduled(cron = "0/5 * * * * *")
    public void cacheFinance() {
        System.err.println("bbz!!!!!!!!!!!!!!!!!!");
    }


}

