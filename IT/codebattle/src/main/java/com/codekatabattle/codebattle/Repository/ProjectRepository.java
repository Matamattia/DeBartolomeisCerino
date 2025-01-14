package com.codekatabattle.codebattle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codekatabattle.codebattle.Model.Project;


public interface ProjectRepository extends JpaRepository<Project, Integer>{
    Project findByTeam_TeamId(Integer teamId);
    Project findByGithubRepository(String githubRepository);


}
