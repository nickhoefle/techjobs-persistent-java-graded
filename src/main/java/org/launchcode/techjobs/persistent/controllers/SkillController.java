package org.launchcode.techjobs.persistent.controllers;

import org.launchcode.techjobs.persistent.models.data.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.persistence.Entity;

@Controller
public class SkillController {

    @Autowired
    private SkillRepository skillRepository;

    public String index () {
        return "";
    }

    public String displayAddSkillForm () {
        return "";
    }


    public String processAddSkillForm () {
        return "";
    }

    public String displayViewSkill () {
        return "";
    }

}
