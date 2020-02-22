package com.akinogrence.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "users" , type = "user")
@Getter //Lombok getterleri oluşturan annotations
@Setter //Lombok setterleri oluşturan annotations
@NoArgsConstructor //Lombok parametresiz constructor oluşturan annotations
@AllArgsConstructor //Lombok tüm parametreleri gerektiren constructor oluşturan annotations
public class User {

    @Id
    private String id;
    @Field(name = "name",type = FieldType.Text)
    private String name;
    @Field(name = "lastName",type = FieldType.Text)
    private String lastName;
    @Field(name = "adress",type = FieldType.Text)
    private String adress;
    @Field(name = "birthday",type = FieldType.Date)
    private Date birthday;


}
