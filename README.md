<h1><b> Final Project </b><h1></h1>
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

======================================================================================================================================================================

<h2>Test API</h2>
Tes API terdiri dari: <br/>
- Test Get List Data <br/>
- Test Create New User <br/>
- Test Delete User <br/>
- Test Update User <br/>
- Test Get List of Tags <br/>

<img width="464" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/8b386786-580b-4e31-80d9-dafe5301b2b4">

Pertama melakukan prepareUrl(). url yang digunakan menyesuaikan dengan tes scenario yang dijalankan
<img width="521" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/ea814b7a-fb83-4145-8304-5579744e83ab">

<img width="314" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/24f5ec5e-e186-46b6-8e89-667499def559">

lalu mendefinisikan header yang digunakan untuk request API, buat method yang akan digunakan untuk melakukan request pada step file.

<img width="502" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/17f97089-1cea-4d79-bcc9-0f8ded62a7b1">

kemudian validasi status code yang diterima setelah melakukan request.

<img width="377" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/884c1028-c325-48d0-9c90-bdfeaa3b43f9">

validasi body dilakukan untuk memastikan apakah sesuai isinya dengan yang diharapkan seperti tidak boleh null dan sebagainya.

<img width="470" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/3e134c69-bb87-4ae1-9eb4-3b94d33ce64e">

terakhir melakukan validasi dengan jsonschema untuk memastikan response yang diterima memiliki schema yang sama dengan yang sudah ditentukan sebelumnya

<img width="496" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/299a939d-b587-41d0-a2f6-b36ae6f8f004">
<br/>
<img width="413" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/fc2fd5bf-e0f9-40a5-8195-c5a64a625c4a">

untuk eksekusi code, menggunakan gradle dengan task "apiTest"

<img width="639" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/6ce1767d-a5fb-4e48-ab4c-697e167388dd">

======================================================================================================================================================================

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

<img width="373" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/f7d24534-a0dd-4d12-9ca7-f7c07bd3c7f0">

Pertama mendefinisikan url dari demoblaze

<img width="304" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/f113d099-b7ed-44e1-8cec-b4c55c3e4c6d">

Username dan password yang digunakan untuk tes registrasi menggunakan method generateRandom user.

<img width="447" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/268775c0-fb22-4228-8f7b-d2ec43fea4c0">

<img width="390" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/4bf3676b-192c-49d2-9042-6b0fbe509d3a">

<img width="207" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/1f53003c-8541-44de-932f-fc9c57c7aeab">

lalu verifikasi dengan membaca alert yang muncul

<img width="450" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/c2341521-4493-43c6-976d-a327bb97cffc">


untuk login valid name juga menggunakan method yang sama dan username yang sama yang sudah diregistrasi sebelumnya

<img width="207" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/bbeecbd5-9f88-4ce0-9d4c-efec2cedbc6a">

untuk signup dengan user yang sudaah ada dan login dengan user yang salah, inputan sudah didefinisikan pada file cucumber

<img width="393" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/469205fb-4c79-4d72-ab91-bad02d09d6fd">

<img width="390" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/88f53a3d-b690-4f28-bf0c-855be610a7dd">

untuk bagian description page test, disini digunakan contoh sample pada produk Samsung Galaxy S6. langkahnya user mengklik produk dan akan
ternavigasi ke halaman produk. selanjutnya judul produk, deskripsi produk dan harga produk di uji apakah sama atau tidak.

<img width="597" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/9139bbb1-a122-4791-8c2d-fab53572b817">

<img width="613" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/73b69612-1453-4769-9618-0846993843fc">


untuk bagian category test, <br/>

<img width="305" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/927fffd7-b68d-4dc6-83ee-dd555110df58">

pertama melakukan pengambilan data untuk semua data produk, dan dibandingkan dengan list semua produk yang sudah didefinisikan manual.

<img width="369" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/9a173365-b841-4791-b219-747d5ddcb3be">

<img width="567" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/e105002f-ee92-46e4-8e20-36a8dc2674ea">

begitu juga selanjutnya dengan setiap kategori diambil semua data nya untuk disamakan dengan list produk per kategori yang sudah didefinisikan di awal.

untuk bagian checkout test,

<img width="389" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/df069322-0f95-41ed-b136-9a435fbe9183">

melakukan addtoCart pada salah satu produk (Samsung galaxy s6), lalu place order sampai mengisi formulir. terakhir  terdapat invoice yang di generate.

<img width="444" alt="image" src="https://github.com/takai-sama/FinalProject/assets/77669943/8c08763d-a96a-4f12-92ea-be45652c6568">










