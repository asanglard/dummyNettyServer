package io.netty.example.discard;

import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public class SslDiscardServerContext {

    public io.netty.handler.ssl.SslContext getSslContext() throws IOException {

        InputStream tlsCert = this.getClass().getClassLoader()
                .getResourceAsStream("cert_chain_file.crt");

        InputStream tlsKey = this.getClass().getClassLoader()
                .getResourceAsStream("private.pk8");

        SslContextBuilder sslContextBuilder = SslContextBuilder.forServer(tlsCert, tlsKey, null);
        return sslContextBuilder.build();
    }

}