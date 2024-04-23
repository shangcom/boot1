package com.green.boot1.repository;

import com.green.boot1.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoardRepository extends JpaRepository<Board, Long> {
    // JpaRepository 인터페이스 상속할 때는 엔티티 타입과 @Id 타입을 지정해줘야함.

    @Query(value = "select now()")
    String getTime();
}
