package com.hendisantika.springbootminio.repository;

import com.hendisantika.springbootminio.entity.FileMetadataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-minio
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/9/23
 * Time: 09:56
 * To change this template use File | Settings | File Templates.
 */
public interface FileMetadataRepository extends JpaRepository<FileMetadataEntity, String> {
}
