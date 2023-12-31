package com.db.dataplatform.techtest.server.persistence.repository;

import com.db.dataplatform.techtest.server.persistence.model.DataBodyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DataStoreRepository extends JpaRepository<DataBodyEntity, Long> {

    @Query(value = "SELECT d.* FROM DATA_STORE d join DATA_HEADER h on h.data_header_id=d.data_header_id where blocktype=:blockType", nativeQuery = true)
    DataBodyEntity findByBlockTypeA(@Param("blockType") String blockType);


}
