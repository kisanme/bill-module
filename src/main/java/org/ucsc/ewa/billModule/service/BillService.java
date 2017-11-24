package org.ucsc.ewa.billModule.service;

import java.util.List;
import org.ucsc.ewa.billModule.model.AccDetails;
import org.ucsc.ewa.billModule.model.BillingDetails;
import org.ucsc.ewa.billModule.model.cusBilldetails;

public interface BillService {

     cusBilldetails findBillInfoByMobileNo(String mobileNo);
}
