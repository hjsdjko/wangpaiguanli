package com.entity.vo;

import com.entity.WodewenjianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 推荐课程
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @email
 * @date 2021-05-22
 */
@TableName("wodewenjian")
public class WodewenjianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户 Search
     */

    @TableField(value = "yonghu_types")
    private Integer yonghuTypes;


    /**
     * 教学资源名称  Search 
     */

    @TableField(value = "wodewenjian_name")
    private String wodewenjianName;


    /**
     * 文件  Search 
     */

    @TableField(value = "wodewenjian_file")
    private String wodewenjianFile;


    /**
     * 文件类型  Search 
     */

    @TableField(value = "leixing_types")
    private Integer leixingTypes;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shuangchuan_time")
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

    @TableField(value = "wodewenjian_time")
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
	 * 设置：用户 Search
	 */
    public Integer getYonghuTypes() {
        return yonghuTypes;
    }


    /**
	 * 获取：用户 Search
	 */

    public void setYonghuTypes(Integer yonghuTypes) {
        this.yonghuTypes = yonghuTypes;
    }
    /**
	 * 设置：教学资源名称  Search 
	 */
    public String getWodewenjianName() {
        return wodewenjianName;
    }


    /**
	 * 获取：教学资源名称  Search 
	 */

    public void setWodewenjianName(String wodewenjianName) {
        this.wodewenjianName = wodewenjianName;
    }
    /**
	 * 设置：文件  Search 
	 */
    public String getWodewenjianFile() {
        return wodewenjianFile;
    }


    /**
	 * 获取：文件  Search 
	 */

    public void setWodewenjianFile(String wodewenjianFile) {
        this.wodewenjianFile = wodewenjianFile;
    }
    /**
	 * 设置：文件类型  Search 
	 */
    public Integer getLeixingTypes() {
        return leixingTypes;
    }


    /**
	 * 获取：文件类型  Search 
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

}
