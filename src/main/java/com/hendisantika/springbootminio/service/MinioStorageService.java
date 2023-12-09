package com.hendisantika.springbootminio.service;

import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-minio
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/9/23
 * Time: 09:57
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class MinioStorageService {

    private final MinioClient minioClient;

    @Value("${minio.put-object-part-size}")
    private Long putObjectPartSize;

    public void save(MultipartFile file, UUID uuid) throws Exception {
        minioClient.putObject(
                PutObjectArgs
                        .builder()
                        .bucket(MinioConfig.COMMON_BUCKET_NAME)
                        .object(uuid.toString())
                        .stream(file.getInputStream(), file.getSize(), putObjectPartSize)
                        .build()
        );
    }
}
