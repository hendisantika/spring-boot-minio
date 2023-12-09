package com.hendisantika.springbootminio.exception;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-minio
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/9/23
 * Time: 09:55
 * To change this template use File | Settings | File Templates.
 */
public class StorageException extends RuntimeException {

    public StorageException(Exception ex) {
        super(ex);
    }
}
