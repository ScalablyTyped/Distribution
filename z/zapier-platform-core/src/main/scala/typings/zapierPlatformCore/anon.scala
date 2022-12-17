package typings.zapierPlatformCore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.Agent
import typings.zapierPlatformCore.mod.HttpMethod
import typings.zapierPlatformCore.zapierPlatformCoreStrings.error
import typings.zapierPlatformCore.zapierPlatformCoreStrings.follow
import typings.zapierPlatformCore.zapierPlatformCoreStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var body: js.UndefOr[Boolean] = js.undefined
    
    var params: js.UndefOr[Boolean] = js.undefined
  }
  object Body {
    
    inline def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: Boolean): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setParams(value: Boolean): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait CustomStoreKey extends StObject {
    
    var customStoreKey: js.UndefOr[String] = js.undefined
  }
  object CustomStoreKey {
    
    inline def apply(): CustomStoreKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomStoreKey]
    }
    
    extension [Self <: CustomStoreKey](x: Self) {
      
      inline def setCustomStoreKey(value: String): Self = StObject.set(x, "customStoreKey", value.asInstanceOf[js.Any])
      
      inline def setCustomStoreKeyUndefined: Self = StObject.set(x, "customStoreKey", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var Error: Instantiable3[
        /* message */ String, 
        /* code */ js.UndefOr[String], 
        /* status */ js.UndefOr[Double], 
        js.Error
      ]
    
    var ExpiredAuthError: Instantiable0[js.Error]
    
    var HaltedError: Instantiable0[js.Error]
    
    var RefreshAuthError: Instantiable0[js.Error]
    
    var ThrottledError: Instantiable2[/* message */ String, /* delay */ js.UndefOr[Double], js.Error]
  }
  object Error {
    
    inline def apply(
      Error: Instantiable3[
          /* message */ String, 
          /* code */ js.UndefOr[String], 
          /* status */ js.UndefOr[Double], 
          js.Error
        ],
      ExpiredAuthError: Instantiable0[js.Error],
      HaltedError: Instantiable0[js.Error],
      RefreshAuthError: Instantiable0[js.Error],
      ThrottledError: Instantiable2[/* message */ String, /* delay */ js.UndefOr[Double], js.Error]
    ): Error = {
      val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], ExpiredAuthError = ExpiredAuthError.asInstanceOf[js.Any], HaltedError = HaltedError.asInstanceOf[js.Any], RefreshAuthError = RefreshAuthError.asInstanceOf[js.Any], ThrottledError = ThrottledError.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(
        value: Instantiable3[
              /* message */ String, 
              /* code */ js.UndefOr[String], 
              /* status */ js.UndefOr[Double], 
              js.Error
            ]
      ): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setExpiredAuthError(value: Instantiable0[js.Error]): Self = StObject.set(x, "ExpiredAuthError", value.asInstanceOf[js.Any])
      
      inline def setHaltedError(value: Instantiable0[js.Error]): Self = StObject.set(x, "HaltedError", value.asInstanceOf[js.Any])
      
      inline def setRefreshAuthError(value: Instantiable0[js.Error]): Self = StObject.set(x, "RefreshAuthError", value.asInstanceOf[js.Any])
      
      inline def setThrottledError(value: Instantiable2[/* message */ String, /* delay */ js.UndefOr[Double], js.Error]): Self = StObject.set(x, "ThrottledError", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(value: Any): String = js.native
    def apply(value: Any, replacer: js.Array[Double | String]): String = js.native
    def apply(value: Any, replacer: js.Array[Double | String], space: String): String = js.native
    def apply(value: Any, replacer: js.Array[Double | String], space: Double): String = js.native
    def apply(value: Any, replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): String = js.native
    def apply(
      value: Any,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: String
    ): String = js.native
    def apply(
      value: Any,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: Double
    ): String = js.native
    def apply(value: Any, replacer: Null, space: String): String = js.native
    def apply(value: Any, replacer: Null, space: Double): String = js.native
    def apply(value: Any, replacer: Unit, space: String): String = js.native
    def apply(value: Any, replacer: Unit, space: Double): String = js.native
  }
  
  trait Get extends StObject {
    
    def get(): js.Promise[String]
    
    def set(cursor: String): js.Promise[Null]
  }
  object Get {
    
    inline def apply(get: () => js.Promise[String], set: String => js.Promise[Null]): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[Get]
    }
    
    extension [Self <: Get](x: Self) {
      
      inline def setGet(value: () => js.Promise[String]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setSet(value: String => js.Promise[Null]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined zapier-platform-core.zapier-platform-core.HttpRequestOptions & {  raw :true} */
  trait HttpRequestOptionsrawtrue extends StObject {
    
    var agent: js.UndefOr[Agent] = js.undefined
    
    var body: js.UndefOr[String | Buffer | ReadableStream | js.Object] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var follow: js.UndefOr[Double] = js.undefined
    
    var form: js.UndefOr[js.Object] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var json: js.UndefOr[js.Object | js.Array[Any]] = js.undefined
    
    var method: js.UndefOr[HttpMethod] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var redirect: js.UndefOr[manual | error | follow] = js.undefined
    
    var removeMissingValuesFrom: js.UndefOr[Body] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var skipThrowForStatus: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object HttpRequestOptionsrawtrue {
    
    inline def apply(): HttpRequestOptionsrawtrue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpRequestOptionsrawtrue]
    }
    
    extension [Self <: HttpRequestOptionsrawtrue](x: Self) {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBody(value: String | Buffer | ReadableStream | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setForm(value: js.Object): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setJson(value: js.Object | js.Array[Any]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setJsonVarargs(value: Any*): Self = StObject.set(x, "json", js.Array(value*))
      
      inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setRedirect(value: manual | error | follow): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setRemoveMissingValuesFrom(value: Body): Self = StObject.set(x, "removeMissingValuesFrom", value.asInstanceOf[js.Any])
      
      inline def setRemoveMissingValuesFromUndefined: Self = StObject.set(x, "removeMissingValuesFrom", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkipThrowForStatus(value: Boolean): Self = StObject.set(x, "skipThrowForStatus", value.asInstanceOf[js.Any])
      
      inline def setSkipThrowForStatusUndefined: Self = StObject.set(x, "skipThrowForStatus", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Inlined zapier-platform-core.zapier-platform-core.HttpRequestOptions & {  raw :true,   url :string} */
  trait HttpRequestOptionsrawtrueAgent extends StObject {
    
    var agent: js.UndefOr[Agent] = js.undefined
    
    var body: js.UndefOr[String | Buffer | ReadableStream | js.Object] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var follow: js.UndefOr[Double] = js.undefined
    
    var form: js.UndefOr[js.Object] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var json: js.UndefOr[js.Object | js.Array[Any]] = js.undefined
    
    var method: js.UndefOr[HttpMethod] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var redirect: js.UndefOr[manual | error | follow] = js.undefined
    
    var removeMissingValuesFrom: js.UndefOr[Body] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var skipThrowForStatus: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object HttpRequestOptionsrawtrueAgent {
    
    inline def apply(): HttpRequestOptionsrawtrueAgent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpRequestOptionsrawtrueAgent]
    }
    
    extension [Self <: HttpRequestOptionsrawtrueAgent](x: Self) {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBody(value: String | Buffer | ReadableStream | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setForm(value: js.Object): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setJson(value: js.Object | js.Array[Any]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setJsonVarargs(value: Any*): Self = StObject.set(x, "json", js.Array(value*))
      
      inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setRedirect(value: manual | error | follow): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setRemoveMissingValuesFrom(value: Body): Self = StObject.set(x, "removeMissingValuesFrom", value.asInstanceOf[js.Any])
      
      inline def setRemoveMissingValuesFromUndefined: Self = StObject.set(x, "removeMissingValuesFrom", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkipThrowForStatus(value: Boolean): Self = StObject.set(x, "skipThrowForStatus", value.asInstanceOf[js.Any])
      
      inline def setSkipThrowForStatusUndefined: Self = StObject.set(x, "skipThrowForStatus", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Inlined zapier-platform-core.zapier-platform-core.HttpRequestOptions & {  url :string} */
  trait HttpRequestOptionsurlstri extends StObject {
    
    var agent: js.UndefOr[Agent] = js.undefined
    
    var body: js.UndefOr[String | Buffer | ReadableStream | js.Object] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var follow: js.UndefOr[Double] = js.undefined
    
    var form: js.UndefOr[js.Object] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var json: js.UndefOr[js.Object | js.Array[Any]] = js.undefined
    
    var method: js.UndefOr[HttpMethod] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var redirect: js.UndefOr[manual | error | follow] = js.undefined
    
    var removeMissingValuesFrom: js.UndefOr[Body] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var skipThrowForStatus: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object HttpRequestOptionsurlstri {
    
    inline def apply(): HttpRequestOptionsurlstri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpRequestOptionsurlstri]
    }
    
    extension [Self <: HttpRequestOptionsurlstri](x: Self) {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBody(value: String | Buffer | ReadableStream | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setForm(value: js.Object): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setJson(value: js.Object | js.Array[Any]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setJsonVarargs(value: Any*): Self = StObject.set(x, "json", js.Array(value*))
      
      inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setRedirect(value: manual | error | follow): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setRemoveMissingValuesFrom(value: Body): Self = StObject.set(x, "removeMissingValuesFrom", value.asInstanceOf[js.Any])
      
      inline def setRemoveMissingValuesFromUndefined: Self = StObject.set(x, "removeMissingValuesFrom", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkipThrowForStatus(value: Boolean): Self = StObject.set(x, "skipThrowForStatus", value.asInstanceOf[js.Any])
      
      inline def setSkipThrowForStatusUndefined: Self = StObject.set(x, "skipThrowForStatus", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    inline def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Inject extends StObject {
    
    def inject(): Unit = js.native
    def inject(filename: String): Unit = js.native
  }
  
  trait IsBulkRead extends StObject {
    
    var isBulkRead: Boolean
    
    var isFillingDynamicDropdown: Boolean
    
    var isLoadingSample: Boolean
    
    var isPopulatingDedupe: Boolean
    
    var isTestingAuth: Boolean
    
    var limit: Double
    
    var page: Double
    
    var zap: js.UndefOr[Id] = js.undefined
  }
  object IsBulkRead {
    
    inline def apply(
      isBulkRead: Boolean,
      isFillingDynamicDropdown: Boolean,
      isLoadingSample: Boolean,
      isPopulatingDedupe: Boolean,
      isTestingAuth: Boolean,
      limit: Double,
      page: Double
    ): IsBulkRead = {
      val __obj = js.Dynamic.literal(isBulkRead = isBulkRead.asInstanceOf[js.Any], isFillingDynamicDropdown = isFillingDynamicDropdown.asInstanceOf[js.Any], isLoadingSample = isLoadingSample.asInstanceOf[js.Any], isPopulatingDedupe = isPopulatingDedupe.asInstanceOf[js.Any], isTestingAuth = isTestingAuth.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsBulkRead]
    }
    
    extension [Self <: IsBulkRead](x: Self) {
      
      inline def setIsBulkRead(value: Boolean): Self = StObject.set(x, "isBulkRead", value.asInstanceOf[js.Any])
      
      inline def setIsFillingDynamicDropdown(value: Boolean): Self = StObject.set(x, "isFillingDynamicDropdown", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingSample(value: Boolean): Self = StObject.set(x, "isLoadingSample", value.asInstanceOf[js.Any])
      
      inline def setIsPopulatingDedupe(value: Boolean): Self = StObject.set(x, "isPopulatingDedupe", value.asInstanceOf[js.Any])
      
      inline def setIsTestingAuth(value: Boolean): Self = StObject.set(x, "isTestingAuth", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setZap(value: Id): Self = StObject.set(x, "zap", value.asInstanceOf[js.Any])
      
      inline def setZapUndefined: Self = StObject.set(x, "zap", js.undefined)
    }
  }
  
  trait Parse extends StObject {
    
    /**
      * Acts a lot like regular `JSON.parse`, but throws a nice error for improper json input
      */
    def parse(text: String): Any
    
    def stringify(value: Any): String
    def stringify(value: Any, replacer: js.Array[Double | String]): String
    def stringify(value: Any, replacer: js.Array[Double | String], space: String): String
    def stringify(value: Any, replacer: js.Array[Double | String], space: Double): String
    def stringify(value: Any, replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): String
    def stringify(
      value: Any,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: String
    ): String
    def stringify(
      value: Any,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: Double
    ): String
    def stringify(value: Any, replacer: Null, space: String): String
    def stringify(value: Any, replacer: Null, space: Double): String
    def stringify(value: Any, replacer: Unit, space: String): String
    def stringify(value: Any, replacer: Unit, space: Double): String
    @JSName("stringify")
    var stringify_Original: FnCall
  }
  object Parse {
    
    inline def apply(parse: String => Any, stringify: FnCall): Parse = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = stringify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parse]
    }
    
    extension [Self <: Parse](x: Self) {
      
      inline def setParse(value: String => Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setStringify(value: FnCall): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<{  method :zapier-platform-core.zapier-platform-core.HttpMethod,   querystring :string,   headers :{[x: string] : string},   content :string}> */
  trait PartialmethodHttpMethodqu extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var method: js.UndefOr[HttpMethod] = js.undefined
    
    var querystring: js.UndefOr[String] = js.undefined
  }
  object PartialmethodHttpMethodqu {
    
    inline def apply(): PartialmethodHttpMethodqu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialmethodHttpMethodqu]
    }
    
    extension [Self <: PartialmethodHttpMethodqu](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setQuerystring(value: String): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      inline def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  method :zapier-platform-core.zapier-platform-core.HttpMethod,   querystring :{[x: string] : string},   headers :{[x: string] : string},   content :{[x: string] : string}}> */
  trait PartialmethodHttpMethodquContent extends StObject {
    
    var content: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var method: js.UndefOr[HttpMethod] = js.undefined
    
    var querystring: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object PartialmethodHttpMethodquContent {
    
    inline def apply(): PartialmethodHttpMethodquContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialmethodHttpMethodquContent]
    }
    
    extension [Self <: PartialmethodHttpMethodquContent](x: Self) {
      
      inline def setContent(value: StringDictionary[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setQuerystring(value: StringDictionary[String]): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      inline def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
    }
  }
}
