package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SignConfigMapper;
import com.ruoyi.system.domain.SignConfig;
import com.ruoyi.system.service.ISignConfigService;

/**
 * 签单子项 项目列Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-24
 */
@Service
public class SignConfigServiceImpl implements ISignConfigService 
{
    @Autowired
    private SignConfigMapper signConfigMapper;

    /**
     * 查询签单子项 项目列
     * 
     * @param id 签单子项 项目列主键
     * @return 签单子项 项目列
     */
    @Override
    public SignConfig selectSignConfigById(Long id)
    {
        return signConfigMapper.selectSignConfigById(id);
    }

    /**
     * 查询签单子项 项目列列表
     * 
     * @param signConfig 签单子项 项目列
     * @return 签单子项 项目列
     */
    @Override
    public List<SignConfig> selectSignConfigList(SignConfig signConfig)
    {
        return signConfigMapper.selectSignConfigList(signConfig);
    }

    /**
     * 新增签单子项 项目列
     * 
     * @param signConfig 签单子项 项目列
     * @return 结果
     */
    @Override
    public int insertSignConfig(SignConfig signConfig)
    {
        return signConfigMapper.insertSignConfig(signConfig);
    }

    /**
     * 修改签单子项 项目列
     * 
     * @param signConfig 签单子项 项目列
     * @return 结果
     */
    @Override
    public int updateSignConfig(SignConfig signConfig)
    {
        return signConfigMapper.updateSignConfig(signConfig);
    }

    /**
     * 批量删除签单子项 项目列
     * 
     * @param ids 需要删除的签单子项 项目列主键
     * @return 结果
     */
    @Override
    public int deleteSignConfigByIds(Long[] ids)
    {
        return signConfigMapper.deleteSignConfigByIds(ids);
    }

    /**
     * 删除签单子项 项目列信息
     * 
     * @param id 签单子项 项目列主键
     * @return 结果
     */
    @Override
    public int deleteSignConfigById(Long id)
    {
        return signConfigMapper.deleteSignConfigById(id);
    }
}
