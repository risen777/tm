package ru.shumov.tm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shumov.tm.entity.Project;


@Repository
public interface ProjectRepository
    extends JpaRepository<Project,String>{




    }
