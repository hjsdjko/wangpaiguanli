package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 推荐课程
 *
 * @email
 * @date 2021-05-22
 */
@TableName("wodewenjian")
public class WodewenjianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    public WodewenjianEntity() {

    }

    public WodewenjianEntity(T t) {
    try {
    BeanUtils.copyProperties(this, t);
    } catch (IllegalAccessException | InvocationTargetException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    }
    }


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_types")

    private Integer yonghuTypes;


    /**
     * 教学资源名称
     */
    @TableField(value = "wodewenjian_name")

    private String wodewenjianName;


    /**
     * 文件
     */
    @TableField(value = "wodewenjian_file")

    private String wodewenjianFile;


    /**
     * 文件类型
     */
    @TableField(value = "leixing_types")

    private Integer leixingTypes;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "shuangchuan_time",fill = FieldFill.UPDATE)

    private Date shuangchuanTime;


    /**
     * 详情信息
     */
    @TableField(value = "wodewenjian_content")

    private String wodewenjianContent;


    /**
     * 状态
     */
    @TableField(value = "zhuangt1_types")

    private Integer zhuangt1Types;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "wodewenjian_time",fill = FieldFill.UPDATE)

    private Date wodewenjianTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuTypes() {
        return yonghuTypes;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuTypes(Integer yonghuTypes) {
        this.yonghuTypes = yonghuTypes;
    }
    /**
	 * 设置：教学资源名称
	 */
    public String getWodewenjianName() {
        return wodewenjianName;
    }


    /**
	 * 获取：教学资源名称
	 */

    public void setWodewenjianName(String wodewenjianName) {
        this.wodewenjianName = wodewenjianName;
    }
    /**
	 * 设置：文件
	 */
    public String getWodewenjianFile() {
        return wodewenjianFile;
    }


    /**
	 * 获取：文件
	 */

    public void setWodewenjianFile(String wodewenjianFile) {
        this.wodewenjianFile = wodewenjianFile;
    }
    /**
	 * 设置：文件类型
	 */
    public Integer getLeixingTypes() {
        return leixingTypes;
    }


    /**
	 * 获取：文件类型
	 */

    public void setLeixingTypes(Integer leixingTypes) {
        this.leixingTypes = leixingTypes;
    }
    /**
	 * 设置：上传时间
	 */
    public Date getShuangchuanTime() {
        return shuangchuanTime;
    }


    /**
	 * 获取：上传时间
	 */

    public void setShuangchuanTime(Date shuangchuanTime) {
        this.shuangchuanTime = shuangchuanTime;
    }
    /**
	 * 设置：详情信息
	 */
    public String getWodewenjianContent() {
        return wodewenjianContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setWodewenjianContent(String wodewenjianContent) {
        this.wodewenjianContent = wodewenjianContent;
    }
    /**
	 * 设置：状态
	 */
    public Integer getZhuangt1Types() {
        return zhuangt1Types;
    }


    /**
	 * 获取：状态
	 */

    public void setZhuangt1Types(Integer zhuangt1Types) {
        this.zhuangt1Types = zhuangt1Types;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getWodewenjianTime() {
        return wodewenjianTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setWodewenjianTime(Date wodewenjianTime) {
        this.wodewenjianTime = wodewenjianTime;
    }

    @Override
    public String toString() {
    return "Wodewenjian{" +
            "id=" + id +
            ", yonghuTypes=" + yonghuTypes +
            ", wodewenjianName=" + wodewenjianName +
            ", wodewenjianFile=" + wodewenjianFile +
            ", leixingTypes=" + leixingTypes +
            ", shuangchuanTime=" + shuangchuanTime +
            ", wodewenjianContent=" + wodewenjianContent +
            ", zhuangt1Types=" + zhuangt1Types +
            ", wodewenjianTime=" + wodewenjianTime +
    "}";
    }
    }
