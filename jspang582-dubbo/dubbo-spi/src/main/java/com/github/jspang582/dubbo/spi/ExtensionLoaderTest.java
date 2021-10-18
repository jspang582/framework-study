package com.github.jspang582.dubbo.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;
import org.junit.Test;

import java.util.Set;

/**
 * @author: fli
 * @email: fli@sstir.cn
 * @date: 2021/10/18 16:14
 */
public class ExtensionLoaderTest {

    @Test
    public void supportedExtensions() {
        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
        Set<String> supportedExtensions = extensionLoader.getSupportedExtensions();
        System.out.println(supportedExtensions);
    }

    @Test
    public void testExtension() {
        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
        Protocol protocol = extensionLoader.getExtension("dubbo");
        System.out.println(protocol);
    }
}
