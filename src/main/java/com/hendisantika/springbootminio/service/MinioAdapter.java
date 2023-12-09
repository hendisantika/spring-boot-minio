package com.hendisantika.springbootminio.service;

import io.minio.MinioClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-minio
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/9/23
 * Time: 07:20
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class MinioAdapter {

    private final MinioClient minioClient;

    @Value("${minio.buckek.name}")
    private String defaultBucketName;

    @Value("${minio.default.folder}")
    private String defaultBaseFolder;
}
