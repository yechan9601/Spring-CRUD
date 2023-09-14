package com.study.board.board.repository;

import com.study.board.board.entity.BoardEntity;
import com.study.board.board.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    // select * from comment_table where board_id=? order by id desc; 최신 댓글이 가장 먼저 보이게끔!
    List<CommentEntity> findAllByBoardEntityOrderByIdDesc(BoardEntity boardEntity);
}
