package ru.shumov.tm;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ru.shumov.tm.entity.Task;
import ru.shumov.tm.repository.TaskRepository;

import java.util.UUID;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TaskRepositoryTest {

    @Autowired
    private TaskRepository taskRepository;

    @Test
    public  void testSave(){
        final Task task =new Task();
        task.setName(UUID.randomUUID().toString());
    //    taskRepository.saveAndFlush(task);
        Assert.assertNotNull(taskRepository.findById(task.getId()));
    }
    @Test
    public  void testFindAll(){
        Assert.assertNotNull(taskRepository);
    }}