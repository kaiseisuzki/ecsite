package com.example.ecsite.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecsite.model.entity.Goods;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, Long> {

}
