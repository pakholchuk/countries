package com.skifapp.myapplicationswa

import kotlin.random.Random

object World {

    fun random(): Country = countries[Random.nextInt(countries.size)]
    fun getAll(): List<Country> = countries

    private val countries: List<Country> = listOf(
        Country(name = "Afghanistan", callingCode = 93, iso3166Code = "AF", phoneLength = 9),
        Country(name = "Åland Islands", callingCode = 358, iso3166Code = "AX", phoneLength = 10),
        Country(name = "Albania", callingCode = 355, iso3166Code = "AL", phoneLength = 9),
        Country(name = "Algeria", callingCode = 213, iso3166Code = "DZ", phoneLength = 9),
        Country(name = "American Samoa", callingCode = 1, iso3166Code = "AS", phoneLength = 9),
        Country(name = "Andorra", callingCode = 376, iso3166Code = "AD", phoneLength = null),
        Country(name = "Angola", callingCode = 244, iso3166Code = "AO", phoneLength = null),
        Country(name = "Anguilla", callingCode = 1, iso3166Code = "AI", phoneLength = 10),
        Country(
            name = "Antigua and Barbuda",
            callingCode = 1,
            iso3166Code = "AG",
            phoneLength = 10
        ),
        Country(name = "Argentina", callingCode = 54, iso3166Code = "AR", phoneLength = null),
        Country(name = "Armenia", callingCode = 374, iso3166Code = "AM", phoneLength = 6),
        Country(name = "Aruba", callingCode = 297, iso3166Code = "AW", phoneLength = 7),
        Country(name = "Australia", callingCode = 61, iso3166Code = "AU", phoneLength = 9),
        Country(name = "Austria", callingCode = 43, iso3166Code = "AT", phoneLength = 10),
        Country(name = "Azerbaijan", callingCode = 994, iso3166Code = "AZ", phoneLength = 9),
        Country(name = "Bahamas", callingCode = 1, iso3166Code = "BS", phoneLength = 10),
        Country(name = "Bahrain", callingCode = 973, iso3166Code = "BH", phoneLength = 8),
        Country(name = "Bangladesh", callingCode = 880, iso3166Code = "BD", phoneLength = 10),
        Country(name = "Barbados", callingCode = 1, iso3166Code = "BB", phoneLength = 10),
        Country(name = "Belarus", callingCode = 375, iso3166Code = "BY", phoneLength = 9),
        Country(name = "Belgium", callingCode = 32, iso3166Code = "BE", phoneLength = 9),
        Country(name = "Belize", callingCode = 501, iso3166Code = "BZ", phoneLength = 7),
        Country(name = "Benin", callingCode = 229, iso3166Code = "BJ", phoneLength = 6),
        Country(name = "Bermuda", callingCode = 1, iso3166Code = "BM", phoneLength = 10),
        Country(name = "Bhutan", callingCode = 975, iso3166Code = "BT", phoneLength = null),
        Country(name = "Bolivia", callingCode = 591, iso3166Code = "BO", phoneLength = null),
        Country(name = "Bonaire", callingCode = 599, iso3166Code = "BQ", phoneLength = null),
        Country(
            name = "Bosnia and Herzegovina",
            callingCode = 387,
            iso3166Code = "BA",
            phoneLength = 8
        ),
        Country(name = "Botswana", callingCode = 267, iso3166Code = "BW", phoneLength = null),
        Country(name = "Brazil", callingCode = 55, iso3166Code = "BR", phoneLength = 11),
        Country(
            name = "British Indian Ocean Territory",
            callingCode = 246,
            iso3166Code = "IO",
            phoneLength = 7
        ),
        Country(name = "Brunei", callingCode = 673, iso3166Code = "BN", phoneLength = null),
        Country(name = "Bulgaria", callingCode = 359, iso3166Code = "BG", phoneLength = null),
        Country(name = "Burkina Faso", callingCode = 226, iso3166Code = "BF", phoneLength = 8),
        Country(name = "Burundi", callingCode = 257, iso3166Code = "BI", phoneLength = null),
        Country(name = "Cambodia", callingCode = 855, iso3166Code = "KH", phoneLength = 9),
        Country(name = "Cameroon", callingCode = 237, iso3166Code = "CM", phoneLength = 9),
        Country(name = "Canada", callingCode = 1, iso3166Code = "CA", phoneLength = 10),
        Country(name = "Cape Verde", callingCode = 238, iso3166Code = "CV", phoneLength = null),
        Country(name = "Cayman Islands", callingCode = 1, iso3166Code = "KY", phoneLength = 10),
        Country(
            name = "Central African Republic",
            callingCode = 236,
            iso3166Code = "CF",
            phoneLength = null
        ),
        Country(name = "Chad", callingCode = 235, iso3166Code = "TD", phoneLength = 8),
        Country(name = "Chile", callingCode = 56, iso3166Code = "CL", phoneLength = 9),
        Country(name = "Colombia", callingCode = 57, iso3166Code = "CO", phoneLength = 10),
        Country(name = "Comoros", callingCode = 269, iso3166Code = "KM", phoneLength = null),
        Country(name = "Cook Islands", callingCode = 682, iso3166Code = "CK", phoneLength = 5),
        Country(name = "Costa Rica", callingCode = 506, iso3166Code = "CR", phoneLength = 8),
        Country(name = "Croatia", callingCode = 385, iso3166Code = "HR", phoneLength = 9),
        Country(name = "Cuba", callingCode = 53, iso3166Code = "CU", phoneLength = null),
        Country(name = "Curaçao", callingCode = 599, iso3166Code = "CW", phoneLength = null),
        Country(name = "Cyprus", callingCode = 357, iso3166Code = "CY", phoneLength = 8),
        Country(name = "Czech Republic", callingCode = 420, iso3166Code = "CZ", phoneLength = 9),
        Country(
            name = "Democratic Republic of Congo",
            callingCode = 243,
            iso3166Code = "CD",
            phoneLength = null
        ),
        Country(name = "Denmark", callingCode = 45, iso3166Code = "DK", phoneLength = 8),
        Country(name = "Djibouti", callingCode = 253, iso3166Code = "DJ", phoneLength = null),
        Country(name = "Dominica", callingCode = 1, iso3166Code = "DM", phoneLength = 10),
        Country(name = "Ecuador", callingCode = 593, iso3166Code = "EC", phoneLength = null),
        Country(name = "Egypt", callingCode = 20, iso3166Code = "EG", phoneLength = 10),
        Country(name = "El Salvador", callingCode = 503, iso3166Code = "SV", phoneLength = 8),
        Country(name = "England", callingCode = 44, iso3166Code = "GB_ENG", phoneLength = 10),
        Country(
            name = "Equatorial Guinea",
            callingCode = 240,
            iso3166Code = "GQ",
            phoneLength = null
        ),
        Country(name = "Eritrea", callingCode = 291, iso3166Code = "ER", phoneLength = null),
        Country(name = "Estonia", callingCode = 372, iso3166Code = "EE", phoneLength = null),
        Country(name = "Eswatini", callingCode = 268, iso3166Code = "SZ", phoneLength = 8),
        Country(name = "Ethiopia", callingCode = 251, iso3166Code = "ET", phoneLength = null),
        Country(name = "Falkland Islands", callingCode = 500, iso3166Code = "FK", phoneLength = 5),
        Country(name = "Faroe Islands", callingCode = 298, iso3166Code = "FO", phoneLength = 5),
        Country(
            name = "Federated States of Micronesia",
            callingCode = 691,
            iso3166Code = "FJ",
            phoneLength = 7
        ),
        Country(name = "Fiji", callingCode = 679, iso3166Code = "FI", phoneLength = null),
        Country(name = "Finland", callingCode = 358, iso3166Code = "FR", phoneLength = null),
        Country(name = "France", callingCode = 33, iso3166Code = "GF", phoneLength = 9),
        Country(name = "French Polynesia", callingCode = 689, iso3166Code = "PF", phoneLength = 6),
        Country(name = "Gabon", callingCode = 241, iso3166Code = "GA", phoneLength = 7),
        Country(name = "Gambia", callingCode = 220, iso3166Code = "GM", phoneLength = null),
        Country(name = "Georgia", callingCode = 995, iso3166Code = "GE", phoneLength = 9),
        Country(name = "Germany", callingCode = 49, iso3166Code = "DE", phoneLength = 10),
        Country(name = "Ghana", callingCode = 233, iso3166Code = "GH", phoneLength = 9),
        Country(name = "Gibraltar", callingCode = 350, iso3166Code = "GI", phoneLength = null),
        Country(name = "Greece", callingCode = 30, iso3166Code = "GR", phoneLength = 10),
        Country(name = "Greenland", callingCode = 299, iso3166Code = "GL", phoneLength = 6),
        Country(name = "Grenada", callingCode = 1, iso3166Code = "GD", phoneLength = 10),
        Country(name = "Guadeloupe", callingCode = 590, iso3166Code = "GP", phoneLength = 9),
        Country(name = "Guam", callingCode = 1, iso3166Code = "GU", phoneLength = 10),
        Country(name = "Guatemala", callingCode = 502, iso3166Code = "GT", phoneLength = 8),
        Country(name = "Guernsey", callingCode = 44, iso3166Code = "GG", phoneLength = 10),
        Country(name = "Guinea", callingCode = 224, iso3166Code = "GN", phoneLength = null),
        Country(name = "Guinea-Bissau", callingCode = 245, iso3166Code = "GW", phoneLength = null),
        Country(name = "Guyana", callingCode = 592, iso3166Code = "GY", phoneLength = null),
        Country(name = "Haiti", callingCode = 509, iso3166Code = "HT", phoneLength = null),
        Country(name = "Honduras", callingCode = 504, iso3166Code = "HN", phoneLength = 8),
        Country(name = "Hong Kong", callingCode = 852, iso3166Code = "HK", phoneLength = 8),
        Country(name = "Hungary", callingCode = 36, iso3166Code = "HU", phoneLength = 9),
        Country(name = "Iceland", callingCode = 354, iso3166Code = "IS", phoneLength = null),
        Country(name = "India", callingCode = 91, iso3166Code = "IN", phoneLength = 10),
        Country(name = "Indonesia", callingCode = 62, iso3166Code = "ID", phoneLength = 9),
        Country(name = "Iran", callingCode = 98, iso3166Code = "IR", phoneLength = null),
        Country(name = "Iraq", callingCode = 964, iso3166Code = "IQ", phoneLength = null),
        Country(name = "Ireland", callingCode = 353, iso3166Code = "IE", phoneLength = 9),
        Country(name = "Isle of Man", callingCode = 44, iso3166Code = "IM", phoneLength = 10),
        Country(name = "Israel", callingCode = 972, iso3166Code = "IL", phoneLength = 9),
        Country(name = "Italy", callingCode = 39, iso3166Code = "IT", phoneLength = 10),
        Country(name = "Ivory Coast", callingCode = 225, iso3166Code = "CI", phoneLength = null),
        Country(name = "Jamaica", callingCode = 1, iso3166Code = "JM", phoneLength = 10),
        Country(name = "Japan", callingCode = 81, iso3166Code = "JP", phoneLength = 10),
        Country(name = "Jersey", callingCode = 44, iso3166Code = "JE", phoneLength = 10),
        Country(name = "Jordan", callingCode = 962, iso3166Code = "JO", phoneLength = null),
        Country(name = "Kazakhstan", callingCode = 7, iso3166Code = "KZ", phoneLength = 10, mobilePhonePrefixes = listOf(
            700, 701, 702, 705, 707, 708, 747, 771, 775, 776, 777, 778
        )),
        Country(name = "Kenya", callingCode = 254, iso3166Code = "KE", phoneLength = 10),
        Country(name = "Kiribati", callingCode = 686, iso3166Code = "KI", phoneLength = 8),
        Country(name = "Kosovo", callingCode = 383, iso3166Code = "XK", phoneLength = 8),
        Country(name = "Kuwait", callingCode = 965, iso3166Code = "KW", phoneLength = 8),
        Country(name = "Kyrgyzstan", callingCode = 996, iso3166Code = "KG", phoneLength = null),
        Country(name = "Laos", callingCode = 856, iso3166Code = "LA", phoneLength = null),
        Country(name = "Latvia", callingCode = 371, iso3166Code = "LV", phoneLength = 8),
        Country(name = "Lebanon", callingCode = 961, iso3166Code = "LB", phoneLength = 7),
        Country(name = "Lesotho", callingCode = 266, iso3166Code = "LS", phoneLength = null),
        Country(name = "Liberia", callingCode = 231, iso3166Code = "LR", phoneLength = 7),
        Country(name = "Libya", callingCode = 218, iso3166Code = "LY", phoneLength = 10),
        Country(name = "Liechtenstein", callingCode = 423, iso3166Code = "LI", phoneLength = null),
        Country(name = "Lithuania", callingCode = 370, iso3166Code = "LT", phoneLength = 8),
        Country(name = "Luxembourg", callingCode = 352, iso3166Code = "LU", phoneLength = 9),
        Country(name = "Macau", callingCode = 853, iso3166Code = "MO", phoneLength = null),
        Country(name = "Madagascar", callingCode = 261, iso3166Code = "MG", phoneLength = null),
        Country(name = "Malawi", callingCode = 265, iso3166Code = "MW", phoneLength = null),
        Country(name = "Malaysia", callingCode = 60, iso3166Code = "MY", phoneLength = 7),
        Country(name = "Maldives", callingCode = 960, iso3166Code = "MV", phoneLength = 7),
        Country(name = "Mali", callingCode = 223, iso3166Code = "ML", phoneLength = null),
        Country(name = "Malta", callingCode = 356, iso3166Code = "MT", phoneLength = 8),
        Country(name = "Marshall Islands", callingCode = 692, iso3166Code = "MH", phoneLength = 7),
        Country(name = "Martinique", callingCode = 596, iso3166Code = "MQ", phoneLength = 9),
        Country(name = "Mauritania", callingCode = 222, iso3166Code = "MR", phoneLength = null),
        Country(name = "Mauritius", callingCode = 230, iso3166Code = "MU", phoneLength = 8),
        Country(name = "Mayotte", callingCode = 262, iso3166Code = "YT", phoneLength = null),
        Country(name = "Mexico", callingCode = 52, iso3166Code = "MX", phoneLength = 10),
        Country(name = "Moldova", callingCode = 373, iso3166Code = "MD", phoneLength = 8),
        Country(name = "Monaco", callingCode = 377, iso3166Code = "MC", phoneLength = null),
        Country(name = "Mongolia", callingCode = 976, iso3166Code = "MN", phoneLength = 8),
        Country(name = "Montenegro", callingCode = 382, iso3166Code = "ME", phoneLength = 8),
        Country(name = "Montserrat", callingCode = 1, iso3166Code = "MS", phoneLength = 10),
        Country(name = "Morocco", callingCode = 212, iso3166Code = "MA", phoneLength = null),
        Country(name = "Mozambique", callingCode = 258, iso3166Code = "MZ", phoneLength = 12),
        Country(name = "Myanmar", callingCode = 95, iso3166Code = "MM", phoneLength = 8),
        Country(name = "Namibia", callingCode = 264, iso3166Code = "NA", phoneLength = null),
        Country(name = "Nauru", callingCode = 674, iso3166Code = "NR", phoneLength = null),
        Country(name = "Nepal", callingCode = 977, iso3166Code = "NP", phoneLength = 10),
        Country(name = "Netherlands", callingCode = 31, iso3166Code = "NL", phoneLength = 9),
        Country(name = "New Caledonia", callingCode = 687, iso3166Code = "NC", phoneLength = 6),
        Country(name = "New Zealand", callingCode = 64, iso3166Code = "NZ", phoneLength = null),
        Country(name = "Nicaragua", callingCode = 505, iso3166Code = "NI", phoneLength = 8),
        Country(name = "Niger", callingCode = 227, iso3166Code = "NE", phoneLength = 8),
        Country(name = "Nigeria", callingCode = 234, iso3166Code = "NG", phoneLength = 8),
        Country(name = "Niue", callingCode = 683, iso3166Code = "NU", phoneLength = 4),
        Country(name = "Norfolk Island", callingCode = 672, iso3166Code = "NF", phoneLength = 6),
        Country(name = "North Korea", callingCode = 850, iso3166Code = "KP", phoneLength = null),
        Country(name = "North Macedonia", callingCode = 389, iso3166Code = "MK", phoneLength = 8),
        Country(
            name = "Northern Ireland",
            callingCode = 44,
            iso3166Code = "GB_NIR",
            phoneLength = 10
        ),
        Country(
            name = "Northern Mariana Islands",
            callingCode = 1,
            iso3166Code = "MP",
            phoneLength = 10
        ),
        Country(name = "Norway", callingCode = 47, iso3166Code = "NO", phoneLength = 8),
        Country(name = "Oman", callingCode = 968, iso3166Code = "OM", phoneLength = 8),
        Country(name = "Pakistan", callingCode = 92, iso3166Code = "PK", phoneLength = 10),
        Country(name = "Palau", callingCode = 680, iso3166Code = "PW", phoneLength = 7),
        Country(
            name = "Palestine, State of",
            callingCode = 970,
            iso3166Code = "PS",
            phoneLength = 9
        ),
        Country(name = "Panama", callingCode = 507, iso3166Code = "PA", phoneLength = 8),
        Country(
            name = "Papua New Guinea",
            callingCode = 675,
            iso3166Code = "PG",
            phoneLength = null
        ),
        Country(name = "Paraguay", callingCode = 595, iso3166Code = "PY", phoneLength = 9),
        Country(
            name = "People's Republic of China",
            callingCode = 86,
            iso3166Code = "CN",
            phoneLength = 11
        ),
        Country(name = "Peru", callingCode = 51, iso3166Code = "PE", phoneLength = 9),
        Country(name = "Philippines", callingCode = 63, iso3166Code = "PH", phoneLength = 10),
        Country(name = "Poland", callingCode = 48, iso3166Code = "PL", phoneLength = 9),
        Country(name = "Portugal", callingCode = 351, iso3166Code = "PT", phoneLength = 9),
        Country(name = "Puerto Rico", callingCode = 1, iso3166Code = "PR", phoneLength = 10),
        Country(name = "Qatar", callingCode = 974, iso3166Code = "QA", phoneLength = 8),
        Country(
            name = "Republic of Congo",
            callingCode = 242,
            iso3166Code = "CG",
            phoneLength = null
        ),
        Country(name = "Réunion", callingCode = 262, iso3166Code = "RE", phoneLength = 9),
        Country(name = "Romania", callingCode = 40, iso3166Code = "RO", phoneLength = 10),
        Country(
            name = "Russia",
            callingCode = 7,
            iso3166Code = "RU",
            phoneLength = 10,
            mobilePhonePrefixes = listOf(
                91, 92, 93, 96, 901, 902, 903, 904, 905, 906, 908, 909, 950, 951, 952, 953, 980, 983
            )
        ),
        Country(name = "Rwanda", callingCode = 250, iso3166Code = "RW", phoneLength = null),
        Country(
            name = "Saint Barthélemy",
            callingCode = 590,
            iso3166Code = "BL",
            phoneLength = null
        ),
        Country(
            name = "Saint Helena and Tristan da Cunha",
            callingCode = 290,
            iso3166Code = "SH",
            phoneLength = 4
        ),
        Country(
            name = "Saint Kitts and Nevis",
            callingCode = 1,
            iso3166Code = "KN",
            phoneLength = 10
        ),
        Country(name = "Saint Lucia", callingCode = 1, iso3166Code = "LC", phoneLength = 10),
        Country(
            name = "Saint Pierre and Miquelon",
            callingCode = 508,
            iso3166Code = "PM",
            phoneLength = null
        ),
        Country(
            name = "Saint Vincent and the Grenadines",
            callingCode = 1,
            iso3166Code = "VC",
            phoneLength = 10
        ),
        Country(name = "Samoa", callingCode = 685, iso3166Code = "WS", phoneLength = 5),
        Country(name = "San Marino", callingCode = 378, iso3166Code = "SM", phoneLength = null),
        Country(
            name = "São Tomé and Príncipe",
            callingCode = 239,
            iso3166Code = "ST",
            phoneLength = null
        ),
        Country(name = "Saudi Arabia", callingCode = 966, iso3166Code = "SA", phoneLength = 9),
        Country(name = "Scotland", callingCode = 44, iso3166Code = "GB_SCT", phoneLength = 10),
        Country(name = "Senegal", callingCode = 221, iso3166Code = "SN", phoneLength = null),
        Country(name = "Serbia", callingCode = 381, iso3166Code = "RS", phoneLength = 9),
        Country(name = "Seychelles", callingCode = 248, iso3166Code = "SC", phoneLength = null),
        Country(name = "Sierra Leone", callingCode = 232, iso3166Code = "SL", phoneLength = null),
        Country(name = "Singapore", callingCode = 65, iso3166Code = "SG", phoneLength = 8),
        Country(
            name = "Slovakia",
            callingCode = 421,
            iso3166Code = "SK",
            phoneLength = 9
        ),
        Country(name = "Slovenia", callingCode = 386, iso3166Code = "SI", phoneLength = null),
        Country(name = "Solomon Islands", callingCode = 677, iso3166Code = "SB", phoneLength = 7),
        Country(name = "Somalia", callingCode = 252, iso3166Code = "SO", phoneLength = 7 or 8),
        Country(name = "South Africa", callingCode = 27, iso3166Code = "ZA", phoneLength = 9),
        Country(
            name = "South Georgia and the South Sandwich Islands",
            callingCode = 500,
            iso3166Code = "GS",
            phoneLength = null
        ),
        Country(name = "South Korea", callingCode = 82, iso3166Code = "KR", phoneLength = 10),
        Country(name = "South Sudan", callingCode = 211, iso3166Code = "SS", phoneLength = null),
        Country(name = "Spain", callingCode = 34, iso3166Code = "ES", phoneLength = 9),
        Country(name = "Sri Lanka", callingCode = 94, iso3166Code = "LK", phoneLength = 7),
        Country(name = "Sudan", callingCode = 249, iso3166Code = "SD", phoneLength = null),
        Country(name = "Suriname", callingCode = 597, iso3166Code = "SR", phoneLength = null),
        Country(name = "Sweden", callingCode = 46, iso3166Code = "SE", phoneLength = 7),
        Country(name = "Switzerland", callingCode = 41, iso3166Code = "CH", phoneLength = 9),
        Country(name = "Syria", callingCode = 963, iso3166Code = "SY", phoneLength = 9),
        Country(name = "Taiwan", callingCode = 886, iso3166Code = "TW", phoneLength = 9),
        Country(name = "Tajikistan", callingCode = 992, iso3166Code = "TJ", phoneLength = null),
        Country(name = "Tanzania", callingCode = 255, iso3166Code = "TZ", phoneLength = null),
        Country(name = "Thailand", callingCode = 66, iso3166Code = "TH", phoneLength = 9),
        Country(name = "Togo", callingCode = 228, iso3166Code = "TG", phoneLength = 8),
        Country(name = "Tokelau", callingCode = 690, iso3166Code = "TK", phoneLength = null),
        Country(name = "Tonga", callingCode = 676, iso3166Code = "TO", phoneLength = null),
        Country(
            name = "Trinidad and Tobago",
            callingCode = 1,
            iso3166Code = "TT",
            phoneLength = 10
        ),
        Country(name = "Tunisia", callingCode = 216, iso3166Code = "TN", phoneLength = 8),
        Country(name = "Turkey", callingCode = 90, iso3166Code = "TR", phoneLength = 11),
        Country(name = "Turkmenistan", callingCode = 993, iso3166Code = "TM", phoneLength = null),
        Country(
            name = "Turks and Caicos Islands",
            callingCode = 1,
            iso3166Code = "TC",
            phoneLength = 10
        ),
        Country(name = "Tuvalu", callingCode = 688, iso3166Code = "TV", phoneLength = null),
        Country(name = "Uganda", callingCode = 256, iso3166Code = "UG", phoneLength = null),
        Country(name = "Ukraine", callingCode = 380, iso3166Code = "UA", phoneLength = 9),
        Country(
            name = "United Arab Emirates",
            callingCode = 971,
            iso3166Code = "AE",
            phoneLength = 9
        ),
        Country(
            name = "United Kingdom",
            callingCode = 44,
            iso3166Code = "GB",
            phoneLength = 10
        ),
        Country(
            name = "USA",
            callingCode = 1,
            iso3166Code = "US",
            phoneLength = 10
        ),
        Country(name = "Uruguay", callingCode = 598, iso3166Code = "UY", phoneLength = null),
        Country(name = "Uzbekistan", callingCode = 998, iso3166Code = "UZ", phoneLength = null),
        Country(name = "Vanuatu", callingCode = 678, iso3166Code = "VU", phoneLength = null),
        Country(name = "Vatican City", callingCode = 39, iso3166Code = "VA", phoneLength = 10),
        Country(name = "Venezuela", callingCode = 58, iso3166Code = "VE", phoneLength = 7),
        Country(name = "Vietnam", callingCode = 84, iso3166Code = "VN", phoneLength = 9),
        Country(name = "Wales", callingCode = 44, iso3166Code = "GB_WLS", phoneLength = 10),
        Country(
            name = "Wallis and Futuna",
            callingCode = 681,
            iso3166Code = "WF",
            phoneLength = null
        ),
        Country(name = "Yemen", callingCode = 967, iso3166Code = "YE", phoneLength = 9),
        Country(name = "Zambia", callingCode = 260, iso3166Code = "ZM", phoneLength = null),
        Country(name = "Zimbabwe", callingCode = 263, iso3166Code = "ZW", phoneLength = 9),
    )
}