package com.ruoyi.system.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.system.domain.SignConfig;
import com.ruoyi.system.service.ISignConfigService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 签单子项 项目列Controller
 * 
 * @author ruoyi
 * @date 2023-02-24
 */
@RestController
@RequestMapping("/signConfig")
public class SignConfigController extends BaseController
{
    @Autowired
    private ISignConfigService signConfigService;

    /**
     * 查询签单子项 项目列列表
     */
    @RequiresPermissions("system:signConfig:list")
    @GetMapping("/list")
    public TableDataInfo list(SignConfig signConfig)
    {
        startPage();
        List<SignConfig> list = signConfigService.selectSignConfigList(signConfig);
        return getDataTable(list);
    }

    /**
     * 导出签单子项 项目列列表
     */
    @RequiresPermissions("system:signConfig:export")
    @Log(title = "签单子项 项目列", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SignConfig signConfig)
    {
        List<SignConfig> list = signConfigService.selectSignConfigList(signConfig);
        ExcelUtil<SignConfig> util = new ExcelUtil<SignConfig>(SignConfig.class);
        util.exportExcel(response, list, "签单子项 项目列数据");
    }

    /**
     * 获取签单子项 项目列详细信息
     */
    @RequiresPermissions("system:signConfig:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(signConfigService.selectSignConfigById(id));
    }

    /**
     * 新增签单子项 项目列
     */
    @RequiresPermissions("system:signConfig:add")
    @Log(title = "签单子项 项目列", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    public AjaxResult add(@RequestBody SignConfig signConfig)
    {
        return toAjax(signConfigService.insertSignConfig(signConfig));
    }

    /**
     * 修改签单子项 项目列
     */
    @RequiresPermissions("system:signConfig:edit")
    @Log(title = "签单子项 项目列", businessType = BusinessType.UPDATE)
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody SignConfig signConfig)
    {
        return toAjax(signConfigService.updateSignConfig(signConfig));
    }

    /**
     * 删除签单子项 项目列
     */
    @RequiresPermissions("system:signConfig:remove")
    @Log(title = "签单子项 项目列", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(signConfigService.deleteSignConfigByIds(ids));
    }
}
