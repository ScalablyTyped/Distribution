package typings.zapierDashPlatformDashCore.zapierDashPlatformDashCoreMod

import typings.node.Buffer
import typings.std.Console
import typings.std.ReadableStream
import typings.zapierDashPlatformDashCore.Anon_Cursor
import typings.zapierDashPlatformDashCore.Anon_ExpiredAuthError
import typings.zapierDashPlatformDashCore.Anon_Parse
import typings.zapierDashPlatformDashCore.Anon_Raw
import typings.zapierDashPlatformDashCore.Anon_RawTrue
import typings.zapierDashPlatformDashCore.Anon_Url
import typings.zapierDashPlatformDashCore.Fn_ContentType
import typings.zapierDashPlatformDashCore.Fn_Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZObject extends js.Object {
  var JSON: Anon_Parse = js.native
  var console: Console = js.native
  var cursor: Anon_Cursor = js.native
  var errors: Anon_ExpiredAuthError = js.native
  @JSName("request")
  var request_Original: Fn_Options = js.native
  /**
    * turns a file or request into a file into a publicly accessible url
    */
  @JSName("stashFile")
  var stashFile_Original: Fn_ContentType = js.native
  def dehydrate[T](func: js.Function2[/* z */ this.type, /* bundle */ Bundle[T], _], inputData: js.Object): String = js.native
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
  def request(options: HttpRequestOptions with (Anon_RawTrue | Anon_Url)): js.Promise[RawHttpResponse] = js.native
  def request(url: String): js.Promise[HttpResponse] = js.native
  // most specific overloads go first
  def request(url: String, options: (HttpRequestOptions with Anon_Raw) | HttpRequestOptions): js.Promise[RawHttpResponse] = js.native
  /**
    * turns a file or request into a file into a publicly accessible url
    */
  def stashFile(input: String): String = js.native
  def stashFile(input: String, knownLength: Double): String = js.native
  def stashFile(input: String, knownLength: Double, filename: String): String = js.native
  def stashFile(input: String, knownLength: Double, filename: String, contentType: String): String = js.native
  /**
    * turns a file or request into a file into a publicly accessible url
    */
  def stashFile(input: js.Promise[String]): String = js.native
  def stashFile(input: Buffer): String = js.native
  def stashFile(input: Buffer, knownLength: Double): String = js.native
  def stashFile(input: Buffer, knownLength: Double, filename: String): String = js.native
  def stashFile(input: Buffer, knownLength: Double, filename: String, contentType: String): String = js.native
  def stashFile(input: ReadableStream[_]): String = js.native
  def stashFile(input: ReadableStream[_], knownLength: Double): String = js.native
  def stashFile(input: ReadableStream[_], knownLength: Double, filename: String): String = js.native
  def stashFile(input: ReadableStream[_], knownLength: Double, filename: String, contentType: String): String = js.native
}

