package pers.fzm.studentevaluation.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pers.fzm.studentevaluation.domain.*;
import pers.fzm.studentevaluation.service.ScoresService;
import pers.fzm.studentevaluation.service.StudentService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/scores")
public class ScoresController {
    @Autowired
    private ScoresService scoresService;
    @Autowired
    private StudentService studentService;

    //所有学生结果显示
    @RequestMapping("/studentScores")
    public ModelAndView studentScores(@RequestParam(name = "page",defaultValue = "1")int pageNum, @RequestParam(name = "size",defaultValue = "4")int pageSize){
        ModelAndView mv = new ModelAndView();
        List<Student> students = studentService.findAll(pageNum, pageSize);
        PageInfo pageInfo = new PageInfo(students);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("scores");
        return mv;
    }

    @RequestMapping("/studentSearch")
    public ModelAndView studentSearch(@RequestParam(name = "page",defaultValue = "1")int pageNum,
                                      @RequestParam(name = "size",defaultValue = "4")int pageSize,
                                      @RequestParam(name = "val") String val){
        ModelAndView mv = new ModelAndView();
        List<Student> students = studentService.studentSearch(pageNum, pageSize, val);
        PageInfo pageInfo = new PageInfo(students);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("scores");
        return mv;
    }


    //测评结果页面显示编辑
    @RequestMapping("/evalResults/edit")
    public ModelAndView evalResultsEdit(@RequestParam(name = "id")String studentId){
        StudentEval resultsById = scoresService.findResultsById(studentId);
        ModelAndView mv = new ModelAndView();
        mv.addObject("results",resultsById);
        mv.setViewName("eval_page_edit");
        return mv;
    }

    //某一学生学习成绩详情页面
    @RequestMapping("/academicScore")
    public ModelAndView academicScore(@RequestParam(name = "id")String studentId){
        ModelAndView mv = new ModelAndView();
        List<StudentScores> scores = scoresService.findAcademicScoresById(studentId);
        mv.addObject("scores",scores);
        mv.setViewName("eval_academic");
        return mv;
    }

    //添加某一学生学习成绩
    @RequestMapping("/academicScoreEdit")
    public ModelAndView academicScoreEdit(@RequestParam(name = "id")String studentId){
        ModelAndView mv = new ModelAndView();
        List<StudentScores> scores = scoresService.findAcademicScoresById(studentId);
        mv.addObject("scores",scores);
        mv.setViewName("student_score_edit");
        return mv;
    }


    //学生测评
    @RequestMapping("/eval")
    public ModelAndView eval(@RequestParam(name = "id")String studentId){
        System.out.println(studentId);
        StudentEval resultsById = scoresService.findResultsById(studentId);
        ModelAndView mv = new ModelAndView();
        mv.addObject("results",resultsById);
        mv.setViewName("eval_page");
        return mv;
    }


    //学生学习成绩测评
    @RequestMapping("/academicScoreEval")
    public ModelAndView academicScoreEval(@RequestParam(name = "id")String studentId){
        ModelAndView mv = new ModelAndView();
        List<StudentScores> studentScores = scoresService.findCourses(studentId);
        mv.addObject("studentScores",studentScores);
        mv.setViewName("student_score_add");
        return mv;
    }

    //得到学生成绩。计算学生学习分数
    @RequestMapping("/addAcademicScores")
    public String addAcademicScores(StudentScoresDTO studentScores){
        scoresService.addAcademicScore(studentScores);
        return "redirect:eval?id=" + studentScores.getStudentScores().get(0).getStudentId();
    }

    //学生基础性素质评测
    @RequestMapping("/addBasicQualityEval")
    public String basicQualityEval(BasicQualityScore basicQualityScore){
        System.out.println(basicQualityScore);
        scoresService.addBasicQualityScore(basicQualityScore);
        return "redirect:eval?id=" + basicQualityScore.getStudentId();
    }

    //查看基础性素质
    @RequestMapping("/basicQuality")
    public ModelAndView basicQuality(@RequestParam(name = "id")String studentId){
        ModelAndView mv = new ModelAndView();
        BasicQualityScore basicQualityScore = scoresService.listBasicQualityScore(studentId);
        mv.addObject("basicQualityScore",basicQualityScore);
        mv.setViewName("eval_basic_quality");
        return mv;
    }
}
