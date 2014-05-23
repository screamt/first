Feature:任务管理

Description

In order to保证任务及时完成

As a团队成员

considerations

任务有不同状态

任务必须每日跟踪

Scenario:查询未完成的任务

Given 我建立人物"Task 123"

Given 我建立人物"Task 456"

When 我把任务"Task123"完成

Then 我的未完成任务有"Task123"

Scenario:排序任务优先级
