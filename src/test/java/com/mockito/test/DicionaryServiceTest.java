package com.mockito.test;

import com.mockito.test.service.DicionaryService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(value = {MockitoExtension.class})
public class DicionaryServiceTest {

    @Mock
    private Map<String, String> wordsMap;

    @InjectMocks
    private DicionaryService dicionaryService;

    @Test
    public void injectMockTest(){

        when(wordsMap.get("miami dolphins")).thenReturn("The only team to win a NFL Championship undefeated");

        assertEquals("The only team to win a NFL Championship undefeated", dicionaryService.getMeaning("miami dolphins"));
    }
}
