<h1><b> Final Project </b></h1>

Projek ini berisi automation testing sebagai projek akhir kursus QA engineer. </br>
Untuk API test menggunakan public API berikut: https://dummyapi.io/docs</br>
Untuk Web UI Test menggunakan website berikut sebagai target dan pembuatan test scenario: https://www.demoblaze.com/ </br>

<h3>Tools yang digunakan : </h3>
1. JUnit <br/>
2. RestAssured <br/>
3. Selenium <br/>
4. Cucumber <br/>
<br/>
Test dibagi menjadi 2 yaitu :
  
1. Test API (tag @api)
<img width="577" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/3d5ca480-4c31-4c74-a1a0-cf78e907b093">

2. Test WEB UI (tag @web)
<img width="592" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/208bcca2-42f4-49e0-947e-40f9df59d9bb">


<h2>Test API</h2>
Tes API terdiri dari: <br/>
- Test Get List Data <br/>
- Test Create New User <br/>
- Test Delete User <br/>
- Test Update User <br/>
- Test Get List of Tags <br/>

<h2>Test WEB</h2>
Tes Web terdiri dari: <br/>
- Signup With New Account <br/>
- Signup With Account Already Exist <br/>
- Login with Valid Account <br/>
- Login with Invalid Account <br/>
- Description Product Page <br/>
- Category Product <br/>
- Add to Cart and Remove it <br/>
- Checkout <br/>
<br/>

<h2>Output</h2>
Hasil output lengkap berada di folder reports

<h3>Test API result</h3>

<img width="929" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/42803ecb-37a9-4f73-9ed1-79d58ae1d67e">

<h3>Test WebUI result</h3>

<img width="913" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/dc1fa5c8-1716-499c-bd4a-d45b9817789f">

<h2>Tutorial</h2>
<h3>Automation API</h3>
1. Create New Project dengan Intellij Idea dengan konfigurasi sebagai berikut :
<img width="929" src="https://github.com/user-attachments/assets/2a009421-0f40-4efa-a005-8c7a05f77cd7">

2. Pada file build.gradle, bagian depedencies. masukan beberapa depedency (untuk api testing) berikut
 
```java
  dependencies {
    testImplementation group: 'io.rest-assured', name: 'rest-assured', version: '5.4.0'
    implementation group: 'io.cucumber', name: 'cucumber-java', version: '7.15.0'
    implementation group: 'org.json', name: 'json', version: '20231013'
    testImplementation group: 'io.rest-assured', name: 'json-path', version: '5.3.0'
    testImplementation group: 'io.rest-assured', name: 'json-schema-validator', version: '5.3.0'
    
}
```
io.rest-assured : library java yang digunakan untuk API Restful, seperti mengirim method GET dan POST, menambahkan header, parameter dan body request serta dapat diintegrasi dengan framework test seperti JUnit dan TestNG
io.cucumber : library java yang digunakan untuk membuat scenario dengan gherkin, menerapkan pendekatan BDD
org.json : library untuk melakukan input payload menggunakan JSONObject
json-path : library yang digunakan untuk membaca letak file json yg akan dijadikan validasi
json-schema-validator : library untuk schema validator dengan file yang dibaca json-path

3. buat folder helper, definisikan file dengan nama endpoint.java. fungsinya untuk mendefine endpoint apa saja yang akan digunakan nanti (akan dipanggil)
![image](https://github.com/user-attachments/assets/4b345323-fd59-45c2-9839-62b7dc314d93)


4. di folder helper, buat file models.java, fungsinya untuk mensetup fungsi/method untuk setupheader, definisi method http request seperti get, post menggunkaan rest assured. method di models akan dipanggil di page nanti
![image](https://github.com/user-attachments/assets/f798b92e-a170-49cf-9665-45e098379cd9)

5. buat folder page, buat file dengan nama apipage.java , berisi method-method yang akan digunakan / dipanggil di step def. file di page ini seperti jembatan antara konfigurasi dengan stepdef. isinya seperti prepareURL() dimana baseURL di helper.Endpoint di panggil disini dan akan digunakan stepdef untuk "Given"nya
![image](https://github.com/user-attachments/assets/e4abf7dc-f812-4d20-ab71-9773dae65937)

6. buat folder feature, definiskan api.feature. ini adalah file cucumber yg berisi bahasa gherkin. buat skenario disini. dari sini bisa buat stepdef otomatis dengan "alt+enter" lalu "create step definition" otomatis mengcreate folder stepDef dan file stepfile (Apistep.java)
![image](https://github.com/user-attachments/assets/fa4b8e1f-c90e-47b1-bd56-e69013daa8ee)


7. di folder stepDef, definisikan stepfile yg tadi otomatis terbuat (apistep) dengan memanggil method dari folder page, yaitu apipage.java (integrasikan)
![image](https://github.com/user-attachments/assets/2abe6325-e6d3-4ece-b07c-55af163a780d)

8. buat folder runner, buat file runner (ApiRunner.java) untk menjalankan tes dengan cucumber,
   
![image](https://github.com/user-attachments/assets/ac759b05-5fc8-473e-8f30-6c1644445f88)
plugin pretty : agar saat menjalankan tes di log menjadi lebih terstruktur
glue : unutk menaruh tempat step definition (nama foldernya)
features = nama folder tempat menaruh tes scenario dengan file cucumber
tags : untuk menjalankan tes yang hanya memiliki tag yang sudah ditentukan di file cucumber
monokrom : Ini memastikan keluaran konsol tanpa format warna apa pun, sehingga lebih mudah dibaca di beberapa lingkungan.















