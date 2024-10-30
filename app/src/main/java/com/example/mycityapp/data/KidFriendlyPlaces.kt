package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.Place

val kidFriendlyPlaces = listOf(
    Place(
        name = "Dallas Zoo",
        address = "650 S R L Thornton Fwy, Dallas, TX",
        description = "The Dallas Zoo is the largest and most historic zoo in Texas. Visitors can experience 106 acres of zoo animal encounters, exhibits, and more!",
        imageResId = R.drawable.dallas_zoo_image
    ),
    Place(
        name = "Perot Museum of Nature and Science",
        address = "2201 N Field St, Dallas, TX",
        description = "The Perot Museum of Nature and Science (shortened to Perot Museum) is a natural history and science museum in Dallas, Texas in Victory Park. The museum was named in honor of Margot and Ross Perot.",
        imageResId = R.drawable.perot_museum_image
    ),
    Place(
        name = "Klyde Warren Park",
        address = "2012 Woodall Rodgers Fwy, Dallas, TX",
        description = "An urban park with food trucks, events, and a dedicated play area for kids. The 5.4-acre Park relies on contributions from donors to keep it clean, safe and active for more than one million visitors each year.",
        imageResId = R.drawable.klyde_warren_image
    )
)
