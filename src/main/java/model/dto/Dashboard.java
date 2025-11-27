package model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Dashboard {
    private String medicineid;
    private String medicinecategory;
    private String medicinename;
    private String medicineexpirydate;
    private String medicinequantity;
    private Double medicineprice;
}
