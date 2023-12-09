package com.hendisantika.springbootminio.controller;

import com.hendisantika.springbootminio.service.MinioAdapter;
import io.minio.messages.Bucket;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-minio
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/9/23
 * Time: 07:28
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequiredArgsConstructor
public class MinioStorageController {
    private final MinioAdapter minioAdapter;

    @GetMapping(path = "/buckets")
    public List<Bucket> listBuckets() {
        return minioAdapter.getAllBuckets();
    }
}
