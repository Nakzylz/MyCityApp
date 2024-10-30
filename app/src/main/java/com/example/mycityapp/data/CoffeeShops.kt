package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.Place

val coffeeShops = listOf(
    Place(
        name = "Houndstooth Coffee",
        address = "1900 N Henderson Ave, Dallas, TX",
        description = "Experience the vibrant coffee culture in Dallas, TX at Houndstooth Coffee. We are locally owned and serve the finest coffee, tea, beer, wine and pastries. Known for high-quality coffee and a cozy atmosphere.",
        imageResId = R.drawable.houndstooth_image // Replace with your actual drawable resource
    ),
    Place(
        name = "Ascension Coffee",
        address = "1621 Oak Lawn Ave, Dallas, TX",
        description = "A staple for locals, Ascension Coffee combines artisan coffee with an excellent food menu, perfect for breakfast or brunch. With a spacious interior, plenty of natural light, and an industrial-chic vibe, it provides a welcoming atmosphere for both casual catch-ups and business meetings.",
        imageResId = R.drawable.ascension_image // Replace with your actual drawable resource
    ),
    Place(
        name = "White Rock Coffee",
        address = "5930 Royal Ln, Dallas, TX",
        description = "The best local Dallas, TX coffee shop. They offer gourmet coffee blends, single origin coffees, fair trade and organic coffee with same-day roasts and shipping from our Texas home office",
        imageResId = R.drawable.whiterock_image // Replace with your actual drawable resource
    )
)

