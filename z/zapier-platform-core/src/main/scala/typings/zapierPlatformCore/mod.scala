package typings.zapierPlatformCore

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.httpMod.Agent
import typings.std.Console
import typings.std.Error
import typings.std.Partial
import typings.zapierPlatformCore.anon.Body
import typings.zapierPlatformCore.anon.CustomStoreKey
import typings.zapierPlatformCore.anon.Get
import typings.zapierPlatformCore.anon.HttpRequestOptionsrawtrue
import typings.zapierPlatformCore.anon.HttpRequestOptionsrawtrueAgent
import typings.zapierPlatformCore.anon.HttpRequestOptionsurlstri
import typings.zapierPlatformCore.anon.Id
import typings.zapierPlatformCore.anon.Inject
import typings.zapierPlatformCore.anon.IsFillingDynamicDropdown
import typings.zapierPlatformCore.anon.Parse
import typings.zapierPlatformCore.anon.PartialmethodHttpMethodqu
import typings.zapierPlatformCore.anon.PartialmethodHttpMethodquContent
import typings.zapierPlatformCore.zapierPlatformCoreStrings.error
import typings.zapierPlatformCore.zapierPlatformCoreStrings.follow
import typings.zapierPlatformCore.zapierPlatformCoreStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zapier-platform-core", "createAppTester")
  @js.native
  def createAppTester(appRaw: js.Object): js.Function2[
    /* func */ js.Function2[/* z */ ZObject, /* bundle */ Bundle[StringDictionary[_]], _ | js.Promise[_]], 
    /* bundle */ js.UndefOr[Partial[Bundle[StringDictionary[_]]]], 
    js.Promise[_]
  ] = js.native
  @JSImport("zapier-platform-core", "createAppTester")
  @js.native
  def createAppTester(appRaw: js.Object, options: CustomStoreKey): js.Function2[
    /* func */ js.Function2[/* z */ ZObject, /* bundle */ Bundle[StringDictionary[_]], _ | js.Promise[_]], 
    /* bundle */ js.UndefOr[Partial[Bundle[StringDictionary[_]]]], 
    js.Promise[_]
  ] = js.native
  
  object tools {
    
    @JSImport("zapier-platform-core", "tools")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("zapier-platform-core", "tools.env")
    @js.native
    def env: Inject = js.native
    @scala.inline
    def env_=(x: Inject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("env")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("zapier-platform-core", "version")
  @js.native
  val version: String = js.native
  
  type AppError = Error
  
  @js.native
  trait BaseHttpResponse extends StObject {
    
    def getHeader(key: String): js.UndefOr[String] = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var request: HttpRequestOptions = js.native
    
    var skipThrowForStatus: Boolean = js.native
    
    var status: Double = js.native
    
    def throwForStatus(): Unit = js.native
  }
  object BaseHttpResponse {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class BaseHttpResponseMutableBuilder[Self <: BaseHttpResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetHeader(value: String => js.UndefOr[String]): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: HttpRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipThrowForStatus(value: Boolean): Self = StObject.set(x, "skipThrowForStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowForStatus(value: () => Unit): Self = StObject.set(x, "throwForStatus", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Bundle[InputData] extends StObject {
    
    var authData: StringDictionary[String] = js.native
    
    var cleanedRequest: js.UndefOr[PartialmethodHttpMethodquContent | js.Any] = js.native
    
    var inputData: InputData = js.native
    
    var inputDataRaw: StringDictionary[String] = js.native
    
    var meta: IsFillingDynamicDropdown = js.native
    
    var outputData: js.UndefOr[js.Object] = js.native
    
    var rawRequest: js.UndefOr[PartialmethodHttpMethodqu] = js.native
    
    var subscribeData: js.UndefOr[Id] = js.native
    
    var targetUrl: js.UndefOr[String] = js.native
  }
  object Bundle {
    
    @scala.inline
    def apply[InputData](
      authData: StringDictionary[String],
      inputData: InputData,
      inputDataRaw: StringDictionary[String],
      meta: IsFillingDynamicDropdown
    ): Bundle[InputData] = {
      val __obj = js.Dynamic.literal(authData = authData.asInstanceOf[js.Any], inputData = inputData.asInstanceOf[js.Any], inputDataRaw = inputDataRaw.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bundle[InputData]]
    }
    
    @scala.inline
    implicit class BundleMutableBuilder[Self <: Bundle[_], InputData] (val x: Self with Bundle[InputData]) extends AnyVal {
      
      @scala.inline
      def setAuthData(value: StringDictionary[String]): Self = StObject.set(x, "authData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanedRequest(value: PartialmethodHttpMethodquContent | js.Any): Self = StObject.set(x, "cleanedRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanedRequestUndefined: Self = StObject.set(x, "cleanedRequest", js.undefined)
      
      @scala.inline
      def setInputData(value: InputData): Self = StObject.set(x, "inputData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputDataRaw(value: StringDictionary[String]): Self = StObject.set(x, "inputDataRaw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: IsFillingDynamicDropdown): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputData(value: js.Object): Self = StObject.set(x, "outputData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputDataUndefined: Self = StObject.set(x, "outputData", js.undefined)
      
      @scala.inline
      def setRawRequest(value: PartialmethodHttpMethodqu): Self = StObject.set(x, "rawRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawRequestUndefined: Self = StObject.set(x, "rawRequest", js.undefined)
      
      @scala.inline
      def setSubscribeData(value: Id): Self = StObject.set(x, "subscribeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribeDataUndefined: Self = StObject.set(x, "subscribeData", js.undefined)
      
      @scala.inline
      def setTargetUrl(value: String): Self = StObject.set(x, "targetUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUrlUndefined: Self = StObject.set(x, "targetUrl", js.undefined)
    }
  }
  
  type DehydrateFunc = js.Function2[
    /* func */ js.Function2[/* z */ ZObject, /* bundle */ Bundle[js.Any], js.Any], 
    /* inputData */ js.Object, 
    String
  ]
  
  type ExpiredAuthError = Error
  
  type HaltedError = Error
  
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
    
    @scala.inline
    def DELETE: typings.zapierPlatformCore.zapierPlatformCoreStrings.DELETE = "DELETE".asInstanceOf[typings.zapierPlatformCore.zapierPlatformCoreStrings.DELETE]
    
    @scala.inline
    def GET: typings.zapierPlatformCore.zapierPlatformCoreStrings.GET = "GET".asInstanceOf[typings.zapierPlatformCore.zapierPlatformCoreStrings.GET]
    
    @scala.inline
    def HEAD: typings.zapierPlatformCore.zapierPlatformCoreStrings.HEAD = "HEAD".asInstanceOf[typings.zapierPlatformCore.zapierPlatformCoreStrings.HEAD]
    
    @scala.inline
    def OPTIONS: typings.zapierPlatformCore.zapierPlatformCoreStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.zapierPlatformCore.zapierPlatformCoreStrings.OPTIONS]
    
    @scala.inline
    def PATCH: typings.zapierPlatformCore.zapierPlatformCoreStrings.PATCH = "PATCH".asInstanceOf[typings.zapierPlatformCore.zapierPlatformCoreStrings.PATCH]
    
    @scala.inline
    def POST: typings.zapierPlatformCore.zapierPlatformCoreStrings.POST = "POST".asInstanceOf[typings.zapierPlatformCore.zapierPlatformCoreStrings.POST]
    
    @scala.inline
    def PUT: typings.zapierPlatformCore.zapierPlatformCoreStrings.PUT = "PUT".asInstanceOf[typings.zapierPlatformCore.zapierPlatformCoreStrings.PUT]
  }
  
  @js.native
  trait HttpRequestOptions extends StObject {
    
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
    
    var url: js.UndefOr[String] = js.native
  }
  object HttpRequestOptions {
    
    @scala.inline
    def apply(): HttpRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpRequestOptions]
    }
    
    @scala.inline
    implicit class HttpRequestOptionsMutableBuilder[Self <: HttpRequestOptions] (val x: Self) extends AnyVal {
      
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
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait HttpResponse extends BaseHttpResponse {
    
    var content: String = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var json: js.UndefOr[js.Any] = js.native
  }
  object HttpResponse {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class HttpResponseMutableBuilder[Self <: HttpResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setJson(value: js.Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    }
  }
  
  @js.native
  trait RawHttpResponse extends BaseHttpResponse {
    
    var body: ReadableStream = js.native
    
    var content: Buffer = js.native
    
    var json: js.Promise[js.UndefOr[js.Object]] = js.native
  }
  object RawHttpResponse {
    
    @scala.inline
    def apply(
      body: ReadableStream,
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
    
    @scala.inline
    implicit class RawHttpResponseMutableBuilder[Self <: RawHttpResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: ReadableStream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: js.Promise[js.UndefOr[js.Object]]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  type RefreshAuthError = Error
  
  @js.native
  trait ZObject extends StObject {
    
    var JSON: Parse = js.native
    
    var console: Console = js.native
    
    var cursor: Get = js.native
    
    def dehydrate[T](func: js.Function2[/* z */ ZObject, /* bundle */ Bundle[T], _], inputData: js.Object): String = js.native
    
    def dehydrateFile[T](func: js.Function2[/* z */ ZObject, /* bundle */ Bundle[T], _], inputData: js.Object): String = js.native
    @JSName("dehydrateFile")
    var dehydrateFile_Original: DehydrateFunc = js.native
    
    @JSName("dehydrate")
    var dehydrate_Original: DehydrateFunc = js.native
    
    var errors: typings.zapierPlatformCore.anon.Error = js.native
    
    def generateCallbackUrl(): String = js.native
    
    /**
      * Easily hash data using node's crypto package
      * @param algorithm probably 'sha256', see [this](https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options) for more options
      * @param data the data you want to hash
      * @param encoding defaults to 'hex'
      * @param input_encoding defaults to 'binary'
      */
    def hash(algorithm: String, data: String): String = js.native
    def hash(algorithm: String, data: String, encoding: js.UndefOr[scala.Nothing], input_encoding: String): String = js.native
    def hash(algorithm: String, data: String, encoding: String): String = js.native
    def hash(algorithm: String, data: String, encoding: String, input_encoding: String): String = js.native
    
    def request(options: HttpRequestOptionsrawtrueAgent): js.Promise[RawHttpResponse] = js.native
    def request(options: HttpRequestOptionsurlstri): js.Promise[HttpResponse] = js.native
    def request(url: String): js.Promise[HttpResponse] = js.native
    def request(url: String, options: HttpRequestOptionsrawtrue): js.Promise[RawHttpResponse] = js.native
    def request(url: String, options: HttpRequestOptions): js.Promise[HttpResponse] = js.native
    
    /**
      * turns a file or request into a file into a publicly accessible url
      */
    def stashFile(input: String): String = js.native
    def stashFile(
      input: String,
      knownLength: js.UndefOr[scala.Nothing],
      filename: js.UndefOr[scala.Nothing],
      contentType: String
    ): String = js.native
    def stashFile(input: String, knownLength: js.UndefOr[scala.Nothing], filename: String): String = js.native
    def stashFile(input: String, knownLength: js.UndefOr[scala.Nothing], filename: String, contentType: String): String = js.native
    def stashFile(input: String, knownLength: Double): String = js.native
    def stashFile(input: String, knownLength: Double, filename: js.UndefOr[scala.Nothing], contentType: String): String = js.native
    def stashFile(input: String, knownLength: Double, filename: String): String = js.native
    def stashFile(input: String, knownLength: Double, filename: String, contentType: String): String = js.native
    /**
      * turns a file or request into a file into a publicly accessible url
      */
    def stashFile(input: js.Promise[RawHttpResponse | String]): String = js.native
    def stashFile(input: Buffer): String = js.native
    def stashFile(
      input: Buffer,
      knownLength: js.UndefOr[scala.Nothing],
      filename: js.UndefOr[scala.Nothing],
      contentType: String
    ): String = js.native
    def stashFile(input: Buffer, knownLength: js.UndefOr[scala.Nothing], filename: String): String = js.native
    def stashFile(input: Buffer, knownLength: js.UndefOr[scala.Nothing], filename: String, contentType: String): String = js.native
    def stashFile(input: Buffer, knownLength: Double): String = js.native
    def stashFile(input: Buffer, knownLength: Double, filename: js.UndefOr[scala.Nothing], contentType: String): String = js.native
    def stashFile(input: Buffer, knownLength: Double, filename: String): String = js.native
    def stashFile(input: Buffer, knownLength: Double, filename: String, contentType: String): String = js.native
    def stashFile(input: ReadableStream): String = js.native
    def stashFile(
      input: ReadableStream,
      knownLength: js.UndefOr[scala.Nothing],
      filename: js.UndefOr[scala.Nothing],
      contentType: String
    ): String = js.native
    def stashFile(input: ReadableStream, knownLength: js.UndefOr[scala.Nothing], filename: String): String = js.native
    def stashFile(
      input: ReadableStream,
      knownLength: js.UndefOr[scala.Nothing],
      filename: String,
      contentType: String
    ): String = js.native
    def stashFile(input: ReadableStream, knownLength: Double): String = js.native
    def stashFile(
      input: ReadableStream,
      knownLength: Double,
      filename: js.UndefOr[scala.Nothing],
      contentType: String
    ): String = js.native
    def stashFile(input: ReadableStream, knownLength: Double, filename: String): String = js.native
    def stashFile(input: ReadableStream, knownLength: Double, filename: String, contentType: String): String = js.native
  }
}
