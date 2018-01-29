package com.fibinachisequense.fibinnachi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
    @RequestMapping("/getnum")
    public String showfibona(@RequestParam("num") int num) {

        String febseq = "";
        int i;
        int[] feb = new int[num];
        feb[0] = 0;
        feb[1] = 1;
        feb[2] = 2;
        feb[3] = feb[2]+feb[1];

        for ( i = 4; i < num; i++) {
            feb[i] = feb[i - 1] + feb[i - 2]+feb[i-3]+feb[i-4];
            febseq =febseq+Integer.toString(feb[i]) + "  ";

        }

        return Integer.toString(feb[0])+" "+Integer.toString(feb[1])+"  "+Integer.toString(feb[2])+"  "+Integer.toString(feb[3])+ " "+febseq +  "  ";
    }
}