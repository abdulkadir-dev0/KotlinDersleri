package com.example.abdulkadir.kotlindersleri.degiskenler

// Ödev 2

// 1. Dereceyi Fahrenheit'e Çevirme
fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

// 2. Dikdörtgen Çevresi Hesaplama
fun dikdortgenCevresi(kenar1: Int, kenar2: Int): Int {
    return 2 * (kenar1 + kenar2)
}

// 3. Faktöriyel Hesaplama (Döngü ile)
fun faktoriyel(sayi: Int): Long {
    var sonuc: Long = 1
    for (i in 2..sayi) {
        sonuc *= i
    }
    return sonuc
}

// 4. Kelimedeki 'a' Harfi Sayısı (Case-Sensitive)
fun countA(kelime: String): Int {
    return kelime.count { it == 'a' }
}

// Ödev 2.1

// 1. İç Açılar Toplamı Hesaplama
fun icAcilariToplami(kenarSayisi: Int): Int {
    require(kenarSayisi >= 3) { "Kenar sayısı en az 3 olmalıdır" }
    return (kenarSayisi - 2) * 180
}

// 2. Maaş Hesaplama (Günlük Çalışma)
fun maasHesapla(calisilanGun: Int): Int {
    val toplamSaat = calisilanGun * 8
    val mesaiSaati = if (toplamSaat > 160) toplamSaat - 160 else 0
    return (160 * 10) + (mesaiSaati * 20)
}

// 3. Kota Ücreti Hesaplama
fun kotaUcretiHesapla(kotaGB: Int): Int {
    val sabitUcret = 100
    val asimGB = kotaGB - 50
    return if (kotaGB <= 50) sabitUcret else sabitUcret + (asimGB * 4)
}


fun main() {
    //Ödev 2
    println("30°C = ${celsiusToFahrenheit(30.0)}°F")
    println("Dikdörtgen Çevresi (5,7): ${dikdortgenCevresi(5, 7)}")
    println("5! = ${faktoriyel(5)}")
    println("'Karakalem'deki a sayısı: ${countA("Karakalem")}")

    // Ödev 2.1
    println("5 kenarlı şeklin iç açıları: ${icAcilariToplami(5)}°")
    println("22 günlük maaş: ${maasHesapla(22)}₺")
    println("65 GB kota ücreti: ${kotaUcretiHesapla(65)}₺")
}

