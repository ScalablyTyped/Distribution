package typings.zapierPlatformCore.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.Console_
import typings.zapierPlatformCore.AnonError
import typings.zapierPlatformCore.AnonGet
import typings.zapierPlatformCore.AnonParse
import typings.zapierPlatformCore.HttpRequestOptionsrawtrue
import typings.zapierPlatformCore.HttpRequestOptionsrawtrueAgent
import typings.zapierPlatformCore.HttpRequestOptionsurlstri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZObject extends js.Object {
  var JSON: AnonParse = js.native
  var console: Console_ = js.native
  var cursor: AnonGet = js.native
  var errors: AnonError = js.native
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
  /**
    * turns a file or request into a file into a publicly accessible url
    */
  def stashFile(input: js.Promise[String]): String = js.native
  def stashFile(input: Buffer): String = js.native
  def stashFile(input: Buffer, knownLength: Double): String = js.native
  def stashFile(input: Buffer, knownLength: Double, filename: String): String = js.native
  def stashFile(input: Buffer, knownLength: Double, filename: String, contentType: String): String = js.native
  def stashFile(input: ReadableStream): String = js.native
  def stashFile(input: ReadableStream, knownLength: Double): String = js.native
  def stashFile(input: ReadableStream, knownLength: Double, filename: String): String = js.native
  def stashFile(input: ReadableStream, knownLength: Double, filename: String, contentType: String): String = js.native
}

