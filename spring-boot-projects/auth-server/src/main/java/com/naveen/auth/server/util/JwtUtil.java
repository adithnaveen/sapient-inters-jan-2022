package com.naveen.auth.server.util;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import lombok.extern.slf4j.Slf4j;


@Component
public class JwtUtil {
    @Value("${jwt.secret.key}")
    private String secretKey;

    public String createToken(Integer userId, String name) throws Exception {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secretKey);
            return JWT.create()
                    .withSubject(name)
                    .withClaim("id", userId)
                    .withIssuedAt(new Date())
                    .withExpiresAt(new Date(System.currentTimeMillis() + 15 * 60 * 1000))
                    .sign(algorithm);

        } catch (Exception ex) {
            throw ex;
        }
    }

}