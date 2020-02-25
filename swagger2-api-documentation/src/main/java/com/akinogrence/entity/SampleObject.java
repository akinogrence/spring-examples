package com.akinogrence.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "SampleObject_Model",description = "This is Sample Model !")
public class SampleObject {

    @ApiModelProperty(value = "My Object ID Property")
    Long id;
    @ApiModelProperty(value = "My Object Name Property")
    String objectName;
    @ApiModelProperty(value = "My Object Description Property")
    String objectDescription;
    @ApiModelProperty(value = "My Object Alive or Lifeless  Property")
    Boolean isAlive;


}
