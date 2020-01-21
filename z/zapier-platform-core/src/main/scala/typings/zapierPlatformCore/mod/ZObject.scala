package typings.zapierPlatformCore.mod

import typings.node.Buffer
import typings.std.Console_
import typings.std.ReadableStream
import typings.zapierPlatformCore.AnonCursor
import typings.zapierPlatformCore.AnonExpiredAuthError
import typings.zapierPlatformCore.AnonParse
import typings.zapierPlatformCore.AnonRaw
import typings.zapierPlatformCore.AnonRawTrue
import typings.zapierPlatformCore.AnonUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZObject extends js.Object {
  var JSON: AnonParse = js.native
  var console: Console_ = js.native
  var cursor: AnonCursor = js.native
  var errors: AnonExpiredAuthError = js.native
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
  def request(options: HttpRequestOptions with AnonRawTrue with AnonUrl): js.Promise[RawHttpResponse] = js.native
  def request(url: String): js.Promise[HttpResponse] = js.native
  def request(url: String, options: (HttpRequestOptions with AnonRaw) | HttpRequestOptions): js.Promise[RawHttpResponse] = js.native
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

