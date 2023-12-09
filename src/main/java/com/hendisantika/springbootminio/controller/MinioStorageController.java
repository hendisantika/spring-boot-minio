package com.hendisantika.springbootminio.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

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
//    private final MinioAdapter minioAdapter;
//
//    @GetMapping(path = "/buckets")
//    public List<Bucket> listBuckets() {
//        return minioAdapter.getAllBuckets();
//    }
//
//    @PostMapping(path = "/upload", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
//    public Map<String, String> uploadFile(@RequestPart(value = "file", required = false) MultipartFile files) throws IOException {
//        minioAdapter.uploadFile(files.getOriginalFilename(), files.getBytes());
//        Map<String, String> result = new HashMap<>();
//        result.put("key", files.getOriginalFilename());
//        return result;
//    }
//
//    @GetMapping(path = "/download")
//    public ResponseEntity<ByteArrayResource> downloadFile(@RequestParam(value = "file") String file) throws IOException {
//        byte[] data = minioAdapter.getFile(file);
//        ByteArrayResource resource = new ByteArrayResource(data);
//
//        return ResponseEntity
//                .ok()
//                .contentLength(data.length)
//                .header("Content-type", "application/octet-stream")
//                .header("Content-disposition", "attachment; filename=\"" + file + "\"")
//                .body(resource);
//    }
}
