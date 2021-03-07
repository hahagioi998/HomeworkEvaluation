package com.buguagaoshu.homework.evaluation.controller;

import com.buguagaoshu.homework.common.domain.ResponseDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pu Zhiwei {@literal puzhiweipuzhiwei@foxmail.com}
 * create          2020-10-03 22:46
 */
@RestController
public class TestRoleControllrt {


    @GetMapping("/test/func")
    public ResponseDetails role() {

        return ResponseDetails.ok().put("data", SecurityContextHolder.getContext().getAuthentication());
    }
}
