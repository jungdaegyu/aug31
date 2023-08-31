package com.poseidon.web.repository;



import org.springframework.data.repository.Repository;

import com.poseidon.web.jBoard;

public interface BoardRepository extends Repository<jBoard, Long> {

	void save(jBoard jBoard);

}
