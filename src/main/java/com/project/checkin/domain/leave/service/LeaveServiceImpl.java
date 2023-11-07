package com.project.checkin.domain.leave.service;

import com.project.checkin.domain.leave.domain.repository.LeaveRepository;
import com.project.checkin.domain.leave.dto.Leave;
import com.project.checkin.domain.leave.exception.LeaveAlreadyDeletedException;
import com.project.checkin.domain.leave.exception.LeaveAlreadySelectedException;
import com.project.checkin.domain.leave.mapper.LeaveMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LeaveServiceImpl implements LeaveService{

    private final LeaveRepository leaveRepository;
    private final LeaveMapper leaveMapper;
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void registerLeaveWeek(Leave leave) {
        if(leaveRepository.findByLeaveDate(leave.getLeaveDate()).isPresent()) {
            throw LeaveAlreadySelectedException.EXCEPTION;
        }
        leaveRepository.save(leaveMapper.toCreate(leave));
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void removeLeaveWeek(Long leaveId){
        if(leaveRepository.findById(leaveId).isPresent()){
            throw LeaveAlreadyDeletedException.EXCEPTION;
        }
        else{
            leaveRepository.deleteById(leaveId);
        }
    }
    
}
