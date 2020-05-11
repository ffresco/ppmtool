/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.agileintelligence.ppmtool.repositories;

import io.agileintelligence.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fafre
 */
@Repository
public interface ProjectRepository extends CrudRepository<Project,Long>{

    @Override
    Iterable<Project> findAllById(Iterable<Long> itrbl);
    
    Project findByProjectIdentifier(String projectID);

    
    
}
