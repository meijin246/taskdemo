package com.task.taskdemo;

import com.task.taskdemo.listener.TaskDemoListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableTask
@EnableScheduling
public class TaskdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskdemoApplication.class, args);
    }

    @Bean
    public TaskExecutionListener executionListener(){
        return new TaskDemoListener();
    }

}
