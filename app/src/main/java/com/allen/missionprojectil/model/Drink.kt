package com.allen.missionprojectil.model

import com.allen.missionprojectil.R

data class Drink (
    val id: Long,
    val image: Int,
    val title: String,
    val price: String,
    val description: String
)

val dummyDrink = listOf(
    Drink(
        1,
        R.drawable.drink1,
        "Es Campur",
        "Rp 15.000",
        "Es Campur adalah minuman segar Indonesia yang terdiri dari potongan buah segar, agar-agar, nata de coco, cincau, dan es serut, disajikan dalam mangkuk besar. Dengan kombinasi rasa manis dari sirup dan kesegaran buah-buahan, minuman ini cocok untuk menghilangkan dahaga dan menyegarkan di hari panas."),
    Drink(
        2,
        R.drawable.drink2,
        "Es Doger",
        "Rp 10.000",
        "Es Doger adalah minuman tradisional Indonesia yang terdiri dari campuran es serut, susu kental manis, kelapa muda parut, ketan hitam, dan sirup gula merah. Ditambahkan potongan roti tawar atau biji selasih untuk memberikan tekstur yang unik. Es Doger menyajikan kombinasi manis, segar, dan gurih yang memuaskan selera, menjadi pilihan yang sempurna untuk dinikmati di cuaca panas."),
    Drink(
        3, R.drawable.drink3,
        "Es Buah",
        "Rp 10.000",
        "Es Buah adalah minuman segar yang terdiri dari potongan buah-buahan segar seperti nanas, semangka, melon, jambu biji, dan jeruk, yang dicampur dengan es serut dan disajikan dengan tambahan sirup atau susu kental manis. Menyegarkan dan kaya akan vitamin, Es Buah adalah pilihan yang populer untuk mengatasi haus dan menikmati rasa segar alami buah-buahan."),
    Drink(
        4,
        R.drawable.drink4,
        "Es Cincau",
        "Rp 10.000",
        "Es Cincau adalah minuman tradisional Indonesia yang terdiri dari cincau yang merupakan agar-agar hitam yang dipotong kecil-kecil, disajikan dengan es serut dan sirup gula merah atau susu kental manis. Minuman ini memberikan sensasi menyegarkan dengan kombinasi unik antara tekstur kenyal cincau dan kesegaran es serut, serta cita rasa manis dari sirup gula merah yang khas. Es Cincau adalah pilihan yang populer untuk menikmati kelezatan dan kesegaran dalam satu gelas."),
    Drink(5,
        R.drawable.drink5,
        "Es Kopyor",
        "Rp 10.000",
        "Es Kopyor adalah minuman khas Indonesia yang terbuat dari daging kelapa muda yang sudah matang, disajikan dengan es serut dan susu kental manis. Minuman ini menawarkan rasa segar dan gurih yang unik dari daging kelapa kopyor, menjadikannya pilihan yang menyegarkan untuk dinikmati di cuaca panas."),
    Drink(6,
        R.drawable.drink6,
        "Es Jeruk",
        "Rp 8.000",
        "Es Jeruk adalah minuman segar yang terbuat dari perasan jeruk segar yang dicampur dengan es serut dan gula sirup. Minuman ini menawarkan kombinasi sempurna antara rasa manis dan asam jeruk yang menyegarkan, cocok dinikmati sebagai penyejuk di hari panas."),
    Drink(
        7,
        R.drawable.drink7,
        "Es Coklat",
        "Rp 10.000",
        "Es Coklat adalah minuman dingin yang terbuat dari campuran bubuk coklat, susu, dan es serut. Menyajikan rasa manis dan gurih dari coklat yang menyegarkan, minuman ini adalah pilihan yang sempurna untuk memuaskan keinginan untuk sesuatu yang manis dan segar."),
    Drink(
        8,
        R.drawable.drink8,
        "Es Teh",
        "Rp 8.000",
        "Es Teh adalah minuman dingin yang terbuat dari teh yang diseduh dan didinginkan, disajikan dengan es batu. Memberikan rasa segar dan menyegarkan dengan cita rasa teh yang lezat, Es Teh adalah pilihan yang populer untuk dinikmati di berbagai kesempatan."),
    Drink(
        9,
        R.drawable.drink9,
        "Es Kopi Susu",
        "Rp 15.000",
        "Es Kopi Susu adalah minuman dingin yang terdiri dari kopi yang diseduh kemudian dicampur dengan susu dan disajikan dengan es batu. Menyajikan perpaduan yang lembut antara rasa kopi yang khas dengan kelembutan susu, Es Kopi Susu adalah pilihan yang menyegarkan dan memuaskan bagi para pecinta kopi."),
    Drink(
        10,
        R.drawable.drink10,
        "Es Susu Kocok",
        "Rp 15.000",
        "Es Susu Kocok adalah minuman segar yang terbuat dari susu yang dikocok dengan es batu hingga menghasilkan tekstur yang lembut dan berbusa. Menawarkan kesegaran susu yang dingin dan kenikmatan es yang menyegarkan, Es Susu Kocok adalah pilihan yang menyenangkan untuk dinikmati di hari panas."),
    Drink(
        11,
        R.drawable.drink11,
        "Es Alpukat",
        "Rp 15.000",
        "Es Alpukat adalah minuman segar yang terbuat dari daging alpukat yang dihaluskan, dicampur dengan susu, gula, dan es batu. Menyajikan kombinasi kaya akan nutrisi dari alpukat dengan kesegaran es yang menyegarkan, Es Alpukat adalah pilihan yang lezat dan menyehatkan untuk dinikmati kapan pun."),
    Drink(
        12,
        R.drawable.drink12,
        "Es Semangka",
        "Rp 10.000",
        "Es Semangka adalah minuman segar yang terbuat dari potongan semangka yang disajikan dengan es batu dan ditambahkan dengan sedikit perasan jeruk nipis atau sirup untuk meningkatkan kesegaran. Menyajikan kombinasi manis dan segar dari buah semangka yang lezat, Es Semangka adalah pilihan yang menyegarkan untuk dinikmati di musim panas."),
)