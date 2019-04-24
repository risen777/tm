package ru.shumov.tm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shumov.tm.entity.Project;
import ru.shumov.tm.repository.ProjectRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;



    public Project create(String name){
        final  Project project =new Project();
        project.setName(UUID.randomUUID().toString());
       project.setName(name);
        return projectRepository.saveAndFlush(project);

    }


    public <S extends Project> List<S> saveAll(Iterable<S> entities) {
        return projectRepository.saveAll(entities);
    }

    public <S extends Project> S save(S entity) {
        return projectRepository.save(entity);
    }

    public List<Project> findAll() {
        return projectRepository.findAll();
    }
}
