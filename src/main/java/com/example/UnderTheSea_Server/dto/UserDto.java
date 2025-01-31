package com.example.UnderTheSea_Server.dto;

import com.example.UnderTheSea_Server.domain.User;
import com.example.UnderTheSea_Server.domain.UserStatus;
import com.example.UnderTheSea_Server.jwt.RefreshToken;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Date;

@Repository
public class UserDto {
    private Timestamp created_at = new Timestamp(new Date().getTime());
    private Timestamp updated_at = new Timestamp(new Date().getTime());

    public User insertUser(String email, String nickname, String profile) {
        User userEntity = User.builder()
                .email(email)
                .nickname(nickname)
                .profileImgUrl(profile)
                .status(UserStatus.ACTIVE)
                .created_at(created_at)
                .updated_at(updated_at)
                .build();
        return userEntity;
    }

    public RefreshToken insertRefreshToken(String token) {
        RefreshToken refreshTokenEntity = RefreshToken.builder()
                .refreshToken(token)
                .build();
        return refreshTokenEntity;
    }
}