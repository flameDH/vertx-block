# 簡單的vertx restful練習

### install

    mvn clear install

下載所需要的lib

### launch

    src/main/kotlin/com/example/starter/main.kt

使用IDE時(我使用IntelliJ)執行此檔案即可
亦或是透過maven打包成jar檔執行

執行前需確認已安裝mongoDB

### api說明

url:lcoalhost:9000/car/add

input:

    {
      "brand":"yamaha",
      "color":"blue",
      "city":"taipei"
    }


**TODO**

時間格式處理

timestamp轉換成date
