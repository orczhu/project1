package com.zhu.project1.controllers;

import com.zhu.project1.models.Speaker;
import com.zhu.project1.repo.SpeakerRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/speaker")
public class SpeakerController {
    @Autowired
    private SpeakerRepo speakerRepo;

    @GetMapping
    public List<Speaker> list() {
        return speakerRepo.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Speaker get(Long id) {
        return speakerRepo.getOne(id);
    }

    @PostMapping
    public Speaker create(@RequestBody Speaker speaker) {
        return speakerRepo.saveAndFlush(speaker);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        speakerRepo.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Speaker update(@PathVariable Long id, @RequestBody Speaker speaker) {
        Speaker current = speakerRepo.getOne(id);
        BeanUtils.copyProperties(speaker, current, "speaker_id");
        return speakerRepo.saveAndFlush(current);
    }
}
