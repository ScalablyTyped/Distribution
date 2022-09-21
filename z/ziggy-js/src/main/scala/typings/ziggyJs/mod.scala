package typings.ziggyJs

import org.scalablytyped.runtime.StringDictionary
import typings.history.mod.Location
import typings.ziggyJs.anon.Query
import typings.ziggyJs.ziggyJsStrings.DELETE
import typings.ziggyJs.ziggyJsStrings.GET
import typings.ziggyJs.ziggyJsStrings.HEAD
import typings.ziggyJs.ziggyJsStrings.OPTIONS
import typings.ziggyJs.ziggyJsStrings.PATCH
import typings.ziggyJs.ziggyJsStrings.POST
import typings.ziggyJs.ziggyJsStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ziggy-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Router]
  inline def default(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(name: String, params: Unit, absolute: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(name: String, params: Unit, absolute: Boolean, config: Config): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(name: String, params: Unit, absolute: Unit, config: Config): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(name: String, params: RouteParam): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(name: String, params: RouteParam, absolute: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(name: String, params: RouteParam, absolute: Boolean, config: Config): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(name: String, params: RouteParam, absolute: Unit, config: Config): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(name: String, params: RouteParamsWithQueryOverload): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(name: String, params: RouteParamsWithQueryOverload, absolute: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(name: String, params: RouteParamsWithQueryOverload, absolute: Boolean, config: Config): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(name: String, params: RouteParamsWithQueryOverload, absolute: Unit, config: Config): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(name: Unit, params: Unit, absolute: Boolean): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: Unit, params: Unit, absolute: Boolean, config: Config): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: Unit, params: Unit, absolute: Unit, config: Config): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: Unit, params: RouteParam): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: Unit, params: RouteParam, absolute: Boolean): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: Unit, params: RouteParam, absolute: Boolean, config: Config): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: Unit, params: RouteParam, absolute: Unit, config: Config): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: Unit, params: RouteParamsWithQueryOverload): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: Unit, params: RouteParamsWithQueryOverload, absolute: Boolean): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: Unit, params: RouteParamsWithQueryOverload, absolute: Boolean, config: Config): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def default(name: Unit, params: RouteParamsWithQueryOverload, absolute: Unit, config: Config): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Router]
  
  @JSImport("ziggy-js", "Router")
  @js.native
  open class Router ()
    extends StObject
       with typings.std.String {
    
    /**
      * @deprecated since v1.0, use `has()` instead.
      */
    def check(name: String): Boolean = js.native
    
    /**
      * Get the name of the route matching the current window URL, or, given a route name
      * and parameters, check if the current window URL and parameters match that route.
      *
      * @example
      * // at URL https://ziggy.dev/posts/4 with 'posts.show' route 'posts/{post}'
      * route().current(); // 'posts.show'
      * route().current('posts.index'); // false
      * route().current('posts.show'); // true
      * route().current('posts.show', { post: 1 }); // false
      * route().current('posts.show', { post: 4 }); // true
      */
    def current(): js.UndefOr[String] = js.native
    def current(name: String): Boolean = js.native
    def current(name: String, params: RouteParamsWithQueryOverload): Boolean = js.native
    
    /**
      * Check whether the given route exists.
      */
    def has(name: String): Boolean = js.native
    
    /**
      * Get all parameter values from the current window URL.
      *
      * @example
      * // at URL https://tighten.ziggy.dev/posts/4?lang=en with 'posts.show' route 'posts/{post}' and domain '{team}.ziggy.dev'
      * route().params; // { team: 'tighten', post: 4, lang: 'en' }
      */
    def params: RouteParams = js.native
  }
  
  trait Config extends StObject {
    
    var defaults: StringDictionary[String | Double]
    
    var location: js.UndefOr[Location] = js.undefined
    
    var port: js.UndefOr[Double | Null] = js.undefined
    
    var routes: StringDictionary[Route]
    
    var url: String
  }
  object Config {
    
    inline def apply(defaults: StringDictionary[String | Double], routes: StringDictionary[Route], url: String): Config = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setDefaults(value: StringDictionary[String | Double]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRoutes(value: StringDictionary[Route]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryParams
    extends StObject
       with /* key */ StringDictionary[QueryParams | String | Double | Boolean]
  object QueryParams {
    
    inline def apply(): QueryParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryParams]
    }
  }
  
  trait Routable extends StObject {
    
    var id: Double | String
  }
  object Routable {
    
    inline def apply(id: Double | String): Routable = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Routable]
    }
    
    extension [Self <: Routable](x: Self) {
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
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
      
      inline def setMethodsVarargs(value: (GET | HEAD | POST | PATCH | PUT | OPTIONS | DELETE)*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  type RouteParam = Routable | String | Double | Boolean
  
  type RouteParams = StringDictionary[RouteParam] | js.Array[RouteParam]
  
  type RouteParamsWithQueryOverload = RouteParams | Query
}
