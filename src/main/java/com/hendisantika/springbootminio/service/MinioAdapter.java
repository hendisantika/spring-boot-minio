package com.hendisantika.springbootminio.service;

import io.minio.MinioClient;
import io.minio.messages.Bucket;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

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

    public List<Bucket> getAllBuckets() {
        try {
            return minioClient.listBuckets();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void uploadFile(String name, byte[] content) {
        File file = new File("/tmp/" + name);
        file.canWrite();
        file.canRead();
        try {
            FileOutputStream iofs = new FileOutputStream(file);
            iofs.write(content);
            minioClient.putObject(defaultBucketName, defaultBaseFolder + name, file.getAbsolutePath());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public byte[] getFile(String key) {
        try {
            InputStream obj = minioClient.getObject(defaultBucketName, defaultBaseFolder + "/" + key);

            byte[] content = IOUtils.toByteArray(obj);
            obj.close();
            return content;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostConstruct
    public void init() {
    }
}
