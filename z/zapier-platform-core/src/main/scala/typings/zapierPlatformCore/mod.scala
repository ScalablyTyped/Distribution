package typings.zapierPlatformCore

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.Agent
import typings.std.Console
import typings.std.Partial
import typings.std.ReadableStream
import typings.zapierPlatformCore.anon.Body
import typings.zapierPlatformCore.anon.CustomStoreKey
import typings.zapierPlatformCore.anon.Error
import typings.zapierPlatformCore.anon.Get
import typings.zapierPlatformCore.anon.HttpRequestOptionsrawtrue
import typings.zapierPlatformCore.anon.HttpRequestOptionsrawtrueAgent
import typings.zapierPlatformCore.anon.HttpRequestOptionsurlstri
import typings.zapierPlatformCore.anon.Id
import typings.zapierPlatformCore.anon.Inject
import typings.zapierPlatformCore.anon.IsBulkRead
import typings.zapierPlatformCore.anon.Parse
import typings.zapierPlatformCore.anon.PartialmethodHttpMethodqu
import typings.zapierPlatformCore.anon.PartialmethodHttpMethodquContent
import typings.zapierPlatformCore.zapierPlatformCoreStrings.error
import typings.zapierPlatformCore.zapierPlatformCoreStrings.follow
import typings.zapierPlatformCore.zapierPlatformCoreStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zapier-platform-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAppTester(appRaw: js.Object): js.Function2[
    /* func */ js.Function2[/* z */ ZObject, /* bundle */ Bundle[StringDictionary[Any]], Any | js.Promise[Any]], 
    /* bundle */ js.UndefOr[Partial[Bundle[StringDictionary[Any]]]], 
    js.Promise[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppTester")(appRaw.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* func */ js.Function2[/* z */ ZObject, /* bundle */ Bundle[StringDictionary[Any]], Any | js.Promise[Any]], 
    /* bundle */ js.UndefOr[Partial[Bundle[StringDictionary[Any]]]], 
    js.Promise[Any]
  ]]
  inline def createAppTester(appRaw: js.Object, options: CustomStoreKey): js.Function2[
    /* func */ js.Function2[/* z */ ZObject, /* bundle */ Bundle[StringDictionary[Any]], Any | js.Promise[Any]], 
    /* bundle */ js.UndefOr[Partial[Bundle[StringDictionary[Any]]]], 
    js.Promise[Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAppTester")(appRaw.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* func */ js.Function2[/* z */ ZObject, /* bundle */ Bundle[StringDictionary[Any]], Any | js.Promise[Any]], 
    /* bundle */ js.UndefOr[Partial[Bundle[StringDictionary[Any]]]], 
    js.Promise[Any]
  ]]
  
  object tools {
    
    @JSImport("zapier-platform-core", "tools")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("zapier-platform-core", "tools.env")
    @js.native
    def env: Inject = js.native
    inline def env_=(x: Inject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("env")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("zapier-platform-core", "version")
  @js.native
  val version: String = js.native
  
  type AppError = js.Error
  
  trait BaseHttpResponse extends StObject {
    
    def getHeader(key: String): js.UndefOr[String]
    
    var headers: StringDictionary[String]
    
    var request: HttpRequestOptions
    
    var skipThrowForStatus: Boolean
    
    var status: Double
    
    def throwForStatus(): Unit
  }
  object BaseHttpResponse {
    
    inline def apply(
      getHeader: String => js.UndefOr[String],
      headers: StringDictionary[String],
      request: HttpRequestOptions,
      skipThrowForStatus: Boolean,
      status: Double,
      throwForStatus: () => Unit
    ): BaseHttpResponse = {
      val __obj = js.Dynamic.literal(getHeader = js.Any.fromFunction1(getHeader), headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], skipThrowForStatus = skipThrowForStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], throwForStatus = js.Any.fromFunction0(throwForStatus))
      __obj.asInstanceOf[BaseHttpResponse]
    }
    
    extension [Self <: BaseHttpResponse](x: Self) {
      
      inline def setGetHeader(value: String => js.UndefOr[String]): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: HttpRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setSkipThrowForStatus(value: Boolean): Self = StObject.set(x, "skipThrowForStatus", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setThrowForStatus(value: () => Unit): Self = StObject.set(x, "throwForStatus", js.Any.fromFunction0(value))
    }
  }
  
  trait Bundle[InputData] extends StObject {
    
    var authData: StringDictionary[String]
    
    var cleanedRequest: js.UndefOr[PartialmethodHttpMethodquContent | Any] = js.undefined
    
    var inputData: InputData
    
    var inputDataRaw: StringDictionary[String]
    
    var meta: IsBulkRead
    
    var outputData: js.UndefOr[js.Object] = js.undefined
    
    var rawRequest: js.UndefOr[PartialmethodHttpMethodqu] = js.undefined
    
    var subscribeData: js.UndefOr[Id] = js.undefined
    
    var targetUrl: js.UndefOr[String] = js.undefined
  }
  object Bundle {
    
    inline def apply[InputData](
      authData: StringDictionary[String],
      inputData: InputData,
      inputDataRaw: StringDictionary[String],
      meta: IsBulkRead
    ): Bundle[InputData] = {
      val __obj = js.Dynamic.literal(authData = authData.asInstanceOf[js.Any], inputData = inputData.asInstanceOf[js.Any], inputDataRaw = inputDataRaw.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bundle[InputData]]
    }
    
    extension [Self <: Bundle[?], InputData](x: Self & Bundle[InputData]) {
      
      inline def setAuthData(value: StringDictionary[String]): Self = StObject.set(x, "authData", value.asInstanceOf[js.Any])
      
      inline def setCleanedRequest(value: PartialmethodHttpMethodquContent | Any): Self = StObject.set(x, "cleanedRequest", value.asInstanceOf[js.Any])
      
      inline def setCleanedRequestUndefined: Self = StObject.set(x, "cleanedRequest", js.undefined)
      
      inline def setInputData(value: InputData): Self = StObject.set(x, "inputData", value.asInstanceOf[js.Any])
      
      inline def setInputDataRaw(value: StringDictionary[String]): Self = StObject.set(x, "inputDataRaw", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: IsBulkRead): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setOutputData(value: js.Object): Self = StObject.set(x, "outputData", value.asInstanceOf[js.Any])
      
      inline def setOutputDataUndefined: Self = StObject.set(x, "outputData", js.undefined)
      
      inline def setRawRequest(value: PartialmethodHttpMethodqu): Self = StObject.set(x, "rawRequest", value.asInstanceOf[js.Any])
      
      inline def setRawRequestUndefined: Self = StObject.set(x, "rawRequest", js.undefined)
      
      inline def setSubscribeData(value: Id): Self = StObject.set(x, "subscribeData", value.asInstanceOf[js.Any])
      
      inline def setSubscribeDataUndefined: Self = StObject.set(x, "subscribeData", js.undefined)
      
      inline def setTargetUrl(value: String): Self = StObject.set(x, "targetUrl", value.asInstanceOf[js.Any])
      
      inline def setTargetUrlUndefined: Self = StObject.set(x, "targetUrl", js.undefined)
    }
  }
  
  type DehydrateFunc = js.Function2[
    /* func */ js.Function2[/* z */ ZObject, /* bundle */ Bundle[Any], Any], 
    /* inputData */ Any, 
    String
  ]
  
  type ExpiredAuthError = js.Error
  
  type HaltedError = js.Error
  
  // appTester always returns a promise
  // internal only
  // export const integrationTestHandler: () => any;
  // export const createAppHandler: (appRaw: object) => any
  /* Rewritten from type alias, can be one of: 
    - typings.zapierPlatformCore.zapierPlatformCoreStrings.GET
    - typings.zapierPlatformCore.zapierPlatformCoreStrings.POST
    - typings.zapierPlatformCore.zapierPlatformCoreStrings.PUT
    - typings.zapierPlatformCore.zapierPlatformCoreStrings.PATCH
    - typings.zapierPlatformCore.zapierPlatformCoreStrings.DELETE
    - typings.zapierPlatformCore.zapierPlatformCoreStrings.OPTIONS
    - typings.zapierPlatformCore.zapierPlatformCoreStrings.HEAD
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def DELETE: typings.zapierPlatformCore.zapierPlatformCoreStrings.DELETE = "DELETE".asInstanceOf[typings.zapierPlatformCore.zapierPlatformCoreStrings.DELETE]
    
    inline def GET: typings.zapierPlatformCore.zapierPlatformCoreStrings.GET = "GET".asInstanceOf[typings.zapierPlatformCore.zapierPlatformCoreStrings.GET]
    
    inline def HEAD: typings.zapierPlatformCore.zapierPlatformCoreStrings.HEAD = "HEAD".asInstanceOf[typings.zapierPlatformCore.zapierPlatformCoreStrings.HEAD]
    
    inline def OPTIONS: typings.zapierPlatformCore.zapierPlatformCoreStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.zapierPlatformCore.zapierPlatformCoreStrings.OPTIONS]
    
    inline def PATCH: typings.zapierPlatformCore.zapierPlatformCoreStrings.PATCH = "PATCH".asInstanceOf[typings.zapierPlatformCore.zapierPlatformCoreStrings.PATCH]
    
    inline def POST: typings.zapierPlatformCore.zapierPlatformCoreStrings.POST = "POST".asInstanceOf[typings.zapierPlatformCore.zapierPlatformCoreStrings.POST]
    
    inline def PUT: typings.zapierPlatformCore.zapierPlatformCoreStrings.PUT = "PUT".asInstanceOf[typings.zapierPlatformCore.zapierPlatformCoreStrings.PUT]
  }
  
  trait HttpRequestOptions extends StObject {
    
    var agent: js.UndefOr[Agent] = js.undefined
    
    var body: js.UndefOr[String | Buffer | ReadableStream[Any] | js.Object] = js.undefined
    
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
  object HttpRequestOptions {
    
    inline def apply(): HttpRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpRequestOptions]
    }
    
    extension [Self <: HttpRequestOptions](x: Self) {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBody(value: String | Buffer | ReadableStream[Any] | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
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
  
  trait HttpResponse
    extends StObject
       with BaseHttpResponse {
    
    var content: String
    
    var data: js.UndefOr[Any] = js.undefined
    
    var json: js.UndefOr[Any] = js.undefined
  }
  object HttpResponse {
    
    inline def apply(
      content: String,
      getHeader: String => js.UndefOr[String],
      headers: StringDictionary[String],
      request: HttpRequestOptions,
      skipThrowForStatus: Boolean,
      status: Double,
      throwForStatus: () => Unit
    ): HttpResponse = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], skipThrowForStatus = skipThrowForStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], throwForStatus = js.Any.fromFunction0(throwForStatus))
      __obj.asInstanceOf[HttpResponse]
    }
    
    extension [Self <: HttpResponse](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setJson(value: Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    }
  }
  
  trait RawHttpResponse
    extends StObject
       with BaseHttpResponse {
    
    var body: ReadableStream[Any]
    
    var content: Buffer
    
    var json: js.Promise[js.UndefOr[js.Object]]
  }
  object RawHttpResponse {
    
    inline def apply(
      body: ReadableStream[Any],
      content: Buffer,
      getHeader: String => js.UndefOr[String],
      headers: StringDictionary[String],
      json: js.Promise[js.UndefOr[js.Object]],
      request: HttpRequestOptions,
      skipThrowForStatus: Boolean,
      status: Double,
      throwForStatus: () => Unit
    ): RawHttpResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), headers = headers.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], skipThrowForStatus = skipThrowForStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], throwForStatus = js.Any.fromFunction0(throwForStatus))
      __obj.asInstanceOf[RawHttpResponse]
    }
    
    extension [Self <: RawHttpResponse](x: Self) {
      
      inline def setBody(value: ReadableStream[Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setJson(value: js.Promise[js.UndefOr[js.Object]]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  type RefreshAuthError = js.Error
  
  type ThrottledError = js.Error
  
  @js.native
  trait ZObject extends StObject {
    
    var JSON: Parse = js.native
    
    var console: Console = js.native
    
    var cursor: Get = js.native
    
    def dehydrate[T](func: js.Function2[/* z */ ZObject, /* bundle */ Bundle[T], Any], inputData: T): String = js.native
    
    def dehydrateFile[T](func: js.Function2[/* z */ ZObject, /* bundle */ Bundle[T], Any], inputData: T): String = js.native
    @JSName("dehydrateFile")
    var dehydrateFile_Original: DehydrateFunc = js.native
    
    @JSName("dehydrate")
    var dehydrate_Original: DehydrateFunc = js.native
    
    var errors: Error = js.native
    
    def generateCallbackUrl(): String = js.native
    
    /**
      * Easily hash data using node's crypto package
      * @param algorithm probably 'sha256', see [this](https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options) for more options
      * @param data the data you want to hash
      * @param encoding defaults to 'hex'
      * @param input_encoding defaults to 'binary'
      */
    def hash(algorithm: String, data: String): String = js.native
    def hash(algorithm: String, data: String, encoding: String): String = js.native
    def hash(algorithm: String, data: String, encoding: String, input_encoding: String): String = js.native
    def hash(algorithm: String, data: String, encoding: Unit, input_encoding: String): String = js.native
    
    def request(options: HttpRequestOptionsrawtrueAgent): js.Promise[RawHttpResponse] = js.native
    def request(options: HttpRequestOptionsurlstri): js.Promise[HttpResponse] = js.native
    def request(url: String): js.Promise[HttpResponse] = js.native
    def request(url: String, options: HttpRequestOptionsrawtrue): js.Promise[RawHttpResponse] = js.native
    def request(url: String, options: HttpRequestOptions): js.Promise[HttpResponse] = js.native
    
    /**
      * turns a file or request into a file into a publicly accessible url
      */
    def stashFile(input: String): String = js.native
    def stashFile(input: String, knownLength: Double): String = js.native
    def stashFile(input: String, knownLength: Double, filename: String): String = js.native
    def stashFile(input: String, knownLength: Double, filename: String, contentType: String): String = js.native
    def stashFile(input: String, knownLength: Double, filename: Unit, contentType: String): String = js.native
    def stashFile(input: String, knownLength: Unit, filename: String): String = js.native
    def stashFile(input: String, knownLength: Unit, filename: String, contentType: String): String = js.native
    def stashFile(input: String, knownLength: Unit, filename: Unit, contentType: String): String = js.native
    /**
      * turns a file or request into a file into a publicly accessible url
      */
    def stashFile(input: js.Promise[RawHttpResponse | String]): String = js.native
    def stashFile(input: Buffer): String = js.native
    def stashFile(input: Buffer, knownLength: Double): String = js.native
    def stashFile(input: Buffer, knownLength: Double, filename: String): String = js.native
    def stashFile(input: Buffer, knownLength: Double, filename: String, contentType: String): String = js.native
    def stashFile(input: Buffer, knownLength: Double, filename: Unit, contentType: String): String = js.native
    def stashFile(input: Buffer, knownLength: Unit, filename: String): String = js.native
    def stashFile(input: Buffer, knownLength: Unit, filename: String, contentType: String): String = js.native
    def stashFile(input: Buffer, knownLength: Unit, filename: Unit, contentType: String): String = js.native
    def stashFile(input: ReadableStream[Any]): String = js.native
    def stashFile(input: ReadableStream[Any], knownLength: Double): String = js.native
    def stashFile(input: ReadableStream[Any], knownLength: Double, filename: String): String = js.native
    def stashFile(input: ReadableStream[Any], knownLength: Double, filename: String, contentType: String): String = js.native
    def stashFile(input: ReadableStream[Any], knownLength: Double, filename: Unit, contentType: String): String = js.native
    def stashFile(input: ReadableStream[Any], knownLength: Unit, filename: String): String = js.native
    def stashFile(input: ReadableStream[Any], knownLength: Unit, filename: String, contentType: String): String = js.native
    def stashFile(input: ReadableStream[Any], knownLength: Unit, filename: Unit, contentType: String): String = js.native
  }
}
