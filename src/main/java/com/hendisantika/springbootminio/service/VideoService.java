package com.hendisantika.springbootminio.service;

import com.hendisantika.springbootminio.repository.FileMetadataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
@Slf4j
@Service
@RequiredArgsConstructor
public class VideoService {
    private final MinioStorageService storageService;

    private final FileMetadataRepository fileMetadataRepository;
}
