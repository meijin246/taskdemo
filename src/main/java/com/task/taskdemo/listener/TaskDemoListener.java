package com.task.taskdemo.listener;

import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.cloud.task.repository.TaskExecution;

public class TaskDemoListener implements TaskExecutionListener {
    @Override
    public void onTaskStartup(TaskExecution taskExecution) {
        System.out.println("begin task");
        System.out.println("task: "+taskExecution.getTaskName());
    }

    @Override
    public void onTaskEnd(TaskExecution taskExecution) {
        System.out.println("end task");
    }

    @Override
    public void onTaskFailed(TaskExecution taskExecution, Throwable throwable) {

    }
}
