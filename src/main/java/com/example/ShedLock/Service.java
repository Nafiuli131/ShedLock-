package com.example.ShedLock;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

@org.springframework.stereotype.Service
public class Service {

    @Scheduled(cron = "*/2 * * * * *")
    @SchedulerLock(name = "uniqueTaskName",lockAtMostFor = "5m",lockAtLeastFor = "2s")
    public void service(){
        System.out.println("Executing scheduled task at: " + LocalDateTime.now());
    }
}
