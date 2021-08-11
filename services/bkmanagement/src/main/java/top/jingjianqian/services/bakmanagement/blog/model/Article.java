package top.jingjianqian.services.bakmanagement.blog.model;

import org.hibernate.annotations.GenericGenerator;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.View;

import javax.persistence.*;
import java.util.Date;

/**
 * @author jjq
 * @date 20210812
 * 博客-文章明细
 */
@Erupt(name = "Article")
@Table(name= "blog_article")
@Entity
public class Article {
    //主键
    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "native")
    @Column(name = "id")
    @EruptField
    private Long id;
    //文章标题
    @EruptField(
            views = @View(title = "标题"),
            edit = @Edit(title = "标题")
    )
    private String title;
    //摘要
    @EruptField(
            views = @View(title = "摘要"),
            edit = @Edit(title = "摘要")
    )
    private String article_abstract;

    //文章明细
    @EruptField(
            views = @View(title = "内容"),
            edit = @Edit(title = "内容")
    )
    private String content;
    //文章作者
    @EruptField(
            views = @View(title = "作者"),
            edit = @Edit(title = "文本")
    )
    private String author;
    //发布时间
    @EruptField(
            views = @View(title = "发布时间"),
            edit = @Edit(title = "发布时间")
    )
    private Date release_time;
    //发布时间
    @EruptField(
            views = @View(title = "更新时间"),
            edit = @Edit(title = "更新时间")
    )
    private Date update_time;
    //阅读数
    @EruptField(
            views = @View(title = "浏览次数"),
            edit = @Edit(title = "浏览次数")
    )
    private int page_view;
    //阅读数
    @EruptField(
            views = @View(title = "评论数"),
            edit = @Edit(title = "评论数")
    )
    private int comments;
    //相关标签
    @EruptField(
            views = @View(title = "评论数"),
            edit = @Edit(title = "评论数")
    )
    private String tags;
    //相关标签
    @EruptField(
            views = @View(title = "文章连接"),
            edit = @Edit(title = "文章连接")
    )
    private String link;
}
