package personalportfolio.personalportfolio.controllers;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.annotation.Resource;
import personalportfolio.personalportfolio.services.PortfolioService;

@Controller
public class MainController {
    
    @Resource
    private PortfolioService portfolioService;

    
    public MainController(PortfolioService portfolioService){
        this.portfolioService = portfolioService;
    }

    @GetMapping({"","/", "/homepage"})
    public String Homepage() {
        return "homepage";
    }

    @GetMapping("/timeline")
    public String Timeline(Model model) {
        return "timeline";
    }

    @GetMapping("/projects")
    public String Projects(Model model) {
        return "projects";
    }
}
