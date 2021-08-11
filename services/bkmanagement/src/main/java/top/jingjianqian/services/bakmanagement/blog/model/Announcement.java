package top.jingjianqian.services.bakmanagement.blog.model;

import org.hibernate.annotations.GenericGenerator;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.View;

import javax.persistence.*;

/**
 * @author jjq
 * @date 20210812
 * 博客-公告
 */

@Erupt(name = "Announcement")
@Table(name= "blog_announcement")
@Entity
public class Announcement {
    //主键
    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "native")
    @Column(name = "id")
    @EruptField
    private Long id;
    //公告标题
    @EruptField(
            views = @View(title = "公告标题"),
            edit = @Edit(title = "文本")
    )
    private String title;
    //公告明细
    @EruptField(
            views = @View(title = "公告标题"),
            edit = @Edit(title = "文本")
    )
    private String announcement;
}
