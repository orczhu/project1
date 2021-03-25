package com.zhu.project1.repo;

import com.zhu.project1.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepo extends JpaRepository<Speaker, Long> {
}
