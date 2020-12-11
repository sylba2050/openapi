@Grab(group = 'org.openapitools', module = 'openapi-generator-cli', version = '3.3.4')

import org.openapitools.codegen.*
import org.openapitools.codegen.languages.*

class MyCodegen extends GoGinServerCodegen {

  static main(String[] args) {
    OpenAPIGenerator.main(args)
  }

  MyCodegen() {
    super()

    this.typeMapping.put("integer", "int32");
    this.typeMapping.put("long", "int64");
    this.typeMapping.put("number", "float32");
    this.typeMapping.put("float", "float32");
    this.typeMapping.put("double", "float64");
    this.typeMapping.put("BigDecimal", "float64");
    this.typeMapping.put("boolean", "bool");
    this.typeMapping.put("string", "string");
    this.typeMapping.put("UUID", "string");
    this.typeMapping.put("URI", "string");
    this.typeMapping.put("date", "string");
    this.typeMapping.put("DateTime", "time.Time");
    this.typeMapping.put("password", "string");
    this.typeMapping.put("File", "*os.File");
    this.typeMapping.put("file", "*os.File");
    this.typeMapping.put("binary", "*os.File");
    this.typeMapping.put("ByteArray", "string");

    this.apiPath = "domain"
  }


  String name = "my-codegen"
}

MyCodegen.main(args)
