package com.lambdaschool.javabookstore.controller;

import com.lambdaschool.javabookstore.model.Section;
import com.lambdaschool.javabookstore.repo.SectionRepo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/sections", produces = MediaType.APPLICATION_JSON_VALUE)
public class SectionController
{

    @Autowired
    SectionRepo sectionRepo;

    @ApiOperation(value = "Returns a list of all sections.", response = List.class)
    @GetMapping(value = "")
    public List<Section> listAllSections()
    {
        return sectionRepo.findAll();
    }
}