package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZObject extends js.Object {
  var JSON: zapierDashPlatformDashCoreLib.Anon_Parse = js.native
  var console: stdLib.Console = js.native
  var cursor: zapierDashPlatformDashCoreLib.Anon_Cursor = js.native
  var errors: zapierDashPlatformDashCoreLib.Anon_ExpiredAuthError = js.native
  @JSName("request")
  var request_Original: zapierDashPlatformDashCoreLib.Fn_Options = js.native
  /**
    * turns a file or request into a file into a publicly accessible url
    */
  @JSName("stashFile")
  var stashFile_Original: zapierDashPlatformDashCoreLib.Fn_ContentType = js.native
  def dehydrate[T](func: js.Function2[/* z */ this.type, /* bundle */ Bundle[T], _], inputData: js.Object): java.lang.String = js.native
  def generateCallbackUrl(): java.lang.String = js.native
  /**
    * Easily hash data using node's crypto package
    * @param algorithm probably 'sha256', see [this](https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options) for more options
    * @param data the data you want to hash
    * @param encoding defaults to 'hex'
    * @param input_encoding defaults to 'binary'
    */
  def hash(algorithm: java.lang.String, data: java.lang.String): java.lang.String = js.native
  def hash(algorithm: java.lang.String, data: java.lang.String, encoding: java.lang.String): java.lang.String = js.native
  def hash(
    algorithm: java.lang.String,
    data: java.lang.String,
    encoding: java.lang.String,
    input_encoding: java.lang.String
  ): java.lang.String = js.native
  def request(
    options: HttpRequestOptions with (zapierDashPlatformDashCoreLib.Anon_RawTrue | zapierDashPlatformDashCoreLib.Anon_Url)
  ): js.Promise[RawHttpResponse] = js.native
  def request(url: java.lang.String): js.Promise[HttpResponse] = js.native
  // most specific overloads go first
  def request(
    url: java.lang.String,
    options: (HttpRequestOptions with zapierDashPlatformDashCoreLib.Anon_Raw) | HttpRequestOptions
  ): js.Promise[RawHttpResponse] = js.native
  /**
    * turns a file or request into a file into a publicly accessible url
    */
  def stashFile(input: java.lang.String): java.lang.String = js.native
  def stashFile(input: java.lang.String, knownLength: scala.Double): java.lang.String = js.native
  def stashFile(input: java.lang.String, knownLength: scala.Double, filename: java.lang.String): java.lang.String = js.native
  def stashFile(
    input: java.lang.String,
    knownLength: scala.Double,
    filename: java.lang.String,
    contentType: java.lang.String
  ): java.lang.String = js.native
  /**
    * turns a file or request into a file into a publicly accessible url
    */
  def stashFile(input: js.Promise[java.lang.String]): java.lang.String = js.native
  def stashFile(input: nodeLib.Buffer): java.lang.String = js.native
  def stashFile(input: nodeLib.Buffer, knownLength: scala.Double): java.lang.String = js.native
  def stashFile(input: nodeLib.Buffer, knownLength: scala.Double, filename: java.lang.String): java.lang.String = js.native
  def stashFile(
    input: nodeLib.Buffer,
    knownLength: scala.Double,
    filename: java.lang.String,
    contentType: java.lang.String
  ): java.lang.String = js.native
  def stashFile(input: stdLib.ReadableStream[_]): java.lang.String = js.native
  def stashFile(input: stdLib.ReadableStream[_], knownLength: scala.Double): java.lang.String = js.native
  def stashFile(input: stdLib.ReadableStream[_], knownLength: scala.Double, filename: java.lang.String): java.lang.String = js.native
  def stashFile(
    input: stdLib.ReadableStream[_],
    knownLength: scala.Double,
    filename: java.lang.String,
    contentType: java.lang.String
  ): java.lang.String = js.native
}

