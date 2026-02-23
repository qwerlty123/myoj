package com.qwerlty.myoj.judge;

import com.qwerlty.myoj.model.entity.QuestionSubmit;
import com.qwerlty.myoj.model.vo.QuestionSubmitVO;

/**
 * 判题服务
 */
public interface JudgeService {

    QuestionSubmit doJudge(Long questionSubmitId);

}
