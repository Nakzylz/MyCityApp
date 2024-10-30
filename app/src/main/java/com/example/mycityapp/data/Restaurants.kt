package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.Place

val restaurants = listOf(
    Place(
        name = "Pecan Lodge",
        address = "2702 Main St, Dallas, TX",
        description = "Famous for its Texas BBQ and long lines—worth the wait! To most people, the name Pecan Lodge is synonymous with BBQ. But to Diane and me, it goes deeper than that. While the name originated from my grandfathers ranch in Abilene, what we do is anchored in the memories of cooking with all our grandparents. So it’s not surprising what when we first planted our business in Shed #2 at Dallas’ Farmer’s Market, we went back to our roots. I used everything I learned about working an offset pit. And Diane made sure we honored family recipes instead of following the latest trends.",
        imageResId = R.drawable.pecan_lodge_image
    ),
    Place(
        name = "Meso Maya",
        address = "1611 McKinney Ave, Dallas, TX",
        description = "Meso Maya is a Mexican, Southwestern, and Latin-inspired restaurant located in Dallas, Texas. It offers a variety of dishes, including nachos, seafood enchiladas, and queso dip, all made with traditional Mexican flavors and ingredients.",
        imageResId = R.drawable.meso_maya_image
    ),
    Place(
        name = "Uchi Dallas",
        address = "2817 Maple Ave, Dallas, TX",
        description = "Uchi Dallas is a Japanese restaurant located in Dallas, Texas, offering a range of seafood, sushi, and Asian-inspired dishes. The restaurant is known for its exceptional service, beautiful ambiance, and high-quality ingredients.",
        imageResId = R.drawable.uchi_image
    )
)
