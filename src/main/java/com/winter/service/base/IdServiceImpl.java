package com.winter.service.base;

import com.winter.enumerate.BusinessTypeEnum;
import com.winter.util.UidGenerator;
import org.springframework.stereotype.Service;

/**
 * ID generator implement
 *
 * @author basoft
 */
@Service
public class IdServiceImpl implements IdService {

    @Override
    public Long generateGirl() {
        return new UidGenerator().generate(BusinessTypeEnum.GIRL);
    }
}
