package com.mazh.ssm.controller;

import com.mazh.ssm.pojo.GroupAge;
import com.mazh.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * 作者： 马中华   https://blog.csdn.net/zhongqi2513
 * 时间： 2018/11/18 18:47
 * 描述： Echarts测试页面
 */
@Controller
@RequestMapping("/echarts")
public class EchartsController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/index.do")
    public String index(){
        return "echarts/echartsIndex";
    }


    @RequestMapping("/groupAge.do")
    public String groupAge(HttpServletRequest request){

        List<GroupAge> ageCountList = null;
        try {
            ageCountList = studentService.groupByAge();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(ageCountList.size() + " ==========================================");

        int[] ages = new int[ageCountList.size()];
        int[] counts = new int[ageCountList.size()];

        int index = 0;
        for(GroupAge ga : ageCountList){
            ages[index] = ga.getAge();
            counts[index] = ga.getCount();
            index++;
        }

        request.setAttribute("ages", Arrays.toString(ages));
        request.setAttribute("counts", Arrays.toString(counts));
        return "echarts/groupByAge";
    }

    @RequestMapping("/echarts.do")
    public String echars(){

        return "echarts/echarts";
    }

}
