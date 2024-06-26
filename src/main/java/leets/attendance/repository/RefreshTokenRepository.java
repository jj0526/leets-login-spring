package leets.attendance.repository;

import leets.attendance.domain.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findById(Long Id);
    Optional<RefreshToken> findByRefreshToken(String refreshToken);
}