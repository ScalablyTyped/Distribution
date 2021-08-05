package typings.ziggyJs

import org.scalablytyped.runtime.StringDictionary
import typings.ziggyJs.anon.Id
import typings.ziggyJs.ziggyJsStrings.DELETE
import typings.ziggyJs.ziggyJsStrings.GET
import typings.ziggyJs.ziggyJsStrings.HEAD
import typings.ziggyJs.ziggyJsStrings.OPTIONS
import typings.ziggyJs.ziggyJsStrings.PATCH
import typings.ziggyJs.ziggyJsStrings.POST
import typings.ziggyJs.ziggyJsStrings.PUT
import typings.ziggyJs.ziggyJsStrings.http
import typings.ziggyJs.ziggyJsStrings.https
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ziggy-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(name: String): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[Router]
  inline def default(name: String, params: Unit, absolute: Boolean): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: String, params: Unit, absolute: Boolean, customZiggy: Config): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], customZiggy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: String, params: Unit, absolute: Unit, customZiggy: Config): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], customZiggy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: String, params: InputParams): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: String, params: InputParams, absolute: Boolean): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: String, params: InputParams, absolute: Boolean, customZiggy: Config): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], customZiggy.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: String, params: InputParams, absolute: Unit, customZiggy: Config): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], customZiggy.asInstanceOf[js.Any])).asInstanceOf[Router]
  
  @JSImport("ziggy-js", "Router")
  @js.native
  class Router ()
    extends StObject
       with typings.std.String {
    
    def check(name: String): Boolean = js.native
    
    def constructQuery(): String = js.native
    
    def current(): Route = js.native
    def current(name: String): Route = js.native
    
    def extractParams(uri: String, template: String, delimiter: String): NormalizedParams = js.native
    
    def hydrateUrl(): String = js.native
    
    def matchUrl(): Boolean = js.native
    
    def normalizeParams(params: InputParams): NormalizedParams = js.native
    
    def params: NormalizedParams = js.native
    
    def parse(): Unit = js.native
    
    def trimParam(param: String): String = js.native
    
    def url(): String = js.native
    
    def `with`(params: InputParams): Router = js.native
    
    def withQuery(params: InputParams): Router = js.native
  }
  
  trait Config extends StObject {
    
    var baseDomain: String
    
    var basePort: js.UndefOr[Double | Null] = js.undefined
    
    var baseProtocol: http | https
    
    var baseUrl: String
    
    var defaultParameters: StringDictionary[String | Double]
    
    var namedRoutes: StringDictionary[Route]
  }
  object Config {
    
    inline def apply(
      baseDomain: String,
      baseProtocol: http | https,
      baseUrl: String,
      defaultParameters: StringDictionary[String | Double],
      namedRoutes: StringDictionary[Route]
    ): Config = {
      val __obj = js.Dynamic.literal(baseDomain = baseDomain.asInstanceOf[js.Any], baseProtocol = baseProtocol.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], defaultParameters = defaultParameters.asInstanceOf[js.Any], namedRoutes = namedRoutes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setBaseDomain(value: String): Self = StObject.set(x, "baseDomain", value.asInstanceOf[js.Any])
      
      inline def setBasePort(value: Double): Self = StObject.set(x, "basePort", value.asInstanceOf[js.Any])
      
      inline def setBasePortNull: Self = StObject.set(x, "basePort", null)
      
      inline def setBasePortUndefined: Self = StObject.set(x, "basePort", js.undefined)
      
      inline def setBaseProtocol(value: http | https): Self = StObject.set(x, "baseProtocol", value.asInstanceOf[js.Any])
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setDefaultParameters(value: StringDictionary[String | Double]): Self = StObject.set(x, "defaultParameters", value.asInstanceOf[js.Any])
      
      inline def setNamedRoutes(value: StringDictionary[Route]): Self = StObject.set(x, "namedRoutes", value.asInstanceOf[js.Any])
    }
  }
  
  type EncodeURIParamType = String | Double | Boolean
  
  type InputParams = NormalizedParams | InputValue
  
  type InputValue = Id | EncodeURIParamType
  
  type NormalizedParams = StringDictionary[InputValue] | js.Array[InputValue]
  
  trait Route extends StObject {
    
    var domain: js.UndefOr[Null | String] = js.undefined
    
    var methods: js.Array[GET | HEAD | POST | PATCH | PUT | OPTIONS | DELETE]
    
    var uri: String
  }
  object Route {
    
    inline def apply(methods: js.Array[GET | HEAD | POST | PATCH | PUT | OPTIONS | DELETE], uri: String): Route = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route]
    }
    
    extension [Self <: Route](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainNull: Self = StObject.set(x, "domain", null)
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setMethods(value: js.Array[GET | HEAD | POST | PATCH | PUT | OPTIONS | DELETE]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsVarargs(value: (GET | HEAD | POST | PATCH | PUT | OPTIONS | DELETE)*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
