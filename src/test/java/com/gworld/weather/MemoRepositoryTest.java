package com.gworld.weather;

import com.gworld.weather.repository.MemoRepository;
import com.gworld.weather.entity.Memo;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional // 실제 DB에 값이 저장되지 않도록 함
@RequiredArgsConstructor
//@ExtendWith(MockitoExtension.class)
public class MemoRepositoryTest {
    @Mock
    private final MemoRepository memoRepository = null;

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
