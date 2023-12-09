package com.hendisantika.springbootminio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-minio
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/9/23
 * Time: 09:54
 * To change this template use File | Settings | File Templates.
 */
@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileMetadataEntity {

    @Id
    private String id;

    private long size;

    private String httpContentType;
}
