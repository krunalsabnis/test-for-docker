/**
 * 
 */
package com.kru.poc.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:krunalsabnis@gmail.com">Krunal Sabnis</a>
 * 
 * Service Layer for Project
 * 
 */
@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepo;
	
	public Page<ProjectRecord> getProject(Pageable pageable) {
		return projectRepo.findAll(pageable);
	}

}
