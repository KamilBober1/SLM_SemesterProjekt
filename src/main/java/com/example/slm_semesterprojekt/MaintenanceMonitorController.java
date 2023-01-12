package com.example.slm_semesterprojekt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController
{
    public String msg= "Everything works as expected";

    @GetMapping("/message")
    public String showMSG(){
        return msg;
    }

    @GetMapping("/message/set")
    public String changeMSG(String m)
    {
        msg=m;
        return "OK";
    }

    @GetMapping("/message/reset")
    public String resetMSG()
    {
        msg= "Everything works as expected";
        return "OK";
    }
}
