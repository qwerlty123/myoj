package com.myoj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myoj.model.entity.Question;
import com.myoj.service.QuestionService;
import com.myoj.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author 17871
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2026-02-20 22:22:51
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




