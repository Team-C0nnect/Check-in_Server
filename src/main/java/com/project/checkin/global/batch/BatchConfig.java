package com.project.checkin.global.batch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@EnableBatchProcessing
public class BatchConfig {

//    @Autowired
//    public JobBuilderFactory jobBuilderFactory;
//
//    @Autowired
//    public StepBuilderFactory stepBuilderFactory;
//
//
//    @Bean
//    public Job job() {
//
//        Job job = jobBuilderFactory.get("openAi")
//                .start(step())
//                .build();
//
//        return job;
//    }
//
//    @Bean
//    public Step step() {
//        return stepBuilderFactory.get("step")
//                .tasklet((contribution, chunkContext) -> {
//                    /*
//                      여기에 실행하고 싶은 로직 생성
//
//                    */
//                    return RepeatStatus.FINISHED;
//                })
//                .build();
//    }
}
