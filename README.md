
# 🌤️ WeatherApp

<div align="center">



![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)




![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)




![WeatherAPI](https://img.shields.io/badge/WeatherAPI-00BFFF?style=for-the-badge&logo=cloudflare&logoColor=white)




![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)



**Aplikasi cuaca Android yang elegan dan real-time**

</div>

---

## ✨ Fitur

- 🌡️ **Suhu Real-time** — Tampilkan suhu terkini berdasarkan kota
- 💧 **Kelembaban** — Info kelembaban udara secara akurat
- 🌬️ **Kecepatan Angin** — Data angin dalam km/h
- 🤔 **Feels Like** — Suhu yang dirasakan tubuh
- 🌍 **Cari Kota** — Cari cuaca kota manapun di dunia
- 🎨 **Dark UI** — Tampilan gelap yang modern dan elegan

---

## 📸 Screenshot

> Coming soon...

---

## 🛠️ Tech Stack

| Teknologi | Kegunaan |
|-----------|----------|
| Kotlin | Bahasa pemrograman utama |
| Retrofit | HTTP client untuk API |
| OkHttp | Networking layer |
| Gson | JSON parsing |
| Coroutines | Async programming |
| ViewBinding | UI binding |
| Material Design 3 | Komponen UI |

---

## 🚀 Cara Install

### Prasyarat
- Android Studio / Android Code Studio
- Android SDK 21+
- JDK 17

### Clone Project
\`\`\`bash
git clone https://github.com/Shop333/WeatherApp.git
cd WeatherApp
\`\`\`

### Setup API Key
1. Daftar di [weatherapi.com](https://weatherapi.com)
2. Ambil API key kamu
3. Buka file \`WeatherRepository.kt\`
4. Ganti nilai \`apiKey\` dengan API key kamu

### Build & Run
\`\`\`bash
./gradlew assembleDebug
\`\`\`

---

## 📁 Struktur Project

\`\`\`
WeatherApp/
├── app/
│   └── src/main/
│       ├── kotlin/com/example/myempty/weatherapp/
│       │   ├── api/
│       │   │   ├── WeatherApi.kt
│       │   │   └── RetrofitInstance.kt
│       │   ├── model/
│       │   │   └── WeatherModel.kt
│       │   ├── repository/
│       │   │   └── WeatherRepository.kt
│       │   └── MainActivity.kt
│       ├── res/layout/
│       │   └── activity_main.xml
│       └── AndroidManifest.xml
└── build.gradle.kts
\`\`\`

---

## 🌐 API Reference

App ini menggunakan [WeatherAPI](https://weatherapi.com):

\`\`\`
GET https://api.weatherapi.com/v1/current.json
  ?key=YOUR_API_KEY
  &q=CITY_NAME
  &aqi=no
\`\`\`

---

## 👤 Developer

**Shop333**
- GitHub: [@Shop333](https://github.com/Shop333)

---

## 📝 License

\`\`\`
MIT License — bebas digunakan dan dimodifikasi
\`\`\`

---

<div align="center">
  Made with ❤️ using Kotlin & WeatherAPI
</div>