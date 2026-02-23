package com.qwerlty.myoj.judge.strategy;

import com.qwerlty.myoj.model.dto.questionsubmit.JudgeInfo;

/**
 * 判题策略
 */

public interface JudgeStrategy {

    JudgeInfo doJudge(JudgeContext judgeContext);

}
