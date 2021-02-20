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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Body extends StObject {
    
    var body: js.UndefOr[Boolean] = js.native
    
    var params: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait CustomStoreKey extends StObject {
    
    var customStoreKey: js.UndefOr[String] = js.native
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
  
  @js.native
  trait Error extends StObject {
    
    var Error: Instantiable3[
        /* message */ String, 
        /* code */ js.UndefOr[String], 
        /* status */ js.UndefOr[Double], 
        AppError
      ] = js.native
    
    var ExpiredAuthError: Instantiable0[typings.zapierPlatformCore.mod.ExpiredAuthError] = js.native
    
    var HaltedError: Instantiable0[typings.zapierPlatformCore.mod.HaltedError] = js.native
    
    var RefreshAuthError: Instantiable0[typings.zapierPlatformCore.mod.RefreshAuthError] = js.native
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
    def apply(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: String): String = js.native
    def apply(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: Double): String = js.native
    def apply(value: js.Any, replacer: js.Array[Double | String]): String = js.native
    def apply(value: js.Any, replacer: js.Array[Double | String], space: String): String = js.native
    def apply(value: js.Any, replacer: js.Array[Double | String], space: Double): String = js.native
    def apply(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]
    ): String = js.native
    def apply(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _],
      space: String
    ): String = js.native
    def apply(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _],
      space: Double
    ): String = js.native
    def apply(value: js.Any, replacer: Null, space: String): String = js.native
    def apply(value: js.Any, replacer: Null, space: Double): String = js.native
  }
  
  @js.native
  trait Get extends StObject {
    
    def get(): js.Promise[String] = js.native
    
    def set(cursor: String): js.Promise[Null] = js.native
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
  @js.native
  trait HttpRequestOptionsrawtrue extends StObject {
    
    var agent: js.UndefOr[Agent] = js.native
    
    var body: js.UndefOr[String | Buffer | ReadableStream | js.Object] = js.native
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var follow: js.UndefOr[Double] = js.native
    
    var form: js.UndefOr[js.Object] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var json: js.UndefOr[js.Object | js.Array[_]] = js.native
    
    var method: js.UndefOr[HttpMethod] = js.native
    
    var params: js.UndefOr[js.Object] = js.native
    
    var raw: js.UndefOr[Boolean] with `true` = js.native
    
    var redirect: js.UndefOr[manual | error | follow] = js.native
    
    var removeMissingValuesFrom: js.UndefOr[Body] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var skipThrowForStatus: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object HttpRequestOptionsrawtrue {
    
    @scala.inline
    def apply(raw: js.UndefOr[Boolean] with `true`): HttpRequestOptionsrawtrue = {
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
      def setJson(value: js.Object | js.Array[_]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
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
      def setRaw(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
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
  @js.native
  trait HttpRequestOptionsrawtrueAgent extends StObject {
    
    var agent: js.UndefOr[Agent] = js.native
    
    var body: js.UndefOr[String | Buffer | ReadableStream | js.Object] = js.native
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var follow: js.UndefOr[Double] = js.native
    
    var form: js.UndefOr[js.Object] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var json: js.UndefOr[js.Object | js.Array[_]] = js.native
    
    var method: js.UndefOr[HttpMethod] = js.native
    
    var params: js.UndefOr[js.Object] = js.native
    
    var raw: js.UndefOr[Boolean] with `true` = js.native
    
    var redirect: js.UndefOr[manual | error | follow] = js.native
    
    var removeMissingValuesFrom: js.UndefOr[Body] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var skipThrowForStatus: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] with String = js.native
  }
  object HttpRequestOptionsrawtrueAgent {
    
    @scala.inline
    def apply(raw: js.UndefOr[Boolean] with `true`, url: js.UndefOr[String] with String): HttpRequestOptionsrawtrueAgent = {
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
      def setJson(value: js.Object | js.Array[_]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
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
      def setRaw(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
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
      def setUrl(value: js.UndefOr[String] with String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined zapier-platform-core.zapier-platform-core.HttpRequestOptions & {  url :string} */
  @js.native
  trait HttpRequestOptionsurlstri extends StObject {
    
    var agent: js.UndefOr[Agent] = js.native
    
    var body: js.UndefOr[String | Buffer | ReadableStream | js.Object] = js.native
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var follow: js.UndefOr[Double] = js.native
    
    var form: js.UndefOr[js.Object] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var json: js.UndefOr[js.Object | js.Array[_]] = js.native
    
    var method: js.UndefOr[HttpMethod] = js.native
    
    var params: js.UndefOr[js.Object] = js.native
    
    var raw: js.UndefOr[Boolean] = js.native
    
    var redirect: js.UndefOr[manual | error | follow] = js.native
    
    var removeMissingValuesFrom: js.UndefOr[Body] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var skipThrowForStatus: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] with String = js.native
  }
  object HttpRequestOptionsurlstri {
    
    @scala.inline
    def apply(url: js.UndefOr[String] with String): HttpRequestOptionsurlstri = {
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
      def setJson(value: js.Object | js.Array[_]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
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
      def setUrl(value: js.UndefOr[String] with String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
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
  
  @js.native
  trait IsFillingDynamicDropdown extends StObject {
    
    var isFillingDynamicDropdown: Boolean = js.native
    
    var isLoadingSample: Boolean = js.native
    
    var isPopulatingDedupe: Boolean = js.native
    
    var isTestingAuth: Boolean = js.native
    
    var limit: Double = js.native
    
    var page: Double = js.native
    
    var zap: js.UndefOr[Id] = js.native
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
  
  @js.native
  trait Parse extends StObject {
    
    /**
      * Acts a lot like regular `JSON.parse`, but throws a nice error for improper json input
      */
    def parse(text: String): js.Any = js.native
    
    def stringify(value: js.Any): String = js.native
    def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: String): String = js.native
    def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: Double): String = js.native
    def stringify(value: js.Any, replacer: js.Array[Double | String]): String = js.native
    def stringify(value: js.Any, replacer: js.Array[Double | String], space: String): String = js.native
    def stringify(value: js.Any, replacer: js.Array[Double | String], space: Double): String = js.native
    def stringify(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]
    ): String = js.native
    def stringify(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _],
      space: String
    ): String = js.native
    def stringify(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _],
      space: Double
    ): String = js.native
    def stringify(value: js.Any, replacer: Null, space: String): String = js.native
    def stringify(value: js.Any, replacer: Null, space: Double): String = js.native
    @JSName("stringify")
    var stringify_Original: FnCall = js.native
  }
  
  /* Inlined std.Partial<{  method :zapier-platform-core.zapier-platform-core.HttpMethod,   querystring :string,   headers :{[x: string] : string},   content :string}> */
  @js.native
  trait PartialmethodHttpMethodqu extends StObject {
    
    var content: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var method: js.UndefOr[HttpMethod] = js.native
    
    var querystring: js.UndefOr[String] = js.native
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
  @js.native
  trait PartialmethodHttpMethodquContent extends StObject {
    
    var content: js.UndefOr[StringDictionary[String]] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var method: js.UndefOr[HttpMethod] = js.native
    
    var querystring: js.UndefOr[StringDictionary[String]] = js.native
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
