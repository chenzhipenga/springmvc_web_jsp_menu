package beilei.report.controller;

import beilei.report.service.ReportBaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class ReportBaseInfoController {
    @Autowired
    private ReportBaseInfoService reportBaseInfoService;


}
