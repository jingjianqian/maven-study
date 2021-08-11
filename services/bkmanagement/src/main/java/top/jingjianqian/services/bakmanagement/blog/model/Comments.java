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
 * 博客-评论
 */
@Erupt(name = "Comments")
@Table(name= "blog_comments")
@Entity
public class Comments {
    //主键
    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "native")
    @Column(name = "id")
    @EruptField
    private Long id;
    //评论用户
    @EruptField(
            views = @View(title = "评论人"),
            edit = @Edit(title = "评论人")
    )
    private String user;
    //管理用户ID
    @EruptField(
            views = @View(title = "用户ID"),
            edit = @Edit(title = "用户ID")
    )
    private String user_id;
    //上级评论
    @EruptField(
            views = @View(title = "上级评论"),
            edit = @Edit(title = "上级评论")
    )
    private String parent_comment;

}
