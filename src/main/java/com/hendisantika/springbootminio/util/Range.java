package com.hendisantika.springbootminio.util;

import lombok.Builder;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-minio
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/9/23
 * Time: 09:52
 * To change this template use File | Settings | File Templates.
 */
@Builder
public class Range {

    private final long start;

    private final long end;
}
