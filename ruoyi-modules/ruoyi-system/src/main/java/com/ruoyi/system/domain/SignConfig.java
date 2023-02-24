package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 签单子项 项目列对象 sign_config
 * 
 * @author ruoyi
 * @date 2023-02-24
 */
public class SignConfig extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 表主键 */
    private Long id;

    /** sign_list.id */
    @Excel(name = "sign_list.id")
    private Long sid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String title;

    /** 数据状态 */
    @Excel(name = "数据状态")
    private Long estatus;

    /** 创建时间 */
    @Excel(name = "创建时间")
    private Long createdTime;

    /** 更新时间 */
    @Excel(name = "更新时间")
    private Long updatedTime;

    /** 排序 */
    @Excel(name = "排序")
    private Long sort;

    /** 是否可复制 */
    @Excel(name = "是否可复制")
    private Long replicable;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSid(Long sid) 
    {
        this.sid = sid;
    }

    public Long getSid() 
    {
        return sid;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setEstatus(Long estatus) 
    {
        this.estatus = estatus;
    }

    public Long getEstatus() 
    {
        return estatus;
    }
    public void setCreatedTime(Long createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Long getCreatedTime() 
    {
        return createdTime;
    }
    public void setUpdatedTime(Long updatedTime) 
    {
        this.updatedTime = updatedTime;
    }

    public Long getUpdatedTime() 
    {
        return updatedTime;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setReplicable(Long replicable) 
    {
        this.replicable = replicable;
    }

    public Long getReplicable() 
    {
        return replicable;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sid", getSid())
            .append("title", getTitle())
            .append("estatus", getEstatus())
            .append("createdTime", getCreatedTime())
            .append("updatedTime", getUpdatedTime())
            .append("sort", getSort())
            .append("replicable", getReplicable())
            .toString();
    }
}
