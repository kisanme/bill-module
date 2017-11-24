package org.ucsc.ewa.billModule.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.ucsc.ewa.billModule.model.BillingDetails;


@Repository
public interface BillRepository extends JpaRepository<BillingDetails, Long> {

    @Query("select b from BillingDetails b  where b.connectionId = ?1 ORDER BY b.billDate DESC")
    public List<BillingDetails> findBillDetailsByMobileNo(Long conId);
}
