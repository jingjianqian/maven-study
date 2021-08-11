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
 * 博客-标签
 */
@Erupt(name = "Tags")
@Table(name= "blog_tags")
@Entity
public class Tags {
    //主键
    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "native")
    @Column(name = "id")
    @EruptField
    private Long id;
    //标签
    @EruptField(
            views = @View(title = "标签"),
            edit = @Edit(title = "标签")
    )
    private String tag;
}
