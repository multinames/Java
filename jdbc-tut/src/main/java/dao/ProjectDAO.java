package dao;

import entity.Project;

import java.util.List;

public interface ProjectDAO {
    // create
    void add (Project project);

    //read
    List<Project> getAll();

    Project getById(long id);

    //update
    void update (Project project);

    //delete

    void delete (Project project);

}
