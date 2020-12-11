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
