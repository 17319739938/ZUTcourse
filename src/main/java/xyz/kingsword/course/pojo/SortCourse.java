package xyz.kingsword.course.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import springfox.documentation.annotations.ApiIgnore;
import xyz.kingsword.course.util.TimeUtil;

import java.io.Serializable;

/**
 * SortCourse
 *
 * @author wzh
 */
@Data
@ApiModel("选课实体")
public class SortCourse implements Serializable {

    @ApiModelProperty(hidden = true)
    private Integer id;

    @ApiModelProperty(notes = "教师id")
    private String teaId;
    @ApiModelProperty(notes = "课程id")
    private String couId;

    /**
     * 学生总数
     */
    @ApiModelProperty(notes = "学生人数")
    private Integer studentNum;
    @ApiModelProperty(notes = "教研室id")
    private Integer classroomId;

    /**
     * 学期id
     */
    @ApiModelProperty(notes = "学期id")
    private String semesterId;

    /**
     * -2删除-1被合并课头0正常显示
     */
    @ApiModelProperty(hidden = true)
    private Integer status;

    @ApiModelProperty(notes = "班级")
    private String className;

    /**
     * 被合并的课头id
     */
    @ApiModelProperty(notes = "被合并的课头id",hidden = true)
    private String mergedId;

    /**
     * 课序号
     */
    @ApiModelProperty(hidden = true)
    private String sortNum;

    @ApiModelProperty(notes = "是否是当前学期课程是 true  不是 false",hidden = true)
    private boolean flag;

    private static final long serialVersionUID = 1L;


}