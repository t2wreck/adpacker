package com.nasmedia.adpacker.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${run.mode}")
    private String runMode;

    @GetMapping("/")
    public String index(Model model) {
        logger.info("info");
        logger.debug("debug");
        model.addAttribute("val", "테스트 입니다.");
        model.addAttribute("runMode", runMode);

        logger.debug(runMode);
        return "index";
    }
}
