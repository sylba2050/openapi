# OpenAPI Generator Wrapper

OpenAPI Generatorが生成する構造体の型を書きかえるためのWrapperです

## 使い方

 * gen1.groovy 内のOpenAPIからGo言語への型の対応が記載されているオブジェクトを書き換え
 * 下記コマンドを実行

 ```bash
 docker-compose up
 ```

## 残課題

 * gofmtが実行出来ていない
 * Wrap前までは出来ていた出力ディレクトリの名前変更が引数から指定出来なくなってしまったためgen1.groovyの中で指定
 * `Id` → `ID` としたい

## 参考文献

 * [AbstractGoCodegen](https://github.com/OpenAPITools/openapi-generator/blob/150e24dc553a8ea5230ffb938ed3e6020e972faa/modules/openapi-generator/src/main/java/org/openapitools/codegen/languages/AbstractGoCodegen.java)
 * [GoGinServerCodegen](https://github.com/OpenAPITools/openapi-generator/blob/150e24dc553a8ea5230ffb938ed3e6020e972faa/modules/openapi-generator/src/main/java/org/openapitools/codegen/languages/GoGinServerCodegen.java)
