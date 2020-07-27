/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.agileintelligence.ppmtool.repositories;

import io.agileintelligence.ppmtool.domain.ProjectTask;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fafre
 */
@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask,Long>{
    
    List<ProjectTask> findByProjectIdentifierOrderByPriority(String id);
    
    ProjectTask findByProjectSequence(String sequence);
    
}
