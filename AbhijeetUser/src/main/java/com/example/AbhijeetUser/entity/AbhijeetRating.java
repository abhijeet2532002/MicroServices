package com.example.AbhijeetUser.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AbhijeetRating {
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String remark;
}
