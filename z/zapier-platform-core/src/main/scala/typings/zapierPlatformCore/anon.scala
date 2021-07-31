package typings.zapierPlatformCore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.httpMod.Agent
import typings.zapierPlatformCore.mod.AppError
import typings.zapierPlatformCore.mod.ExpiredAuthError
import typings.zapierPlatformCore.mod.HaltedError
import typings.zapierPlatformCore.mod.HttpMethod
import typings.zapierPlatformCore.mod.RefreshAuthError
import typings.zapierPlatformCore.zapierPlatformCoreBooleans.`true`
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
    
    @scala.inline
    def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Boolean): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setParams(value: Boolean): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait CustomStoreKey extends StObject {
    
    var customStoreKey: js.UndefOr[String] = js.undefined
  }
  object CustomStoreKey {
    
    @scala.inline
    def apply(): CustomStoreKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomStoreKey]
    }
    
    @scala.inline
    implicit class CustomStoreKeyMutableBuilder[Self <: CustomStoreKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomStoreKey(value: String): Self = StObject.set(x, "customStoreKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomStoreKeyUndefined: Self = StObject.set(x, "customStoreKey", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var Error: Instantiable3[
        /* message */ String, 
        /* code */ js.UndefOr[String], 
        /* status */ js.UndefOr[Double], 
        AppError
      ]
    
    var ExpiredAuthError: Instantiable0[typings.zapierPlatformCore.mod.ExpiredAuthError]
    
    var HaltedError: Instantiable0[typings.zapierPlatformCore.mod.HaltedError]
    
    var RefreshAuthError: Instantiable0[typings.zapierPlatformCore.mod.RefreshAuthError]
  }
  object Error {
    
    @scala.inline
    def apply(
      Error: Instantiable3[
          /* message */ String, 
          /* code */ js.UndefOr[String], 
          /* status */ js.UndefOr[Double], 
          AppError
        ],
      ExpiredAuthError: Instantiable0[ExpiredAuthError],
      HaltedError: Instantiable0[HaltedError],
      RefreshAuthError: Instantiable0[RefreshAuthError]
    ): Error = {
      val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], ExpiredAuthError = ExpiredAuthError.asInstanceOf[js.Any], HaltedError = HaltedError.asInstanceOf[js.Any], RefreshAuthError = RefreshAuthError.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(
        value: Instantiable3[
              /* message */ String, 
              /* code */ js.UndefOr[String], 
              /* status */ js.UndefOr[Double], 
              AppError
            ]
      ): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiredAuthError(value: Instantiable0[ExpiredAuthError]): Self = StObject.set(x, "ExpiredAuthError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHaltedError(value: Instantiable0[HaltedError]): Self = StObject.set(x, "HaltedError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshAuthError(value: Instantiable0[RefreshAuthError]): Self = StObject.set(x, "RefreshAuthError", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(value: js.Any): String = js.native
    def apply(value: js.Any, replacer: js.Array[Double | String]): String = js.native
    def apply(value: js.Any, replacer: js.Array[Double | String], space: String): String = js.native
    def apply(value: js.Any, replacer: js.Array[Double | String], space: Double): String = js.native
    def apply(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]
    ): String = js.native
    def apply(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any],
      space: String
    ): String = js.native
    def apply(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any],
      space: Double
    ): String = js.native
    def apply(value: js.Any, replacer: Null, space: String): String = js.native
    def apply(value: js.Any, replacer: Null, space: Double): String = js.native
    def apply(value: js.Any, replacer: Unit, space: String): String = js.native
    def apply(value: js.Any, replacer: Unit, space: Double): String = js.native
  }
  
  trait Get extends StObject {
    
    def get(): js.Promise[String]
    
    def set(cursor: String): js.Promise[Null]
  }
  object Get {
    
    @scala.inline
    def apply(get: () => js.Promise[String], set: String => js.Promise[Null]): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit class GetMutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: () => js.Promise[String]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: String => js.Promise[Null]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
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
    
    var json: js.UndefOr[js.Object | js.Array[js.Any]] = js.undefined
    
    var method: js.UndefOr[HttpMethod] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var raw: js.UndefOr[Boolean] & `true`
    
    var redirect: js.UndefOr[manual | error | follow] = js.undefined
    
    var removeMissingValuesFrom: js.UndefOr[Body] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var skipThrowForStatus: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object HttpRequestOptionsrawtrue {
    
    @scala.inline
    def apply(raw: js.UndefOr[Boolean] & `true`): HttpRequestOptionsrawtrue = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpRequestOptionsrawtrue]
    }
    
    @scala.inline
    implicit class HttpRequestOptionsrawtrueMutableBuilder[Self <: HttpRequestOptionsrawtrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setBody(value: String | Buffer | ReadableStream | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      @scala.inline
      def setForm(value: js.Object): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setJson(value: js.Object | js.Array[js.Any]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setJsonVarargs(value: js.Any*): Self = StObject.set(x, "json", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setRaw(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirect(value: manual | error | follow): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setRemoveMissingValuesFrom(value: Body): Self = StObject.set(x, "removeMissingValuesFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveMissingValuesFromUndefined: Self = StObject.set(x, "removeMissingValuesFrom", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSkipThrowForStatus(value: Boolean): Self = StObject.set(x, "skipThrowForStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipThrowForStatusUndefined: Self = StObject.set(x, "skipThrowForStatus", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    
    var json: js.UndefOr[js.Object | js.Array[js.Any]] = js.undefined
    
    var method: js.UndefOr[HttpMethod] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var raw: js.UndefOr[Boolean] & `true`
    
    var redirect: js.UndefOr[manual | error | follow] = js.undefined
    
    var removeMissingValuesFrom: js.UndefOr[Body] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var skipThrowForStatus: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] & String
  }
  object HttpRequestOptionsrawtrueAgent {
    
    @scala.inline
    def apply(raw: js.UndefOr[Boolean] & `true`, url: js.UndefOr[String] & String): HttpRequestOptionsrawtrueAgent = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpRequestOptionsrawtrueAgent]
    }
    
    @scala.inline
    implicit class HttpRequestOptionsrawtrueAgentMutableBuilder[Self <: HttpRequestOptionsrawtrueAgent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setBody(value: String | Buffer | ReadableStream | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      @scala.inline
      def setForm(value: js.Object): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setJson(value: js.Object | js.Array[js.Any]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setJsonVarargs(value: js.Any*): Self = StObject.set(x, "json", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setRaw(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirect(value: manual | error | follow): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setRemoveMissingValuesFrom(value: Body): Self = StObject.set(x, "removeMissingValuesFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveMissingValuesFromUndefined: Self = StObject.set(x, "removeMissingValuesFrom", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSkipThrowForStatus(value: Boolean): Self = StObject.set(x, "skipThrowForStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipThrowForStatusUndefined: Self = StObject.set(x, "skipThrowForStatus", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: js.UndefOr[String] & String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
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
    
    var json: js.UndefOr[js.Object | js.Array[js.Any]] = js.undefined
    
    var method: js.UndefOr[HttpMethod] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var redirect: js.UndefOr[manual | error | follow] = js.undefined
    
    var removeMissingValuesFrom: js.UndefOr[Body] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var skipThrowForStatus: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] & String
  }
  object HttpRequestOptionsurlstri {
    
    @scala.inline
    def apply(url: js.UndefOr[String] & String): HttpRequestOptionsurlstri = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpRequestOptionsurlstri]
    }
    
    @scala.inline
    implicit class HttpRequestOptionsurlstriMutableBuilder[Self <: HttpRequestOptionsurlstri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setBody(value: String | Buffer | ReadableStream | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      @scala.inline
      def setForm(value: js.Object): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setJson(value: js.Object | js.Array[js.Any]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setJsonVarargs(value: js.Any*): Self = StObject.set(x, "json", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setRedirect(value: manual | error | follow): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setRemoveMissingValuesFrom(value: Body): Self = StObject.set(x, "removeMissingValuesFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveMissingValuesFromUndefined: Self = StObject.set(x, "removeMissingValuesFrom", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSkipThrowForStatus(value: Boolean): Self = StObject.set(x, "skipThrowForStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipThrowForStatusUndefined: Self = StObject.set(x, "skipThrowForStatus", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: js.UndefOr[String] & String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    @scala.inline
    def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Inject extends StObject {
    
    def inject(): Unit = js.native
    def inject(filename: String): Unit = js.native
  }
  
  trait IsFillingDynamicDropdown extends StObject {
    
    var isFillingDynamicDropdown: Boolean
    
    var isLoadingSample: Boolean
    
    var isPopulatingDedupe: Boolean
    
    var isTestingAuth: Boolean
    
    var limit: Double
    
    var page: Double
    
    var zap: js.UndefOr[Id] = js.undefined
  }
  object IsFillingDynamicDropdown {
    
    @scala.inline
    def apply(
      isFillingDynamicDropdown: Boolean,
      isLoadingSample: Boolean,
      isPopulatingDedupe: Boolean,
      isTestingAuth: Boolean,
      limit: Double,
      page: Double
    ): IsFillingDynamicDropdown = {
      val __obj = js.Dynamic.literal(isFillingDynamicDropdown = isFillingDynamicDropdown.asInstanceOf[js.Any], isLoadingSample = isLoadingSample.asInstanceOf[js.Any], isPopulatingDedupe = isPopulatingDedupe.asInstanceOf[js.Any], isTestingAuth = isTestingAuth.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsFillingDynamicDropdown]
    }
    
    @scala.inline
    implicit class IsFillingDynamicDropdownMutableBuilder[Self <: IsFillingDynamicDropdown] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsFillingDynamicDropdown(value: Boolean): Self = StObject.set(x, "isFillingDynamicDropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoadingSample(value: Boolean): Self = StObject.set(x, "isLoadingSample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPopulatingDedupe(value: Boolean): Self = StObject.set(x, "isPopulatingDedupe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTestingAuth(value: Boolean): Self = StObject.set(x, "isTestingAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZap(value: Id): Self = StObject.set(x, "zap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZapUndefined: Self = StObject.set(x, "zap", js.undefined)
    }
  }
  
  trait Parse extends StObject {
    
    /**
      * Acts a lot like regular `JSON.parse`, but throws a nice error for improper json input
      */
    def parse(text: String): js.Any
    
    def stringify(value: js.Any): String
    def stringify(value: js.Any, replacer: js.Array[Double | String]): String
    def stringify(value: js.Any, replacer: js.Array[Double | String], space: String): String
    def stringify(value: js.Any, replacer: js.Array[Double | String], space: Double): String
    def stringify(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]
    ): String
    def stringify(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any],
      space: String
    ): String
    def stringify(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any],
      space: Double
    ): String
    def stringify(value: js.Any, replacer: Null, space: String): String
    def stringify(value: js.Any, replacer: Null, space: Double): String
    def stringify(value: js.Any, replacer: Unit, space: String): String
    def stringify(value: js.Any, replacer: Unit, space: Double): String
    @JSName("stringify")
    var stringify_Original: FnCall
  }
  object Parse {
    
    @scala.inline
    def apply(parse: String => js.Any, stringify: FnCall): Parse = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = stringify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parse]
    }
    
    @scala.inline
    implicit class ParseMutableBuilder[Self <: Parse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: String => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStringify(value: FnCall): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): PartialmethodHttpMethodqu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialmethodHttpMethodqu]
    }
    
    @scala.inline
    implicit class PartialmethodHttpMethodquMutableBuilder[Self <: PartialmethodHttpMethodqu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setQuerystring(value: String): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
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
    
    @scala.inline
    def apply(): PartialmethodHttpMethodquContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialmethodHttpMethodquContent]
    }
    
    @scala.inline
    implicit class PartialmethodHttpMethodquContentMutableBuilder[Self <: PartialmethodHttpMethodquContent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: StringDictionary[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setQuerystring(value: StringDictionary[String]): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
    }
  }
}
