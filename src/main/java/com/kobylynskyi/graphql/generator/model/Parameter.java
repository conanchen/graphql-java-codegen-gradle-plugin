package com.kobylynskyi.graphql.generator.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Freemarker-understandable format of method parameter
 *
 * @author kobylynskyi
 */
@Getter
@Setter
public class Parameter {

    private String type;
    private String name;

}