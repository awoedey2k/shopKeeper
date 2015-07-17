package ng.com.cc.app.controllers.home;


import java.util.ArrayList;
import java.util.List;

import ng.com.cc.app.dao.SampleRepository;
import ng.com.cc.app.entity.SampleModel;
import ng.com.cc.app.services.GenericService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/app")
public class HomeController {

    private static final Log LOG = LogFactory.getLog(HomeController.class);

    @Autowired
    SampleRepository repository;

    @Autowired
    GenericService genericService;

    @RequestMapping("/home")
    public @ResponseBody String home() {
        saveRecord(new SampleModel("Chuka", "Sample Record m"));
        return "welcoming user to application...";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveRecord(SampleModel sampleModel) {
        sampleModel = repository.save(sampleModel);
        LOG.info("sampleModel saved: " + sampleModel);
        return "redirect:/app/list";
    }


    @RequestMapping(value = "/saveType2", method = RequestMethod.POST)
    public String saveRecord2(SampleModel sampleModel) {
        sampleModel = genericService.saveEntity(sampleModel);
        LOG.info("sample Model 2 saved: " + sampleModel);
        return "redirect:/app/list";
    }



    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody List<SampleModel> findAll() {
        List<SampleModel> list = new ArrayList<>();
        Iterable<SampleModel> samples = repository.findAll();
        for (SampleModel sampleModel : samples) {
            list.add(sampleModel);
        }
        return list;
    }


    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public @ResponseBody List<SampleModel> findRecord(@RequestParam String name) {
        return repository.findByName(name);
    }


    @RequestMapping(value = "/clear", method = RequestMethod.POST)
    public String findRecord() {
        repository.deleteAll();
        return "redirect:/list";
    }

    @RequestMapping("/tilepage")
    public String index() {
        LOG.debug("welcoming user to application...");
        return "mytile";
    }


    @RequestMapping("/plain")
    public String plainPage() {
        LOG.debug("welcoming user to application...");
        return "home/home";
    }
}
