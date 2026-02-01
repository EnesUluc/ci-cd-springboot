Jenkinsi githuba bağlama
1 - Jenkins -> Manage Jenkins -> Credentials
2 - Add Credentials (global)
3 - Kind = Secret text
4 - secret = tokeni gir
5 - ID = isim ver
 
6 - Manage Jenkins -> System
7 - Github başlığını bul
8 - github server - add server
9 - credentials = az önce eklediğin
10 - test

11- Projenin Configure sayfasına git.

12 - Post-build Action s (Build sonrası işlemler) kısmına gel.

13 - Add post-build action butonuna bas.

14 - Listeden "Set GitHub commit status (universal)" (veya benzeri "Set build status on GitHub commit") seçeneğini seç.
Ayarı "Last build status" olarak bırakabilirsin.

15 - Projeyi kaydet ve Build Now diyerek bir kere manuel çalıştır.

GITHUB AYARI
1 - Repo -> Settings -> Branches
2 - Add branch protection rule
3 - main
4 - "Require status checks to pass before merging" kutusunu işaretle.
