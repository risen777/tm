package ru.shumov.tm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.shumov.tm.entity.Project;
import ru.shumov.tm.services.ProjectService;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

  @GetMapping("/findAll")
  public  Iterable<Project> findALL(){
      return  projectService.findAll();
  }


  @PostMapping("/create")
    public  Project create(@RequestParam("name")String name){
      return projectService.create(name);

  }

}
