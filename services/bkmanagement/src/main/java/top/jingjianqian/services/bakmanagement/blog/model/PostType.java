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
 * 博客-文章类型
 */
@Erupt(name = "PostType")
@Table(name= "blog_post_type")
@Entity
public class PostType {
    //主键
    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "native")
    @Column(name = "id")
    @EruptField
    private Long id;
    //类型
    @EruptField(
            views = @View(title = "文章类型"),
            edit = @Edit(title = "文章类型")
    )
    private String post_type;
    //文章类型tag
    @EruptField(
            views = @View(title = "文章类型tag"),
            edit = @Edit(title = "文章类型tag")
    )
    private String post_type_en;
}
