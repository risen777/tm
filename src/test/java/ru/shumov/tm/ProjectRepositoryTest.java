package ru.shumov.tm;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.shumov.tm.entity.Project;
import ru.shumov.tm.repository.ProjectRepository;

import java.util.UUID;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProjectRepositoryTest {

    @Autowired
    private ProjectRepository projectRepository;

    @Test
    public  void testSave(){
        final Project project =new Project();
        project.setName(UUID.randomUUID().toString());
        projectRepository.saveAndFlush(project);
        Assert.assertNotNull(projectRepository.findById(project.getId()));
    }
@Test
    public  void testFindAll(){
        Assert.assertNotNull(projectRepository);
}


}
