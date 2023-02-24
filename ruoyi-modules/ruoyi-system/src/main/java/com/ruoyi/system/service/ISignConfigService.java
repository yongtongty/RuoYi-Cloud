package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SignConfig;

/**
 * 签单子项 项目列Service接口
 * 
 * @author ruoyi
 * @date 2023-02-24
 */
public interface ISignConfigService 
{
    /**
     * 查询签单子项 项目列
     * 
     * @param id 签单子项 项目列主键
     * @return 签单子项 项目列
     */
    public SignConfig selectSignConfigById(Long id);

    /**
     * 查询签单子项 项目列列表
     * 
     * @param signConfig 签单子项 项目列
     * @return 签单子项 项目列集合
     */
    public List<SignConfig> selectSignConfigList(SignConfig signConfig);

    /**
     * 新增签单子项 项目列
     * 
     * @param signConfig 签单子项 项目列
     * @return 结果
     */
    public int insertSignConfig(SignConfig signConfig);

    /**
     * 修改签单子项 项目列
     * 
     * @param signConfig 签单子项 项目列
     * @return 结果
     */
    public int updateSignConfig(SignConfig signConfig);

    /**
     * 批量删除签单子项 项目列
     * 
     * @param ids 需要删除的签单子项 项目列主键集合
     * @return 结果
     */
    public int deleteSignConfigByIds(Long[] ids);

    /**
     * 删除签单子项 项目列信息
     * 
     * @param id 签单子项 项目列主键
     * @return 结果
     */
    public int deleteSignConfigById(Long id);
}
