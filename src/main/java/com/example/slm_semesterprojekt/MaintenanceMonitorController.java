package com.example.slm_semesterprojekt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
public class MaintenanceMonitorController
{

    public String lastUpdated=  "last updated: "+ LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    public String msg= "<center><h1>Everything works as expected</h1>" + "<br>" +lastUpdated +"</center>";

    @GetMapping("/message")
    public String showMSG(){
        return msg;
    }

    @GetMapping("/message/set")
    public String changeMSG(String m)
    {
        lastUpdated="last updated: "+ LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        msg="<center><h1>"+m+"</h1>" +"<br>" +lastUpdated +"</center>";
        return "<center><h1>OK</h1></center>";
    }

    @GetMapping("/message/reset")
    public String resetMSG()
    {
        lastUpdated="last updated: "+ LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        msg= "<center><h1>Everything works as expected</h1>" + "<br>" +lastUpdated +"</center>";
        return "<center><h1>OK</h1></center>";
    }
}
