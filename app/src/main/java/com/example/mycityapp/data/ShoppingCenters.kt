package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.Place

val shoppingCenters = listOf(
    Place(
        name = "NorthPark Center",
        address = "8687 N Central Expy, Dallas, TX",
        description = "NorthPark Center, sometimes referred to as simply NorthPark, is an enclosed shopping mall in Dallas, Texas (United States). It is at the intersection of Loop 12 (Northwest Highway) and US 75 (North Central Expressway). Opened in 1965, it now has over 235 stores and restaurants and annual sales of over \$1 billion. It is the 20th-largest shopping mall in the US. It features the traditional retailers Macy's, Dillard's, Nordstrom, and Neiman Marcus, in addition to Arhaus, and Eataly. It features prominent specialty retailers such as Psycho Bunny, Vuori, Golden Goose, Balenciaga, Saint Laurent, and Versace.",
        imageResId = R.drawable.northpark_image
    ),
    Place(
        name = "The Shops at Legacy",
        address = "5741 Legacy Dr, Plano, TX",
        description = "Located in Plano, Texas, The Shops at Legacy is a popular shopping center offering a diverse range of products and services. With a 4.1-star rating based on 64 reviews, customers praise the center’s variety of options.",
        imageResId = R.drawable.shops_legacy_image
    ),
    Place(
        name = "Galleria Dallas",
        address = "13350 Dallas Pkwy, Dallas, TX",
        description = "The Galleria Dallas is a shopping mall and mixed-use development located at the intersection of Interstate 635 and the Dallas North Tollway in the North Dallas neighborhood of Dallas, Texas, United States.",
        imageResId = R.drawable.galleria_image
    )
)
