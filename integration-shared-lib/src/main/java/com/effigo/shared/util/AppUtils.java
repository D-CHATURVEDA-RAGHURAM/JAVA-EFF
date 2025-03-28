package com.effigo.shared.util;

import com.effigo.shared.dto.v2.VendorCreationIntegrationDtoV2;
import com.effigo.shared.dto.v3.VendorCreationIntegrationDtoV3;
import com.effigo.shared.dto.v4.VendorCreationIntegrationDtoV4;
import com.effigo.shared.dto.v6.VendorCreationIntegrationDtoV6;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class AppUtils {

    public static String VARROC_VENDOR_CREATE_STATUS = "C";
    public static String VARROC_VENDOR_UPDATE_STATUS = "U";
    public static String VARROC_VENDOR_APPROVE_STATUS = "X";
    public static String VARROC_VENDOR_BLOCK_STATUS = "BL";
    public static String VARROC_VENDOR_UN_BLOCK_STATUS = "B";
    public static String VARROC_VENDOR_EXTEND_STATUS = "E";
    public static String VARROC_VENDOR_NEW_SITE = "NS";

    public static String CREATE_STATUS = "CREATE";
    public static String UPDATE_STATUS = "UPDATE";
    public static String APPROVE_STATUS = "APPROVE";
    public static String BLOCK_STATUS = "BLOCK";
    public static String UN_BLOCK_STATUS = "UNBLOCK";

    public static String EXTENSION_STATUS = "EXTENSION";

    public static String VARROC_VENDOR_UPDATE_DEFAULT = "1000";

    public static String MANF_NUMBER = "Manufacturer Number : ";

    public static String MANF_PART_NUMBER = "Part Number : ";

    public static String VARROC_VENDOR_CREATE_ACTION = "Create - Vendor manager";
    public static String VARROC_VENDOR_APPROVE_ACTION = "Create - Finance manager";

    public static String GREENKO_VENDOR_CREATE_ACTION = "Create - ERP Integration";
    public static String GREENKO_VENDOR_APPROVE_ACTION = "Approve - ERP Integration";
    public static String GREENKO_VENDOR_BLOCK_OR_UNBLOCK_ACTION = "Block Or Unblock";
    public static String GREENKO_VENDOR_EXTENSION_ACTION = "Extension";
    public static String GREENKO_VENDOR_UPDATE_ACTION = "Update Vendor";

    public static String CREATE_OR_UPDATE_VENDOR ="createOrUpdateVendor";

    public static String ITEM_CODE_NOT_AVAILABLE = "NA";

    public static String FAILURE = "FAILURE";

    public static String THERMAX_VENDOR_CREATE_STATUS = "C";
    public static String THERMAX_VENDOR_UPDATE_STATUS = "U";
    public static String THERMAX_VENDOR_UPDATE_CONTACT_STATUS = "UC";
    public static String THERMAX_VENDOR_UPDATE_BANK_STATUS = "UB";
    public static String THERMAX_VENDOR_UPDATE_GST_STATUS = "UG";
    public static String THERMAX_VENDOR_APPROVE_STATUS = "X";
    public static String THERMAX_VENDOR_BLOCK_STATUS = "B";
    public static String THERMAX_VENDOR_UN_BLOCK_STATUS = "A";
    public static String THERMAX_VENDOR_EXTEND_STATUS = "E";
    public static String THERMAX_VENDOR_NEW_SITE = "NS";
    public static String THERMAX_VENDOR_PU = "PU";


    public static String getCurrentDate(){
        Date date = new Date();
        String currentDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
        return currentDate;
    }

    public String getCurrentDateTimestamp(){
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd.HH.mm.ss").format(new Date());
        return timeStamp;
    }

    public static String getSeparateString(String input, String regex){
        String result="";
        if(!ObjectUtils.isEmpty(input)) {
            String[] arrSplit = input.split("-");
            result=arrSplit[1];
        }
        return result;
    }

    public static String getSeparateStringForPO(String input, String regex){
        String result="";
        if(!ObjectUtils.isEmpty(input)) {
            String[] arrSplit = input.split("-");
            result=arrSplit[0];
        }
        return result;
    }

    public static <T> Collection<List<T>> partitionBasedOnSize(List<T> inputList, int size) {
        final AtomicInteger counter = new AtomicInteger(0);
        return inputList.stream()
                .collect(Collectors.groupingBy(s -> counter.getAndIncrement()/size))
                .values();
    }

    public static String stringFromListBySeparator(List<String> input, String regex){
        String result = input.stream()
                .collect(Collectors.joining(regex));
        return result;
    }

    public static Date getDateFromXMLGregorianCalendar(XMLGregorianCalendar calendar){
        Date date = calendar.toGregorianCalendar().getTime();
        return date;
    }

    public static boolean isEmptyOrNull(Collection < ? > collection) {
        return (collection == null || collection.isEmpty());
    }
    public static boolean isEmptyString(String string) {
        return string == null || string.isEmpty();
    }

    public static Date getDateFromString(String date){
        Date convertedCurrentDate=null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            convertedCurrentDate = sdf.parse(date);
        }catch (Exception e){
            e.printStackTrace();
        }
        return convertedCurrentDate;
    }

    public static BiConsumer<List<VendorCreationIntegrationDtoV2>, String> setStatus = (vendorCreationIntegrationDtos, status) ->
            vendorCreationIntegrationDtos.forEach(
                    vendorCreationIntegrationDto -> vendorCreationIntegrationDto.setStatus(status));


    public static BiConsumer<List<VendorCreationIntegrationDtoV6>, String> setStatusV6 = (vendorCreationIntegrationDtos, status) ->
            vendorCreationIntegrationDtos.forEach(
                    vendorCreationIntegrationDto -> vendorCreationIntegrationDto.setStatus(status));

    public static BiConsumer<List<VendorCreationIntegrationDtoV3>, String> setStatusV3 = (vendorCreationIntegrationDtosV3, status) ->
            vendorCreationIntegrationDtosV3.forEach(
                    vendorCreationIntegrationDtoV3 -> vendorCreationIntegrationDtoV3.setStatus(status));



    BiFunction<String, String, String> constructManfactureText = (manfStr, manfValue) ->{
        String str = "";
        if(StringUtils.hasLength(manfValue)) {
            str = str.concat(manfStr).concat(manfValue);
        }
        return str;
    };
    BiFunction<String, String, String> constructDesc = (str, val) -> {
        if(StringUtils.hasLength(val)) {
            if(StringUtils.hasLength(str)) {
                str = str.concat(", ");
            }
            str = str.concat(val);
        }
        return str;
    };

    public static BiConsumer<List<VendorCreationIntegrationDtoV4>, String> setStatusV4 = (vendorCreationIntegrationDtosV4, status) -> {
        vendorCreationIntegrationDtosV4.forEach((vendorCreationIntegrationDtoV4) -> {
            vendorCreationIntegrationDtoV4.setStatus(status);
        });
    };
}
