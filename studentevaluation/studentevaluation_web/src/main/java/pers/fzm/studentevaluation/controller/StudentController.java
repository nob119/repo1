package pers.fzm.studentevaluation.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pers.fzm.studentevaluation.domain.Student;
import pers.fzm.studentevaluation.domain.StudentScores;
import pers.fzm.studentevaluation.service.StudentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@SessionAttributes("pageInfo")
@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/allStudents")
    public ModelAndView findAllStudent(@RequestParam(name = "page",defaultValue = "1")int pageNum, @RequestParam(name = "size",defaultValue = "4")int pageSize){
        ModelAndView mv = new ModelAndView();
        List<Student> students = studentService.findAll(pageNum,pageSize);
        PageInfo pageInfo = new PageInfo(students);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("students");
        return mv;
    }

    @RequestMapping("/addStudent")
    public @ResponseBody
    Map<String,String> addStudent(@RequestBody Student student){
        Map<String,String> data = new HashMap<>();
        if (studentService.findStudent(student.getStudentId()) != null){
            data.put("flag","fail");
        }else {
            studentService.addStudent(student);
            data.put("flag","success");
        }
        return data;
    }

    @RequestMapping("/studentDetails")
    public ModelAndView studentDetails(@RequestParam(name = "id") String studentId){
        ModelAndView mv = new ModelAndView();
        Student student = studentService.findStudent(studentId);
        mv.addObject("student",student);
        mv.setViewName("student_details");
        return mv;
    }

    @RequestMapping("/removeStudent")
    public String removeStudent(@RequestParam(name = "id") String studentId){
        studentService.removeStudent(studentId);
        return "redirect:allStudents";
    }

    @RequestMapping("/editStudent")
    public ModelAndView editStudent(@RequestParam(name = "id") String studentId){
        ModelAndView mv = new ModelAndView();
        Student student = studentService.findStudent(studentId);
        mv.addObject("student",student);
        mv.setViewName("student_edit");
        return mv;
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(Student student){
        studentService.updateStudent(student);
        return "redirect:allStudents";
    }

    @RequestMapping("/removeStudents")
    public String removeStudents(String tag){
        String[] studentIds = tag.split(",");
        System.out.println(tag);
        for (String studentId : studentIds) {
            System.out.println(studentId);
        }
        studentService.removeStudents(studentIds);
        return "redirect:allStudents";
    }

    @RequestMapping("/studentSearch")
    public ModelAndView studentSearch(@RequestParam(name = "page",defaultValue = "1")int pageNum,
                                      @RequestParam(name = "size",defaultValue = "4")int pageSize,
                                      @RequestParam(name = "val") String val){
        ModelAndView mv = new ModelAndView();
        List<Student> students = studentService.studentSearch(pageNum, pageSize, val);
        PageInfo pageInfo = new PageInfo(students);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("students");
        return mv;
    }





}
