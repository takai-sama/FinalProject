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

2. Pada file build.gradle, bagian depedencies. masukan beberapa depedency berikut
 
```java
  dependencies {
    testImplementation group: 'io.rest-assured', name: 'rest-assured', version: '5.4.0'
    implementation group: 'io.cucumber', name: 'cucumber-java', version: '7.15.0'
    implementation group: 'org.json', name: 'json', version: '20231013'
    testImplementation group: 'io.rest-assured', name: 'json-path', version: '5.3.0'
    testImplementation group: 'io.rest-assured', name: 'json-schema-validator', version: '5.3.0'
    
}
```












