package com.yzy.Dao;

import com.yzy.Entity.Roomtype;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * RoomtypeMapper 数据访问类
 * @author xlei @qq 251425887 @tel 13352818008
 * @Email dlei0009@163.com
 * @date 2020-05-21 22:51:24
 * @version 1.0
 */
@Repository("roomTypeDao")
public interface RoomtypeMapper {

    List<Roomtype> findAll();
    Roomtype findById();
    int insertRoomType(Roomtype roomtype);

}