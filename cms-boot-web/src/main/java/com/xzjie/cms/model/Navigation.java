package com.xzjie.cms.model;

import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Data
@Entity
@Table(name = "cms_navigation")
public class Navigation {
    @Id
    private Long id;
    @Column(name = "p_id")
    private Long pid;
    private String name;
    private String url;
    private String target;
    @OrderColumn
    private Integer sort;
    private Boolean enabled;

    @OneToMany
    @JoinColumn(name = "p_id")
    @Where(clause = "enabled = 1")
    @OrderBy("sort desc")
    private List<Navigation> children = new LinkedList<>();
}
