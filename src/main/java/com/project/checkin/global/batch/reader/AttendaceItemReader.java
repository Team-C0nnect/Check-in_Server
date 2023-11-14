package com.project.checkin.global.batch.reader;

import com.project.checkin.domain.check.service.querydsl.CheckQueryService;
import com.project.checkin.global.common.dto.request.PageRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class AttendaceItemReader implements ItemReader<List<String>> {
    private static final int SIZE = 50;

    private final CheckQueryService checkQueryService;
    private int page = 1;

    @Override
    public List<String> read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        log.info("....................... attendaceItemReader start");
        final List<String> nonCheckUserList = checkQueryService.findAllNonCheckUser(pageRequest(page));
        log.info("....................... nonAttendanceList : {} ", nonCheckUserList.size());

        if (nonCheckUserList.isEmpty()) {
            page = 1;
            return null;
        }

        page++;
        log.info("....................... attendaceItemReader end");
        return nonCheckUserList;
    }

    private PageRequest pageRequest(int page) {
        return new PageRequest(page, SIZE);
    }
}
