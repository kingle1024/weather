package com.gworld.weather;

import com.gworld.weather.repository.MemoRepository;
import com.gworld.weather.entity.Memo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional // 실제 DB에 값이 저장되지 않도록 함
public class MemoRepositoryTest {
    @Autowired
    MemoRepository memoRepository;

    @Test
    void insertMemoTest(){
        //given
        Memo newMemo = new Memo(10, "this is jpa memo");
        //when
        memoRepository.save(newMemo);

        //then
        List<Memo> memoList = memoRepository.findAll();
        assertTrue(memoList.size() > 0);
    }
}
